package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement; //web element is a predefined interface 

public class HandlingWebElementCommands extends Base {
	public void verifyWebElement() {
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement messgebox = driver.findElement(By.id("single-input-field")); // The name of the WebElement should be
																				// similar to the element
		messgebox.sendKeys("Test Message");
		WebElement showbutton = driver.findElement(By.id("button-one"));
		showbutton.click();
		WebElement yourmessage = driver.findElement(By.id("message-one"));
		System.out.println(yourmessage.getText()); // to get the given message
		messgebox.clear(); // to clear the given message

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingWebElementCommands commands = new HandlingWebElementCommands();
		commands.browserLaunch();
		commands.verifyWebElement();
	}

}
