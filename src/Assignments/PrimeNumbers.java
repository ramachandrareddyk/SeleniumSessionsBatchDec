package Assignments;

public class PrimeNumbers {

	public static void main(String[] args) {
		
		
		for(int i=2;i<=10;i++) {
			for(int j=2;j<=i;j++) {
				
				if(i==j) {
					System.out.println(i);
				} if(i%j==0) {
					break;
				}
			}
		}
		
		
		
		
		
		

	}

}
