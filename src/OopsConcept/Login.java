package OopsConcept;

public class Login {

	
	String Username;
	String Password;
	String Title;
	String URL;
	

	public static void main(String[] args) {
		
		
		Login google=new Login();
		
		google.Username="Admin";
		google.Password="12345";
		google.Title="Text";
		google.URL="www.abc.com";
		
		System.out.println(google.Username+" "+google.Password+"  "+google.Title+"  "+google.URL);
		
		Login amazon=new Login();
		amazon.Username="abc@abc.com";
		amazon.Password="test@123";
		
		System.out.println(amazon.Username+ "  "+amazon.Password);
		
		
		
		
		
		
		
	}

}
