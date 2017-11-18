package nov_12_2;

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

public class HandleAjaxSuggestionList {
	
	WebDriver driver;
	
	@Before
	public void openBrowser(){
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
	}
	
	@Test
	public void login() throws Exception{
		//TC Logic
		
		//Type some string to search
		driver.findElement(By.id("lst-ib")).sendKeys("Java");
		Thread.sleep(2000);
		
		String a = "//html/body/div[1]/div[3]/form/div[2]/div[2]/div[1]/div[2]/div[2]/div[1]/div/ul/li[";
		int i = 1;
		String b = "]/div/div[2]";

		String xp = a + i + b;
		
		try{
			while(driver.findElement(By.xpath(xp)).isDisplayed()){
				xp = a + i + b;
				
				String text = driver.findElement(By.xpath(xp)).getText();
				System.out.println(text);
				
				//Click on specific text in list
				if(text.equalsIgnoreCase("javatpoint")){
					driver.findElement(By.xpath(xp)).click();
					break;
				}
				
				i++;
			}
		}
		catch(Exception ex){
			System.out.println("All elements has been read.");
		}
		
	}
	@After
	public void closeBrowser(){
		//driver.quit();
	}
}
