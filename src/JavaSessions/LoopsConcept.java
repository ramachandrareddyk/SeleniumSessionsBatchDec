package JavaSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		
		
		/*
		 * System.out.println("1"); System.out.println("2"); System.out.println("3");
		 */
		
		//While loop
		//for
		//do While loop
		
		
		//while loop
		
		//print 0 to 10 numbers
		int a=0; //initialization
		
		while(a<10) {// condition 1
			System.out.println(a); //statement//0 1 2....9
			
			a++;// increment or decrement
		}
		
		System.out.println("-------------------------------------");
		int b=0;
		while(b<=10) {// condition 1
			System.out.println(b); //statement//0 1 2....9
			
			//b++;// increment or decrement
			//b=b+1;
			++b;
		}
		
		System.out.println("----------------for loop--------------------");
		//for loop
		
		for(int c=0; c<=5;c++) {
			System.out.println(c);
		}
		
		
		for(int c=0; c<=100;c=c+10) {
			System.out.println(c);
		}
		
		/*
		 * for(;;) { System.out.println("hello....."); }
		 */
		System.out.println("----------------even numbers--------------------");
		//print even numbers
		for(int c=2;c<=100;c++) {
			if(c%2==0) {
				System.out.println(c+"This is even number");
			}
		}
		
		System.out.println("----------------odd numbers--------------------");
		//print odd numbers
		for(int c=2;c<=100;c++) {
			if(c%2==1) {
				System.out.println(c+"This is odd number");
			}
		}
		
		
		
		
		for(int c=0;c<=100;c++) {
			if(c%2==0) {
				System.out.println(c+"This is even number");
			} else {
				System.out.println(c+"This is odd number");
			}
		}
		
		//do while loop
		System.out.println("----------------do while loop--------------------");
		int r=1;
		do {
			System.out.println(r);
			r++;
		}while(r<=10);
		
		
		
		for(int z=100;z<=100;z++) {
			
		}
		
	}
	/*
	 * print prime numbers up to 100 Swaping 2 numbers with additional variable
	 * Swaping 2 numbers without additional variable
	 */
	
	/*
	 * int z=100; int y=200;
	 * 
	 * System.out.println(z);200 System.out.println(y);100
	 */
}
