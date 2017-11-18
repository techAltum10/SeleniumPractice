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

public class IframeTest2 {
	
	WebDriver driver;
	
	@Before
	public void openBrowser(){
		driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html?org/openqa/selenium/interactions/Actions.html");
	}
	
	@Test
	public void login() throws Exception{
		//TC Logic
		//Click on 'ActiveSession' in left lower pane
		WebElement frame= driver.findElement(By.name("packageFrame"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//span[@class='interfaceName']")).click();
	}
	@After
	public void closeBrowser(){
		//driver.quit();
	}
}
