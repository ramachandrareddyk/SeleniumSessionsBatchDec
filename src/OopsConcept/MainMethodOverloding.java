package OopsConcept;

public class MainMethodOverloding {

	
	  public static void main(String[] args) {//1
	  System.out.println("This is my main method");
	  
	  main(25);
	  main(50,60);
	  }
	 	
	public static void main(int a) {//2
		System.out.println(a=50);
	}
	
	public static void main(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void main(char c) {
		System.out.println(c='Y');
	}
	

}
