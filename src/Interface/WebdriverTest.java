package Interface;

public class WebdriverTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Webdriver driver= new ChromeBrowser();
		
		driver.browserName();
		
		driver.browserVersion();
		
		driver.enterURL();
		
		
		Webdriver driver1= new FirefoxBrowser();
		driver1.browserName();
		
		driver1.browserVersion();
		
		driver1.enterURL();
	}

}
