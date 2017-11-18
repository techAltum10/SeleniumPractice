package nov_11;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SelectValuesFromDropDown {
	WebDriver driver;
	String appUrl = "http://www.facebook.com";
	
	@Before
	public void openBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get(appUrl);
	}
	
	@Test
	public void naukriTestCase() throws Exception{
		//TC Logic
		driver.findElement(By.id("email")).sendKeys("adc@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("qwerd");
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		
		//Get page current url
		 String currentUrl = driver.getCurrentUrl();
		 
		 /*if(!appUrl.equals(currentUrl)){
			 System.out.println("Fail");
		 }
		 else{
			 System.out.println("Pass");
		 }*/
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}
}
