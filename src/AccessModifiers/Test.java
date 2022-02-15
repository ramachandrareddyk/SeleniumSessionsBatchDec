package AccessModifiers;

public class Test {
	
	private int a;;
	int b;
	public int c;
	
	
	
	private void test1() {
		System.out.println("This is my private method");
	}
	
	void test2() {
		System.out.println("This is my default method");
	}
	
	public void test3() {
		System.out.println("This is my public method");
	}

	public static void main(String[] args) {
		
		// Access modifiers 4
		
		//private 
		//Default
		//Prtacted
		//public
		
		Test t= new Test();
		System.out.println(t.a=200);
		System.out.println(t.b=300);
		System.out.println(t.c=500);
		
		t.test1();
		t.test2();
		t.test3();
		
		
		
		
		
		
		
		
		

	}

}
