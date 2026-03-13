package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this); // to use @FindBy
	}

	@FindBy(id = "user-name")
	WebElement usernamefield; // annotation provided by PageFactory
	@FindBy(id = "password")
	WebElement passwordbutton;
	@FindBy(id = "login-button")
	WebElement loginbutton;

	public void enterUserNameOnUserNameField(String username) {
		usernamefield.sendKeys(username);
	}

	public void enterPasswordOnPasswordField(String password) {
		passwordbutton.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginbutton.click();
	}

}
