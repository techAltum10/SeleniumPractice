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
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class SelectValuesFromDropDown2 {
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
		//Select Values from dropdown
		
		//DAY
		WebElement dayDropDown = driver.findElement(By.id("day"));
		Select selectDay = new Select(dayDropDown);
		selectDay.selectByIndex(3);  //Day - 3
		
		//Month
		new Select(driver.findElement(By.id("month"))).selectByValue("3");
	}
	
	@After
	public void closeBrowser(){
		//driver.quit();
	}
}
