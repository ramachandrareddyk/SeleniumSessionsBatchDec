package ExceptionHandling;

public class ThrowKeyword {

	public static void main(String[] args) {


		
		
		
		
		String s= null;
		if(s==null) {
			System.out.println("Bye....");
			try {
				throw new Exception("Excel value there is no value");
			} catch (Exception e) {
				e.printStackTrace();
				
			}
		}

	}

}
