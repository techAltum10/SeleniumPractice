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

public class Annotations {
	
	WebDriver driver;
	
	@Before
	public void openBrowser(){
		
		String projectPath = System.getProperty("user.dir");
		
		//driver= new FirefoxDriver();
		
		//System.setProperty("webdriver.chrome.driver", "D:\\abc\\Backup_Sw_Files_Docs\\Drivers\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", projectPath + "/Drivers/chromedriver.exe");
													  //D:\abc\Sel_Projects\SnapDeal\Drivers\chromedriver.exe
		driver = new ChromeDriver();
		
		/*System.setProperty("webdriver.ie.driver", "path of IEDriverEXE");
		driver = new InternetExplorerDriver();*/
		
		//Headless browser
		
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
	}
	
	@Test
	public void login(){
		
		//Find More element
		WebElement more = driver.findElement(By.xpath("//div[text() = 'More']"));
		
		//Mouse Over = More   
		Actions actions = new Actions(driver);
		actions.moveToElement(more);
		actions.build().perform();  //Note
		
		//Click - MCA
		//driver.findElement(By.xpath("//a[tetxt() = 'MCA']")).click();
		
		WebElement mca = driver.findElement(By.xpath("//a[text() = 'MCA']"));
		mca.click();
	}
	@After
	public void closeBrowser(){
		driver.quit();
	}

}
