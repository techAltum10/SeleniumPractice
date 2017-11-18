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
import org.openqa.selenium.support.ui.Select;

public class DemoTest {
	//http://seletesting.blogspot.in/2013/06/identify-elements-in-selenium-hi-team.html
	WebDriver driver;
	@Before
	public void openBrowser(){
		//Open Browser
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		
		//Enter URL
		driver.get("http://www.naukri.com");
	}
	
	@Test
	public void naukriTestCase(){
		//TC Logic
		//Click on Search job txt box on home page
		driver.findElement(By.id("qsbClick")).click();
		System.out.println("Click on Search Job txt Box");
		
		//Enter Skills
		WebElement skillTxtBox = driver.findElement(By.name("qp"));
		if(skillTxtBox.isEnabled()){
			System.out.println("Skill text box is enable");
			
			skillTxtBox.sendKeys("Java");
			System.out.println("Enter Skill");
		}
		else{
			System.out.println("Skill text box is enable");
		}
		
		//Enter LOC
		driver.findElement(By.name("ql")).sendKeys("Noida");
		System.out.println("Enter Loc.");
		
		//Select Exp
		//new Select(driver.findElement(By.xpath("//input[@class = 'sdTxt w85']"))).selectByIndex(4);
		
		//Press Tab Key
		driver.findElement(By.name("ql")).sendKeys(Keys.TAB);
		System.out.println("Tab key is press.");
		
		//Press Arrow Down key
		WebElement exp = driver.findElement(By.xpath("//input[@class = 'sdTxt w85']"));
		for(int i = 0; i<6; i++){
			exp.sendKeys(Keys.ARROW_DOWN);
		}
		
		//Select Salary
		//descendant::input[@class = 'sdTxt w85'][2]
		
		//Click on Search
		driver.findElement(By.id("qsbFormBtn")).click();
		System.out.println("Click on Search button.");
		
		//Capture total no. of jobs
		String jobs = driver.findElement(By.xpath("//h1[@class = 'small_title']")).getText();
		System.out.println(jobs);
	}
	
	@After
	public void closeBrowser(){
		//driver.quit();
	}
}
