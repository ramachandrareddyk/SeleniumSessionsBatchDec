package Encapsulation;

public class WebdriverTest {
	
	public void launchBrowser(String browser) {
		if(browser.equalsIgnoreCase("chrome")) {
			launchChromeBrowser();
		} else if(browser.equalsIgnoreCase("ff")) {
			launchFFBrowser();
		} else if(browser.equalsIgnoreCase("ie")) {
			launchIEBrowser();
		} else {
			System.out.println("Please pass the correct browser");
		}
		
		
	}
	
	
	
	
	
	private static void launchChromeBrowser() {
		System.out.println("Check browser version");
		System.out.println("Check OS compatability");
		System.out.println("Check browser coockes");
	}
	
	private static void launchFFBrowser() {
		System.out.println("Check browser version");
		System.out.println("Check OS compatability");
		System.out.println("Check browser coockes");
	}
	
	private static void launchIEBrowser() {
		System.out.println("Check browser version");
		System.out.println("Check OS compatability");
		System.out.println("Check browser coockes");
	}
	
	
	
	
	
	
	
	
	
	

}
