package Abstraction;

public class Honda extends Bike{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Honda h= new Honda();
		h.run();
		h.bike();
		
		Bike b= new Honda();
		
		b.run();
		b.bike();

	}

	
	public void run() {
		System.out.println("Running safely");

	}
	@Override
	public void bike() {
		System.out.println("This is chaild class method");
	}

}
