package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HOME\\Downloads\\chromedriver_100\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/select-input.php");
		Thread.sleep(2000);
		Select color=new Select(driver.findElement(By.id("single-input-field")));
		//color.selectByIndex(2);
		color.selectByValue("Red");
		Thread.sleep(2000);
		//color.selectByVisibleText("Green");
		Select color1=new Select(driver.findElement(By.id("multi-select-field")));
		//Select color1=new Select(driver.findElement(By.id("jhbhj")));
		//color1.deselectAll();
		color1.selectByValue("Red");
		color1.selectByValue( "Green");
		WebElement button=driver.findElement(By.id("button-all"));
		button.click();
		//color1.deselectByIndex(2);
		Thread.sleep(2000);
		color1.deselectByVisibleText("Red");
		//driver.close();
	}
	
	}


