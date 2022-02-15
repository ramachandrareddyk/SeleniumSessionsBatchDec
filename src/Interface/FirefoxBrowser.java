package Interface;

public class FirefoxBrowser implements Webdriver{

	@Override
	public void browserVersion() {
		// TODO Auto-generated method stub
		System.out.println("the browser version is 96.4");
	}

	@Override
	public void browserName() {
		System.out.println("the browser name is FF");
		
	}

	@Override
	public void enterURL() {
		// TODO Auto-generated method stub
		System.out.println("https://www.flipcart.in");
	}

	@Override
	public void click() {
		System.out.println("Click");
		
	}

	@Override
	public void enterText() {
		System.out.println("enter text");
		
	}

}
