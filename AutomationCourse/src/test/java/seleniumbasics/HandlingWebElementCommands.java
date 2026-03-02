package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingWebElementCommands extends Base {
public void verifyWebElement() {
	driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
	WebElement msgbox = driver.findElement(By.id("single-input-field")); //The name of the WebElement should be similar to the element
	msgbox.sendKeys("Test Message");
	WebElement showbutton=driver.findElement(By.id("button-one"));
	showbutton.click();
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HandlingWebElementCommands commands =new HandlingWebElementCommands();
commands.browserLaunch();
commands.verifyWebElement();
	}

}
