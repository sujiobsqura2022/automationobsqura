package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class testnglogin 
{
	WebDriver driver;
	@Test
	public void validateUrlandTitle() throws InterruptedException
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\chromedriver_100\\chromedriver.exe");
	 driver=new ChromeDriver();
	String launchUrl= "https://www.saucedemo.com/";
	String uname="problem_user";
	String pwd="secret_sauce";
	driver.get(launchUrl);
	String actualurl=driver.getCurrentUrl();
	Assert.assertEquals(actualurl,launchUrl, "false");
	String title="Swag Labs";
	String actual=driver.getTitle();
	Assert.assertEquals(actual,title, "false");
	}
	
	@Test
	public void validateloginpagefield()
	{
	Boolean isUsernamePresent =driver.findElement(By.id("user-name")).isDisplayed();
	Assert.assertTrue(isUsernamePresent, "username isnot present");
	
	Boolean isPasswordPresent =driver.findElement(By.id("password")).isDisplayed();
	Assert.assertTrue(isPasswordPresent, "password isnot present");
	
	Boolean isButtonPresent =driver.findElement(By.id("login-button")).isDisplayed();
	Assert.assertTrue(isButtonPresent, "button is not present");
	}
	@Test
	public void validateLogin()
	{
	WebElement uname=driver.findElement(By.id("user-name"));
	uname.sendKeys("standard_user");
	WebElement pwd=driver.findElement(By.id("password"));
	pwd.sendKeys("secret_sauce");
	WebElement button=driver.findElement(By.id("login-button"));
	button.click();
	WebElement logo=driver.findElement(By.className("app_logo"));
	//Boolean isLogo
	
	}


}



