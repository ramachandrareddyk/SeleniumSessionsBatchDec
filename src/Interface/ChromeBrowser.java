package Interface;

public class ChromeBrowser implements Webdriver{

	@Override
	public void browserVersion() {
		System.out.println("the browser version is 96.4");
		
	}

	@Override
	public void browserName() {
		System.out.println("the browser name is Chrome");
		
		
	}

	@Override
	public void enterURL() {
		System.out.println("https://www.amazon.in");
		
		
	}

	@Override
	public void click() {
		System.out.println("click");
		
		
	}

	@Override
	public void enterText() {
		System.out.println("enter text");
		
		
	}

}
