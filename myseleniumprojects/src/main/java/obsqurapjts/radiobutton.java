package obsqurapjts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class radiobutton {
	public static void main(String args[]) throws InterruptedException
	
	{

System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\chromedriver_101\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
	WebElement radio=driver.findElement(By.id("inlineRadio2"));
	radio.click();
	WebElement button=driver.findElement(By.id("button-one"));
	button.click();
	WebElement radio1=driver.findElement(By.id("inlineRadio21"));
	radio1.click();
	WebElement radio2=driver.findElement(By.id("inlineRadio23"));
	radio2.click();
	WebElement button1=driver.findElement(By.id("button-two"));
	button1.click();
	Thread.sleep(2000);
	
	}

}
