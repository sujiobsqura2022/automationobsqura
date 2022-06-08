package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class xpathsample {
	WebDriver driver;
		@Test
		public void execute() throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\chromedriver_100\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.automationtesting.in/Register.html");
		
	
		//WebElement heading = driver.findElement(By.xpath("//h1[ contains(.,'Automati)]"));
		//String Exhead=heading.getText();
		//Assert.assertEquals(Exhead,"Automation Demo Site ","Wrong");
		Thread.sleep(2000);
		WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		firstname.sendKeys("sujitha");
		WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		lastname.sendKeys("rabeesh");	
		WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		address.sendKeys("makkat house");	
		WebElement email=driver.findElement(By.xpath("//input[@type='email' and @ng-model='EmailAdress']"));
		email.sendKeys("sujithamr90@gmail.com");	
		WebElement phone=driver.findElement(By.xpath("//input[@type='tel' and @ng-model='Phone']"));
		phone.sendKeys("9847693771");	
		WebElement gender=driver.findElement(By.xpath("//input[@value='FeMale']"));		
		gender.click();
		WebElement checkbox=driver.findElement(By.xpath("//input[@id='checkbox1']"));		
		checkbox.click();
		
		
		//Select lang=new Select(driver.findElement(By.xpath("//*[@id='msdd']")));
		//lang.selectByValue("English");
		//Select skills=new Select(driver.findElement(By.xpath("//select[@id ='Skills'] " )));
		//skills.selectByIndex(2);
		//Select country=new Select(driver.findElement(By.xpath("//*[@id='countries'] " )));
		//country.selectByIndex(2);
		//Select Scountry=new Select(driver.findElement(By.xpath("//*[@role='combobox'] " )));
		//Scountry.selectByIndex(2);
		WebElement pass=driver.findElement(By.xpath("//input[@id='firstpassword']"));
		pass.sendKeys("123456");
		WebElement confirm=driver.findElement(By.xpath("//input[@id='secondpassword']"));
		confirm.sendKeys("123456");
		WebElement submit=driver.findElement(By.xpath("//button[@id='submitbtn']"));
		submit.click();
		//WebElement refresh=driver.findElement(By.xpath("//button[@id='Button1']"));
		//refresh.click();
		
		
}
		@Test
		public void ValidatePageLabels() throws InterruptedException
		
		{
			
			//Boolean isnameofsite=driver.findElement(By.xpath("//h1[contains(.,'Auto')]")).isDisplayed();
			//Boolean isnameofsite = driver.findElement(By.xpath("//h1[contains(.,'Auto')]")).isDisplayed();
			//Assert.assertTrue(isnameofsite, "Name of site not present");
			
			Boolean ispageheadingpresent = driver.findElement(By.xpath("//h2[starts-with(.,'Register')]")).isDisplayed();
			Assert.assertTrue(ispageheadingpresent , "Heading of page not present");
			
			Boolean isfullnamefieldpresent = driver.findElement(By.xpath("//label[text()='Full Name* ']")).isDisplayed();
			Assert.assertTrue(isfullnamefieldpresent, "Full Name field not present");
			
			Boolean isaddressfieldpresent = driver.findElement(By.xpath("//label[text()='Address']")).isDisplayed();
			Assert.assertTrue(isaddressfieldpresent, "Address field not present");
			
			Boolean isemailfieldpresent = driver.findElement(By.xpath("//label[text()='Email address*']")).isDisplayed();
			Assert.assertTrue(isemailfieldpresent, "Email field not present");
			
			Boolean isphonefieldpresent = driver.findElement(By.xpath("//label[contains(.,'Phone*')]")).isDisplayed();
			Assert.assertTrue(isphonefieldpresent, "Phone field not present");
			
			Boolean isgenderfieldpresent = driver.findElement(By.xpath("//label[contains(.,'Gender*')]")).isDisplayed();
			Assert.assertTrue(isgenderfieldpresent, "Gender field not present");
			
			Boolean ishobbiesfieldpresent = driver.findElement(By.xpath("//label[contains(.,'Hobbies')]")).isDisplayed();
			Assert.assertTrue(ishobbiesfieldpresent, "Hobbies field not present");
			
			Boolean islanguagefieldpresent = driver.findElement(By.xpath("//label[starts-with(.,'Langu')]")).isDisplayed();
			Assert.assertTrue(islanguagefieldpresent, "Language field not present");

			Boolean isskillsfieldpresent = driver.findElement(By.xpath("//label[starts-with(.,'Skills')]")).isDisplayed();
			Assert.assertTrue(isskillsfieldpresent, "Skills field not present");
			
			Boolean isselectcountryfieldpresent = driver.findElement(By.xpath("//label[starts-with(.,'Sel')]")).isDisplayed();
			Assert.assertTrue(isselectcountryfieldpresent, "Country select field not present");
			
			Boolean isdobfieldpresent = driver.findElement(By.xpath("//label[starts-with(.,'Date')]")).isDisplayed();
			Assert.assertTrue(isdobfieldpresent, "DoB field not present");
			
			Boolean ispasswordfieldpresent = driver.findElement(By.xpath("//label[starts-with(.,'Password')]")).isDisplayed();
			Assert.assertTrue(ispasswordfieldpresent, "Password field not present");

		
}		
}

