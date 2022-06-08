package com.selenium.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v100.page.Page;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Seleniumpgms {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\chromedriver_100\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	//driver.get("https://www.saucedemo.com/");
	driver.get("https://www.guru99.com/");
	driver.manage().window().maximize();
	Thread.sleep(2000);
	
	String title=driver.getTitle();//fetch the title of the current web page
	System.out.println("Title="+title);
	
	String url=driver.getCurrentUrl();//fetch the current URL of the WebPage
	System.out.println("Url="+url);
	
	String source=driver.getPageSource();//returns the source code of the current /WebPage loaded on the current browser
	System.out.println("Source="+source);
	
	driver.navigate().to("https://www.guru99.com/agile-testing-course.html");
	
	 title=driver.getTitle();
	 int tlength=driver.getTitle().length();
	 System.out.println("Length ="+ tlength);
	 System.out.println("Title="+title);
	 
	 url=driver.getCurrentUrl();
	 System.out.println("Url="+url);
	 if(url.equals("https://www.guru99.com/agile-testing-course.html"))
		 System.out.println("Verification successful");
	 else
		 System.out.println("Verification Failed");
		 
	
 source=driver.getPageSource();//storing page source in string variable
	System.out.println("Source="+source);
	
	int pagesourcelength=source.length();
	System.out.println("length of page source="+pagesourcelength);
	
	
	//driver.navigate().back();
	//driver.navigate().forward();
	//driver.navigate().refresh();
	//driver.manage().window().minimize();
	//Thread.sleep(2000);
	driver.manage().window().fullscreen();
	//Thread.sleep(2000);
	
	//
	driver.close();//terminate the current browser window operating by WebDriver at the current time.
	
	driver.quit();// terminate all windows operated but WebDriver.

	}

}
