package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchItem extends LCB{

	@Test
	public void testSearchItem() throws Exception{
		//Enter some string to search
		WebElement searchTextBox = driver.findElement(By.id("inputValEnter"));
		searchTextBox.sendKeys("Mobile");
		//System.out.println("Mobile is enter in search text box.");
		Reporter.log("Mobile is enter in search text box.");
		
		WebElement searchButton = driver.findElement(By.xpath("//button[@class = 'searchformButton col-xs-4 rippleGrey']"));
		searchButton.click();
		//System.out.println("Click on Search button.");
		Reporter.log("Click on Search button.");
		
		//capture all item numbers
	}
}
