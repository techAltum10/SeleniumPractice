package nov_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleDatePicker extends LCB{

	@Test
	public void handleMultipleBrowserWindow() throws Exception{
		driver.get("http://www.onetravel.com");
		Thread.sleep(2000);

		 //Close Popup
		 try{
			 WebElement popUp= driver.findElement(By.xpath("//a[@class=  'signupClose icon ic-cancel-fill']"));
			 popUp.click();
		 }
		 catch(Exception ex){
			 System.out.println("Popup not found");
		 }
		 
		 //Enter Origin
		 WebElement origin = driver.findElement(By.xpath("//input[@placeholder = 'From']"));
		 origin.clear();
		 origin.sendKeys("LAX");
		 Thread.sleep(3000);
		 origin.sendKeys(Keys.TAB);
		 
		 //Enter Destination
		 WebElement destination = driver.findElement(By.xpath("//input[@placeholder = 'To']"));
		 destination.clear();
		 destination.sendKeys("LAS");
		 Thread.sleep(3000);
		 destination.sendKeys(Keys.TAB);
		 
		 //Select Date
		 String a = "//div[@class = 'calendar__single-month']/ol/div[";
		 int i = 2;
		 String b = "]/li";

		 String xpCal = a + i + b;
		 
		 try{
			 for(i = 2; i<=42; i++){
				 xpCal = a + i + b;
				 
				 String calDate = driver.findElement(By.xpath(xpCal)).getText();
				 System.out.println(calDate);
			 }
		 }
		 catch(Exception ex){
			 System.out.println("No date found.");
		 }
	}
}
