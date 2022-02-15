package OopsConcept;

public class MethodsInJava {

	public static void main(String[] args) {
		
		
		
		  MethodsInJava obj= new MethodsInJava();
		  
		  obj.test();
		  
		  int add=obj.add(); System.out.println(add);
		  System.out.println(obj.add());
		  
		  String name=obj.getTrainarName(); System.out.println(name);
		  
		  System.out.println(obj.getTrainarName());
		  
		  int aa=obj.sum(25, 30); System.out.println(aa);
		  
		  obj.sum(100, 200);
		 

	}
	//1. no input and no return
	//void- Does not return any thing (No need to write return key word)
	public void test() {
		System.out.println("This is testing methad...");
		
	}
	//Duplicate methods are not allowed
	/*
	 * public void test() {
	 * 
	 * }
	 */
	//2. no input with some return
	//return type is :int
	public int add() {
		System.out.println("This is add method");
		int a=10;
		int b=20;
		int c=a+b;//30
		
		return c;
	}
	
	public void add1() {
		System.out.println("This is add method");
		int a=10;
		int b=20;
		int c=a+b;//30
		System.out.println(c);
			
	}	
		
	
	
	//return type is : String
	public String getTrainarName() {
		System.out.println("This is get trainar name method");
		String trainer="Ram";
		
		return trainer;
	}
	
	//3. Some input and Some return
	public int sum(int a, int b) {
		System.out.println("This is sum method");
		int result=a+b;
		
		return result;
	}
	
	
	
	

}
