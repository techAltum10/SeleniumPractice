package nov_11;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class LoginTest extends LCB{

	@Test
	public void testLogin() throws Exception{
		
		WebElement signIn = driver.findElement(By.xpath("//div[@class = 'myAccountTab accountHeaderClass col-xs-13 reset-padding']"));
		
		//Mouse Over - SignIn
		Actions act = new Actions(driver);
		act.moveToElement(signIn);
		act.build().perform();
		Thread.sleep(1000);
		Reporter.log("Mouse over on SignIn" + "<br>");
		
		//Click on Login
		WebElement loginButton = driver.findElement(By.xpath("//span[@class = 'accountBtn btn rippleWhite']"));
		loginButton.click();
		Reporter.log("Click on Login button");
		
		//Take Screenshot
		File srcScreenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File seatScreenshot = new File("D:\\abc\\screenshot1.jpg");
		
		FileUtils.moveFile(srcScreenshot, seatScreenshot);
		
		//Enter Mobile Number
		//driver.f
	}
}
