package seleniumbasics;

public class BrowserAndNavigationCommands extends Base {
	public void verifyBrowserCommands() {
		String title = driver.getTitle();
		System.out.println(title);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		String handleId = driver.getWindowHandle();
		System.out.println(handleId);
		String source = driver.getPageSource();
		System.out.println(source);
	}
	public void navigationCommands() {
		driver.navigate().to("https://www.amazon.ca/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserAndNavigationCommands browser = new BrowserAndNavigationCommands();
		browser.browserLaunch();
		browser.verifyBrowserCommands();
		browser.navigationCommands();
	}

}
