package seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownCheckboxRadiobutton extends Base {
	public void veryfyDropDown() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.id("dropdowm-menu-1"));
		Select select = new Select(dropdown);
		// select.selectByIndex(2);
		// select.selectByValue("c#");
		select.selectByVisibleText("SQL"); // use one method at a time

	}

	public void verifyCheckBox() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement checkbox = driver.findElement(By.xpath("//input[@value='option-2']"));
		checkbox.click();
		System.out.println(checkbox.isSelected()); // pre-defined Method

	}

	public void verifyRadioButton() {
		driver.navigate().to("https://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radiobutton = driver.findElement(By.xpath("//input[@value='green']"));
		radiobutton.click();
		System.out.println(radiobutton.isSelected());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingDropdownCheckboxRadiobutton drop = new HandlingDropdownCheckboxRadiobutton();
		drop.browserLaunch();
		drop.veryfyDropDown();
		drop.verifyCheckBox();
		drop.verifyRadioButton();
	}

}
