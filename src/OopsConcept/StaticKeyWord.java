package OopsConcept;

public class StaticKeyWord {

	
	String name;
	static int age;
	
	
	
	public void sendMail() {
		System.out.println("This is my send mail method");
	}
	
	public static void getdMail() {
		System.out.println("This is my get mail method");
	}
	
	

	public static void main(String[] args) {
		int a=10;
		
		StaticKeyWord obj= new StaticKeyWord();
		
		obj.name="Tom";
		
		obj.sendMail();
		
		//How to access/call static variables and methods
		//1. By using class name
		
		StaticKeyWord.age=36;
		StaticKeyWord.getdMail();
		
		//2. Call directly 
		
		age=55;
		getdMail();
		
		//try to access using object
		obj.age=80;
		obj.getdMail();
		
		
	}

}
