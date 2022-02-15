package ExceptionHandling;

public class TryAndCatch {
	
	String name;

	public static void main(String[] args) {
		
		try {
		System.out.println("Hello");
		 
		TryAndCatch obj= new TryAndCatch();
		
		obj=null;
		//System.out.println(obj.name);
		
		 System.out.println("Hello");
		 System.out.println("Hello");
		 System.out.println("Hello");
		 int a=9/0;//arit
		 
		 
		} catch (Throwable e) {
			e.printStackTrace();
		} 
		System.out.println("Hello");
		 System.out.println("Hello");
		 System.out.println("Hello");
		 
		 
		 

	}

}
