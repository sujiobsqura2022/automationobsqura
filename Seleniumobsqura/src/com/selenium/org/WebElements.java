package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElements 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\chromedriver_100\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
	//driver.get("https://selenium.obsqurazone.com/index.php");
		driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
	Thread.sleep(2000);
	//WebElement link=driver.findElement(By.linkText("Input Form"));
	//link.click();
	//WebElement link=driver.findElement(By.className("nav-item"));
	//link.click();
	WebElement Emessage=driver.findElement(By.id("single-input-field"));
	Emessage.sendKeys("Addition");
	WebElement button=driver.findElement(By.id("button-one"));
	button.click();
	WebElement Evalue1=driver.findElement(By.id("value-a"));
	Evalue1.sendKeys("10");
	WebElement Evalue2=driver.findElement(By.id("value-b"));
	Evalue2.sendKeys("50");
	WebElement total=driver.findElement(By.id("button-two"));
	total.click();
	}
	
}
