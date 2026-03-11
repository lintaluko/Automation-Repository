package seleniumbasics;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MultipleWindowHandling extends Base{
	public void verifyMultipleWindow() {
		driver.navigate().to("https://demo.guru99.com/popup.php");
		String firstwindow = driver.getWindowHandle();
		WebElement clickhere =driver.findElement(By.xpath("//a[text()='Click Here']"));
		clickhere.click();
		Set<String> handleID=driver.getWindowHandles();
		Iterator<String> it = handleID.iterator();
		while (it.hasNext()) {
			String currentId =it.next(); 
			if(!currentId.equals(firstwindow)) {
				driver.switchTo().window(currentId);
				WebElement emailID= driver.findElement(By.name("emailid"));
				emailID.sendKeys("lintalukose2000@gmail.com");
				WebElement submit = driver.findElement(By.name("btnLogin"));
				submit.click();
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MultipleWindowHandling windows =new MultipleWindowHandling();
windows.browserLaunch();
windows.verifyMultipleWindow();
	}

}
