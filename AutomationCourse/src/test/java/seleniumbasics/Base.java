package seleniumbasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;// predefined interface

	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.get("https://selenium.qabible.in/");
		driver.manage().window().maximize();

	}

	public void closeAndQuit() {
		// driver.close(); //close the latest window only
		driver.quit(); // close all the windows
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Base base = new Base();
		base.browserLaunch();
		base.closeAndQuit();
	}

}
