package nov_12;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.sikuli.api.DesktopScreenRegion;
import org.sikuli.api.ImageTarget;
import org.sikuli.api.ScreenRegion;
import org.sikuli.api.Target;
import org.sikuli.api.robot.Keyboard;
import org.sikuli.api.robot.Mouse;
import org.sikuli.api.robot.desktop.DesktopKeyboard;
import org.sikuli.api.robot.desktop.DesktopMouse;
import org.testng.annotations.Test;

import nov_11.LCB;

public class UploadFile_Sikuli extends LCB{

	@Test
	public void AutoItTest() throws Exception{
		//TC Logic
		driver.get("http://convertonlinefree.com/PDFToWORDEN.aspx");
		
		//Scroll Window
		((JavascriptExecutor)driver).executeScript("scroll(0, 750);");
		
		//Click on "Choose File"
		driver.findElement(By.id("MainContent_fuDOCX")).click();
		Thread.sleep(2000);
		
		//Upload a File - Sikuli
		
		//Write File Name in Txt Box
		String fileNameImage = "D:\\abc\\FileName.jpg";
		File fileName = new File(fileNameImage);
		
		Target fileNameTarget = new ImageTarget(fileName);
		
		ScreenRegion screenReagon = new DesktopScreenRegion();
		ScreenRegion screenReagonFileName = screenReagon.find(fileNameTarget);
		
		//Type
		Keyboard keyboard = new DesktopKeyboard();
		keyboard.type("D:\\Selenium_Content_WEB_APPS.pdf");
		
		//====================================================
		
		String fileOpenButtonImage = "D:\\abc\\OpenButton.jpg";
		File fileOpenButton = new File(fileOpenButtonImage);
		
		Target openButtonTarget = new ImageTarget(fileOpenButton);
		
		ScreenRegion screenReasonOpenButton = screenReagon.find(openButtonTarget);
		
		//Click
		Mouse mouse = new DesktopMouse();
		mouse.click(screenReasonOpenButton.getCenter());
	}
}












