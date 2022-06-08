package com.selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Elementlocator {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\chromedriver_100\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		/*driver.get("https://www.saucedemo.com/");
		Thread.sleep(2000);
		WebElement uname=driver.findElement(By.id("user-name"));
		uname.sendKeys("problem_user");
		WebElement pwd=driver.findElement(By.id("password"));
		pwd.sendKeys("secret_sauce");
		WebElement button=driver.findElement(By.id("login-button"));
		button.click();*/
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement uname=driver.findElement(By.id("email"));
		uname.sendKeys("ascsa");
		WebElement pwd=driver.findElement(By.id("pass"));
		pwd.sendKeys("abcd");
		WebElement button=driver.findElement(By.name("login"));
		button.click();
		
}
}