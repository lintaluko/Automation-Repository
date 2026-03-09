package seleniumbasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HandlingActions extends Base {

	public void verifyRightClick() {
		WebElement othersmenu = driver.findElement(By.id("others"));
		Actions act = new Actions(driver);
		act.contextClick(othersmenu).build().perform(); // contexClick is used for rightClick
		// build().perform() should be used for every action
	}

	public void verifyMouseHover() {
		WebElement othersmenu = driver.findElement(By.id("others"));
		Actions act = new Actions(driver);
		act.moveToElement(othersmenu).build().perform();

	}

	public void verifyDragandDrop() {
		driver.navigate().to("https://demoqa.com/droppable");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions act = new Actions(driver);
		act.dragAndDrop(drag, drop).build().perform();

	}
	public void dropDown() {
	//	driver.navigate().to("https://selenium.qabible.in/drag-drop.php");
		WebElement others=driver.findElement(By.id("others"));
		others.click();
		WebElement dragg=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		WebElement dropp =driver.findElement(By.id("mydropzone"));
		Actions act = new Actions(driver);
		act.dragAndDrop(dragg, dropp).build().perform();
	}

	public void verifyKeyboardActions() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL); // KeyEvent is a Class
		robot.keyPress(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_T);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HandlingActions actions = new HandlingActions();
		actions.browserLaunch();
		// actions.verifyRightClick();
		// actions.verifyMouseHover();
		// actions.verifyDragandDrop();
		//actions.dropDown();
		try {
			actions.verifyKeyboardActions();
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
