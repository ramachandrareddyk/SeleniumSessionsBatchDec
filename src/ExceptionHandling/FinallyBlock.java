package ExceptionHandling;

public class FinallyBlock {

	
	final int b=200;
	
	public static void main(String[] args) {
		
		FinallyBlock obj= new FinallyBlock();
		System.out.println(obj.b);
		try {
			int a=9/0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		finally {
			System.out.println("Hello....");
		}
		//connection
		//SQL query
		
		//colse this connection
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
