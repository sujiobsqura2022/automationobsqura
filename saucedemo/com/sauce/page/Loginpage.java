package com.sauce.page;
import java.io.File;

import javax.annotation.CheckForNull;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Loginpage {
	
	WebDriver driver;
	public Loginpage(WebDriver driver)
	{
		this.driver=driver;
	}
	@CheckForNull
	WebElement uname1;
	@FindBy(xpath="//input[@id='user-name']")
	WebElement pwd1;
	@FindBy(xpath="//input[@id='password']")
	WebElement login1;
	@FindBy(xpath="//input[@id='login-button']")
	WebElement EmptyErrorMessage1 ;
	@FindBy(xpath="//h3[contains(.,'Epic sadface: Username is required')]")
	WebElement InvalidErrorMessage1;
	@FindBy(xpath="//h3[contains(.,'Epic sadface: Username and password do not match any user in this service')]")
	WebElement ProductTitle1;
	@FindBy(xpath="//span[contains(.,'Products')]")
	
	
		By uname=By.xpath("//input[@id='user-name']");
		By pwd=By.xpath("//input[@id='password']");
		By login=By.xpath("//input[@id='login-button']");
		By EmptyErrorMessage=By.xpath("//h3[contains(.,'Epic sadface: Username is required')]");
		By InvalidErrorMessage=By.xpath("//h3[contains(.,'Epic sadface: Username and password do not match any user in this service')]");
		By ProductTitle=By.xpath("//span[contains(.,'Products')]");
		
		public void typeuser(String user)
		{
			driver.findElement(uname).sendKeys(user);
			driver.findElement(uname).clear();
		}
		public void typepwd(String user)
		{
			driver.findElement(pwd).sendKeys(user);
			driver.findElement(pwd).clear();
		}
		
		public void clicklogin()
		{
			driver.findElement(login).click();
			//driver.findElement(login).clear();
		}
		public boolean isEmptyErrorMsgDisplayed()
		{
			return driver.findElement(EmptyErrorMessage).isDisplayed();
		}
		public boolean InvalidErrorMessage()
		{
			return driver.findElement(InvalidErrorMessage).isDisplayed();
		}
		
		public boolean ProductTitle()
		{
			return driver.findElement(ProductTitle).isDisplayed();
		}
		
		
		}
		
	
	
