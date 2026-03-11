package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingFileUpload extends Base {
	public void verifyFileUploadUsingSendKeys() {
		driver.navigate().to("https://demo.guru99.com/test/upload/");
		WebElement fileupload = driver.findElement(By.id("uploadfile_0"));
		//sendKeys will click and open 
		fileupload.sendKeys("C:\\Users\\judet\\git\\Automation-Repository\\AutomationCourse\\src\\test\\resources\\Test-Case-Ideas-PDF.pdf");

	}

	public void verifyFileUploadUsingRobot() throws AWTException {
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement filepdf = driver.findElement(By.id("pickfiles"));
		filepdf.click();
		StringSelection string = new StringSelection("C:\\Users\\judet\\git\\Automation-Repository\\AutomationCourse\\src\\test\\resources\\Test-Case-Ideas-PDF.pdf");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(string, null);
		Robot r = new Robot();
		r.delay(2500);
		r.keyPress(KeyEvent.VK_ENTER); // clicking file name
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		HandlingFileUpload fileupload = new HandlingFileUpload();
		fileupload.browserLaunch();
		fileupload.verifyFileUploadUsingSendKeys();
		try {
			fileupload.verifyFileUploadUsingRobot();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
