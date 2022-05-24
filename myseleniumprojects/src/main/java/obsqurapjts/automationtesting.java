package obsqurapjts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class automationtesting {
	WebDriver driver;
	@Test
	public void execute() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HOME\\Downloads\\chromedriver_101\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
	driver.get("http://demo.automationtesting.in/Register.html");
	
	WebElement firstname=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	firstname.sendKeys("sujitha");
	WebElement lastname=driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
	lastname.sendKeys("rabeesh");	
	WebElement address=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	address.sendKeys("makkat house");	
	WebElement email=driver.findElement(By.xpath("//input[@type='email' and @ng-model='EmailAdress']"));
	email.sendKeys("sujithamr90@gmail.com");	
	WebElement phone=driver.findElement(By.xpath("//input[@type='tel' and @ng-model='Phone']"));
	phone.sendKeys("9847569854");	
	WebElement gender=driver.findElement(By.xpath("//input[@value='FeMale']"));		
	gender.click();
	WebElement checkbox=driver.findElement(By.xpath("//input[@id='checkbox1']"));		
	checkbox.click();
	//Select lang=new Select(driver.findElement(By.xpath("input*[@id='msdd']")));
	//lang.selectByValue("English");
	Select skills=new Select(driver.findElement(By.xpath("//select[@id ='Skills'] " )));
	skills.selectByIndex(2);
	//Select country=new Select(driver.findElement(By.xpath("//select[@id='countries'] " )));
	//country.selectByIndex(2);
	//Select Scountry=new Select(driver.findElement(By.xpath("//*[@id='select2-country-container']  " )));
	//Scountry.selectByIndex(2);
	WebElement pass=driver.findElement(By.xpath("//input[@id='firstpassword']"));
	pass.sendKeys("sujithamr90@gmail.com");
	WebElement confirm=driver.findElement(By.xpath("//input[@id='secondpassword']"));
	confirm.sendKeys("sujithamr90@gmail.com");
	WebElement submit=driver.findElement(By.xpath("//button[@id='submitbtn']"));
	submit.click();
	//WebElement refresh=driver.findElement(By.xpath("//button[@id='Button1']"));
	//refresh.click();
		
}
	@Test(priority=2)
	public void ValidateRegisterPageLabels() throws InterruptedException
	{
	
		Boolean isnameofsitepresent = driver.findElement(By.xpath("//h1[contains(.,'Auto')]")).isDisplayed();
		Assert.assertTrue(isnameofsitepresent , "Name of site not present");
		
/*Boolean ispageheadingpresent = driver.findElement(By.xpath("//h2[starts-with(.,'Register')]")).isDisplayed();
		Assert.assertTrue(true, "Heading of page not present");
		
		Boolean isfullnamefieldpresent = driver.findElement(By.xpath("//label[text()='Full Name* ']")).isDisplayed();
		Assert.assertTrue(true, "Full Name field not present");
		
		Boolean isaddressfieldpresent = driver.findElement(By.xpath("//label[text()='Address']")).isDisplayed();
		Assert.assertTrue(true, "Address field not present");
		
		Boolean isemailfieldpresent = driver.findElement(By.xpath("//label[text()='Email address*']")).isDisplayed();
		Assert.assertTrue(true, "Email field not present");
}*/
}
}
