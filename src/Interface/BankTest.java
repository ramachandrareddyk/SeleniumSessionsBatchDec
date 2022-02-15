package Interface;

public class BankTest {

	public static void main(String[] args) {
	
		Bank b= new HDFC();
		b.intrest();
		
		Bank b1= new ICICI();
		b1.intrest();
		
		Bank b2= new PNB();
		b2.intrest();

	}

}
