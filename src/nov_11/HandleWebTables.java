package nov_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class HandleWebTables extends LCB{

	@Test
	public void handleMultipleBrowserWindow() throws Exception{
		driver.get("http://www.indianrail.gov.in/tatkal_Scheme.html");
		Thread.sleep(2000);

		WebElement tatkalCharges = driver.findElement(By.xpath("//descendant::table[@class = 'MsoNormalTable'][2]/tbody"));
		
		List<WebElement> rowsInTable = tatkalCharges.findElements(By.tagName("tr"));
		
		System.out.println("Total rows are - " + rowsInTable.size());
		
		String a  = "//descendant::table[@class = 'MsoNormalTable'][2]/tbody/tr[";
		int i = 2;
		String b = "]/td";
		String c = "]/td[2]";
		
		String xpMinCharge = a + i + c;
		String xpClassOfTravel = a + i + b;
		
		for(i = 2; i<=rowsInTable.size(); i++){
			xpClassOfTravel = a + i + b;
			xpMinCharge = a + i + c;
			
			String classOfTravel = driver.findElement(By.xpath(xpClassOfTravel)).getText();
			System.out.println(classOfTravel);
			
			if(classOfTravel.equalsIgnoreCase("AC Chair Car")){
			
				String minCharges = driver.findElement(By.xpath(xpMinCharge)).getText();
				System.out.println(minCharges);
				break;
			}
		}
	}
}
