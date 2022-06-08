package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;



public class asserttestng {
	@Test
	public void execute() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\chromedriver_100\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	String url="https://demoqa.com/text-box";
	driver.get(url);
	String geturl=driver.getCurrentUrl();

	Assert.assertEquals(geturl, url,"Wrong");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	WebElement name = driver.findElement(By.id("userName"));
name.sendKeys("Aishwarya");
	//String fullname=name.getText();
	//Assert.assertEquals(fullname,"Aishwarya","Wrong");
	
	
	WebElement email = driver.findElement(By.id("userEmail"));
	email.sendKeys("aishwarya@gmail.com");
	
	WebElement cur_add = driver.findElement(By.id("currentAddress"));
	cur_add.sendKeys("A.S.Villa\nKothamangaklam\nPothencode P.O");
	WebElement per_add = driver.findElement(By.id("permanentAddress"));
	per_add.sendKeys("Kailas House\nKailasam\nThirupach");
	Thread.sleep(2000);
	
	WebElement sub_btn = driver.findElement(By.className("btn-primary"));
	sub_btn.click();
	
}
}
