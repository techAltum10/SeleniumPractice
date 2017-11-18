package nov_12_2;

import java.util.List;

import org.apache.commons.exec.ExecuteException;
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

public class SelelctedTabTest {
	
	WebDriver driver;
	
	@Before
	public void openBrowser(){
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.onetravel.com");
	}
	
	@Test
	public void login() throws Exception{
		//TC Logic
		Thread.sleep(2000);
		
		//Close Popup
		driver.findElement(By.cssSelector("a[class = 'signupClose icon ic-cancel-fill']")).click();
		
		Thread.sleep(5000);
		 WebElement tabArea = driver.findElement(By.cssSelector("ul[class = 'landing-pg-nav col-md-4 col-lg-5']"));
		
		 List<WebElement> myL = tabArea.findElements(By.tagName("li"));
		
		 String flightTabclasValue = myL.get(0).getAttribute("class");
		System.out.println("Flight tab Class Attribute value is - " + flightTabclasValue);
		
		if(flightTabclasValue.contains("active")){
			System.out.println("Flight is selected");
		}
		else{
			System.out.println("Flight is not selected");
		}
		
		String hotelsClassValue = myL.get(1).getAttribute("class");
		if(hotelsClassValue.contains("active")){
			System.out.println("Hotels tab is selected");
		}
		else{
			System.out.println("Hotels tab is not selected");
		}
		
		/*
		//To check if Flight tab is selected
		WebElement flightTab = driver.findElement(By.xpath("//li[@class = 'nav-list main-nav-list hidden-xs hidden-sm active icon ic-arrow-up2']"));
		if(flightTab.isSelected()){
			System.out.println("Flight tab is selected.");
		}
		else{
			System.out.println("Flight tab is not selected.");
		}
		
		//To check if Hotels tab is selected
		WebElement hotelsTab = driver.findElement(By.xpath("//li[@class = 'nav-list main-nav-list hidden-xs hidden-sm']"));
		if(hotelsTab.isSelected()){
			System.out.println("Hotels tab is selected.");
		}
		else{
			System.out.println("Hotels tab is not selected.");
		}
		*/
	}
	@After
	public void closeBrowser(){
		//driver.quit();
	}
}
