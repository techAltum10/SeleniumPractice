package nov_12;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import nov_11.LCB;

public class UploadFile_AutoIT extends LCB{

	@Test
	public void AutoItTest() throws Exception{
		//TC Logic
		driver.get("http://convertonlinefree.com/PDFToWORDEN.aspx");
		
		//Click on "Choose File"
		driver.findElement(By.id("MainContent_fuDOCX")).click();
		Thread.sleep(2000);
		
		//Upload a File - Call .exe
		Process proc = Runtime.getRuntime().exec("D:\\abc\\UploadFile.exe");
		
		//Click on Convert
		Thread.sleep(1000);
		driver.findElement(By.id("MainContent_btnConvertDOCX")).click();
	}
}
