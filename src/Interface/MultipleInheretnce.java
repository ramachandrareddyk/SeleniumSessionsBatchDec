package Interface;

public class MultipleInheretnce implements Bank, Drawable{

	public static void main(String[] args) {
		
		
		
		Bank b= new MultipleInheretnce();
		b.intrest();
		
		
		Drawable d1= new MultipleInheretnce();
		d1.draw();
		d1.m1();
		
		
		

	}

	@Override
	public void draw() {
		System.out.println("Draw Circle");
		
	}

	@Override
	public void m1() {
		System.out.println("This is M1");
		
	}

	@Override
	public void intrest() {
	System.out.println("Bank intrest rate");
		
	}

}
