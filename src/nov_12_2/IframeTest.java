package nov_12_2;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

public class IframeTest {
	
	WebDriver driver;
	
	@Before
	public void openBrowser(){
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com");
	}
	
	@Test
	public void login() throws Exception{
		//TC Logic
		
		WebElement signIn = driver.findElement(By.xpath("//span[@class = 'accountUserName col-xs-12 reset-padding']"));
		
		//Mouse Over - SignIn
		Actions act = new Actions(driver);
		act.moveToElement(signIn);
		act.build().perform();
		Thread.sleep(1000);
		
		//Click on = Login
		driver.findElement(By.xpath("//a[@href = 'https://www.snapdeal.com/login']")).click();
		Thread.sleep(1000);
		
		//Switch to IFrame
		WebElement loginFrame = driver.findElement(By.id("loginIframe"));
		driver.switchTo().frame(loginFrame);
		
		//To come back on default content
		//driver.switchTo().defaultContent();
		
		//Enter Mob Num.
		driver.findElement(By.id("userName")).sendKeys("9711235995");
		
		
		
	}
	@After
	public void closeBrowser(){
		//driver.quit();
	}
}
