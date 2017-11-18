package nov_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class NaukriHomePage1 extends LCB{

	@Test
	public void handleMultipleBrowserWindow() throws Exception{
		driver.get("http://www.naukri.com");
		Thread.sleep(3000);
		
		//Mouse Over - More
		
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='More'] ")));
		act.build().perform();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[@title='MCA']")).click();
		
		Thread.sleep(2000);
		
		Set<String> Windows1=driver.getWindowHandles();
		int TotalOpenWindows=Windows1.size();
		System.out.println("Total open windows are:" + TotalOpenWindows);
		System.out.println(Windows1);
		
		List<String> myList=new ArrayList<String>();
		Iterator<String> itr=Windows1.iterator();
		for(int i=0;i<Windows1.size();i++)
		{
			myList.add(itr.next());
		}
		
		driver.switchTo().window(myList.get(2));
		System.out.println(driver.getTitle());
		driver.close();
		
		
		
	}
}
