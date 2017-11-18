package nov_11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.Test;

public class NaukriHomePage extends LCB{

	@Test
	public void handleMultipleBrowserWindow() throws Exception{
		driver.get("http://www.naukri.com");
		Thread.sleep(3000);
		
		Set<String> windods = driver.getWindowHandles();
		int totalOpenWindows = windods.size();
		System.out.println("Total open wondos are - " + totalOpenWindows);
		
		System.out.println(windods);
		
		//Extract values from Set and put into List
		List<String> myL = new ArrayList<String>();
		Iterator<String> Itr = windods.iterator();
		
		for(int i = 0; i<windods.size(); i++){
			myL.add(Itr.next());
		}
		
		//switch window
		driver.switchTo().window(myL.get(1));
		System.out.println(driver.getTitle());
		driver.close();
	}
}
