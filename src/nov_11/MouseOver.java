package nov_11;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseOver {
	//http://seletesting.blogspot.in/2013/06/identify-elements-in-selenium-hi-team.html
	//https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/interactions/Actions.html
	//https://github.com/SeleniumHQ/selenium/wiki/InternetExplorerDriver
	WebDriver driver;
	@Before
	public void openBrowser(){
		
		String Browserdrivers = System.getProperty("user.dir");
		System.out.println(Browserdrivers);
		
		//Open Browser
		//driver = new FirefoxDriver();
		
		System.setProperty("webdriver.ie.driver", Browserdrivers + "/Drivers/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		
		//System.setProperty("webdriver.chrome.driver", "D:\\abc\\Backup_Sw_Files_Docs\\Selenium_Files\\Chrome_Driver_04April2017\\chromedriver.exe");
		/*System.setProperty("webdriver.chrome.driver", Browserdrivers + "/Drivers/chromedriver.exe");
		driver = new ChromeDriver();*/
		
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.naukri.com");
	}
	
	@Test
	public void naukriTestCase() throws Exception{
		//TC Logic
		//Mouse Over - More
		WebElement more = driver.findElement(By.xpath("//div[text() = 'More']"));
		
		Actions act = new Actions(driver);
		act.moveToElement(more);
		act.build().perform();    //Pls Note
		Thread.sleep(1000);
		
		//Click on MCA
		driver.findElement(By.xpath("//a[@title = 'MCA']")).click();
	}
	
	@After
	public void closeBrowser(){
		driver.quit();
	}
}
