package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class CheckingItemsInCart extends LCB{

	@Test
	public void testCheckingItemsInCart() throws Exception{
		
		//Click on cart
		WebElement cartButton = driver.findElement(By.xpath("//div[@class = 'cartContainer col-xs-11 reset-padding']"));
		cartButton.click();
		Thread.sleep(2000);
		Reporter.log("Click on cart");
		
		//Count items in cart
		WebElement totalItemsInCart = driver.findElement(By.xpath("//div[@class = 'cart-heading clearfix']"));
		Reporter.log("Total items in cart are - " + totalItemsInCart.getText());
	}
}
