package testscript;

import java.io.IOException;
import org.testng.annotations.Test;

import pages.LoginPage;
import seleniumbasics.TestNGBase;
import utilities.ExcelUtility;

public class LoginTest extends TestNGBase {
	@Test
	public void verifyUserLoginWithValidCredentials() throws IOException {
		//WebElement usernamefield = driver.findElement(By.id("user-name"));
		//username.sendKeys("standard_user");
		//WebElement passwordbutton = driver.findElement(By.id("password"));
		//password.sendKeys("secret_sauce");
		//WebElement loginbutton = driver.findElement(By.id("login-button"));
		//login.click();
		String username=ExcelUtility.readStringData(0, 0, "LoginPage");
		String password=ExcelUtility.readStringData(0, 1, "LoginPage");
		LoginPage login= new LoginPage(driver);
		login.enterUserNameOnUserNameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickOnLoginButton();
			
	}
@Test
	public void verifyUserLoginWithValidUserNameandInvalidPassword() throws IOException {
	String username=ExcelUtility.readStringData(1, 0, "LoginPage");
	String password=ExcelUtility.readStringData(1, 1, "LoginPage");
	LoginPage login= new LoginPage(driver);
	login.enterUserNameOnUserNameField(username);
	login.enterPasswordOnPasswordField(password);
	login.clickOnLoginButton();
		
		
	}
@Test
	public void verifyUserLoginWithInValidUserNameandvalidPassword() throws IOException {
	String username=ExcelUtility.readStringData(2, 0, "LoginPage");
	String password=ExcelUtility.readStringData(2, 1, "LoginPage");
	LoginPage login= new LoginPage(driver);
	login.enterUserNameOnUserNameField(username);
	login.enterPasswordOnPasswordField(password);
	login.clickOnLoginButton();
		
	}
@Test
	public void verifyUserLoginWithInValidCredentials() throws IOException {
	String username=ExcelUtility.readStringData(3, 0, "LoginPage");
	String password=ExcelUtility.readStringData(3, 1, "LoginPage");
	LoginPage login= new LoginPage(driver);
	login.enterUserNameOnUserNameField(username);
	login.enterPasswordOnPasswordField(password);
	login.clickOnLoginButton();
		
}
}
