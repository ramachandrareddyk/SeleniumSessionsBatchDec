package ExceptionHandling;

public class ThrowsKeyWord {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		ThrowsKeyWord obj= new ThrowsKeyWord();
		
		obj.m1();
		
	}
	

	public void m1() throws Exception{
		System.out.println("m1");
		m2();
	}
	public void m2() throws Exception{
		System.out.println("m2");
		m3();
	}
	public void m3() throws Exception {
		System.out.println("m3");
		m4();
	}
	public void m4() throws Exception{
		System.out.println("m4");
		int a=9/0;
	}

}
