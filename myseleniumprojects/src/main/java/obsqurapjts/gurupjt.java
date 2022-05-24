package obsqurapjts;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class gurupjt {
	WebDriver driver;
	WebElement reset_btn, submit_btn;
	@Test
public void validateURLandTitle()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\chromedriver_101\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		driver.get("https://demo.guru99.com/insurance/v1/register.php");
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		Assert.assertEquals(url, "https://demo.guru99.com/insurance/v1/register.php" , "Wrong URL launched");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Insurance Broker System - Register");
	}
	@Test(priority = 2,enabled=true)
	public void validateRegisterLabelsAndOthers() {
		SoftAssert soft=new SoftAssert();
		//WebElement logo = driver.findElement(By.xpath("//img[@alt='Guru99 Demo Sites']"));
		// Javascript executor to check image
	   // Boolean isLogoPresent = (Boolean) ((JavascriptExecutor)driver) .executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + "&& arguments[0].naturalWidth > 0", logo);
	    //verify if status is true
	   // Assert.assertTrue(isLogoPresent , "Logo is not present");
	    
	    Boolean isSiteNamePresent = driver.findElement(By.xpath("//a[contains(.,'Demo')]")).isDisplayed();
		soft.assertTrue(isSiteNamePresent, "Site name is not displayed on the page");
		
		//Boolean isLoginBtnPresent = driver.findElement(By.linkText("Login")).isDisplayed();
		//Assert.assertTrue(isLoginBtnPresent, "Login button is not displayed");
		
		WebElement reset_btn = driver.findElement(By.xpath("//input[@id='resetform']"));
		Boolean isResetBtnPresent = reset_btn.isDisplayed();
		soft.assertTrue(isResetBtnPresent, "Reset button is not present on the page");
		
		WebElement submit_btn = driver.findElement(By.xpath("//input[@name='submit']"));
		Boolean isSubmitBtnPresent = submit_btn.isDisplayed();
		soft.assertTrue(isSubmitBtnPresent, "Submit button is not present on the page");
		
		Boolean isContentHeadingDisplayed = driver.findElement(By.xpath("//h1[contains(.,'Sign up a')]")).isDisplayed();
		soft.assertTrue(isContentHeadingDisplayed, "Content heading is not displayed");
		soft.assertAll();
	}
	
	@Test(priority = 3)
public void fillRegisterForm() {
		Select user_title =  new Select(driver.findElement(By.xpath("//select[@id='user_title']")));
		WebElement fname = driver.findElement(By.xpath("//input[@id='user_firstname']"));
		WebElement sur_name = driver.findElement(By.xpath("//input[@id='user_surname']"));
		WebElement phone = driver.findElement(By.xpath("//input[@id='user_phone']"));
		Select dob_year = new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_1i']")));
		Select dob_month = new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_2i']")));
		Select dod_date = new Select(driver.findElement(By.xpath("//select[@id='user_dateofbirth_3i']")));
		WebElement address = driver.findElement(By.xpath("//input[@id='user_address_attributes_street']"));
		WebElement city = driver.findElement(By.xpath("//input[@id='user_address_attributes_city']"));
		WebElement country = driver.findElement(By.xpath("//input[@id='user_address_attributes_county']"));
		WebElement postcode = driver.findElement(By.xpath("//input[@id='user_address_attributes_postcode']"));
		WebElement email = driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_email']"));
		WebElement pass = driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password']"));
		WebElement conf_pas = driver.findElement(By.xpath("//input[@id='user_user_detail_attributes_password_confirmation']"));
		
		user_title.selectByIndex(3);
		fname.sendKeys("Roshan");
		sur_name.sendKeys("Rosh");
		phone.sendKeys("4569871122");
		dob_year.selectByIndex(5);
		dob_month.selectByIndex(2);
		dod_date.selectByIndex(4);
		address.sendKeys("myStreet");
		city.sendKeys("myCity");
		country.sendKeys("india");
		postcode.sendKeys("685237");
		email.sendKeys("roshan@gmail.com");
		pass.sendKeys("archana");
		conf_pas.sendKeys("archana");
		
	}

@Test (priority = 4)
public void createNewUser() {
	fillRegisterForm();
	submit_btn.click();
}
}
