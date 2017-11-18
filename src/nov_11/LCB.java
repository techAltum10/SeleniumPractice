package nov_11;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LCB {

	protected WebDriver driver;
	
	@BeforeMethod
	//public void launchBrowser(String browser){
	public void launchBrowser(){
		String browserDriverExePath = System.getProperty("user.dir"); 
		
		driver = new FirefoxDriver();
		
		/*System.setProperty("webdriver.chrome.driver", browserDriverExePath + "\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();*/
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}
	
	@AfterMethod
	public void quitBrowser(){
		//driver.quit();
	}
}
