package com.sauce.test;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.sauce.page.Loginpage;
	public class LoginTest {

	WebDriver driver;
	Loginpage lp;


	@BeforeTest
	public void lauch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\chromedriver_101\\chromedriver.exe");
	    driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
	}
	//verify user is unable to enter the fields
	@Test(priority=0)
	public void verifyEmptyLogin() throws InterruptedException
	{
		lp=new Loginpage(driver);
		lp.typeuser("");
		lp.typepwd(" ");
		lp.clicklogin();
		Assert.assertTrue(lp.isEmptyErrorMsgDisplayed(),"Empty error message is not displayed");
		
	}
	//verify user is able to login with wrong username to enter the fields
		@Test(priority=1)
	public void verifyInvalidLogin() throws InterruptedException
	{
		lp.typeuser("stan");
		lp.typepwd("secret");
		lp.clicklogin();
		Assert.assertTrue(lp.InvalidErrorMessage(),"Inalid error message is not displayed");	
		Thread.sleep(3000);
	}
		//verify user is able to login with  username and password
		@Test(dataProvider="Credentials")
	public void verifyvalidLogin() throws InterruptedException
			{
			lp=new Loginpage(driver);
		lp.typeuser("standard_user");
		lp.typepwd("secret_sauce");
		lp.clicklogin();
		Assert.assertTrue(lp.ProductTitle(),"Inventory page not displayed");	
			driver.navigate().back();
		
			}
		@DataProvider(name="Credentials")
		public Object[][] getData()
		{
			Object[][] data=new Object[4][2];
			data[0][0]="standard_user";
			data[0][1]="secret_sauce";
			data[1][0]="locked_out_user";
			data[1][1]="secret_sauce";
			data[2][0]="problem_user";
			data[2][1]="secret_sauce";
			data[3][0]="performance_glitch_user";
			data[3][1]="secret_sauce";
			return data;
		}
		
		@Test
		public void capturePageScreenshot() throws IOException {
		/*TakesScreenshot interface enables the Selenium WebDriver to take a screenshot and store it in different ways. 
		 * "getScreenshotAs()" method captures the screenshot and store it in the specified location.*/
		     File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		     FileHandler.copy(src, new File("PageScreenshot.png"));
		}
				@AfterTest
				public void quit() 
				{
					//driver.close();
				}
	}

