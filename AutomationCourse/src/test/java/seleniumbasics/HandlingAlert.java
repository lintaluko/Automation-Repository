package seleniumbasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HandlingAlert extends Base {
	public void verifySimpleAlerts() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simplealert = driver.findElement(By.id("alertButton"));
		simplealert.click();
		Alert al = driver.switchTo().alert(); // switch to is used to shift from one web page to another
		al.accept();
	}

	public void verifyConfirmAlert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert=driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Alert al=driver.switchTo().alert();
		//al.accept();
		al.dismiss();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingAlert alerts = new HandlingAlert();
		alerts.browserLaunch();
		//alerts.verifySimpleAlerts();
		alerts.verifyConfirmAlert();
	}

}
