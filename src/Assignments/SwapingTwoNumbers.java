package Assignments;

public class SwapingTwoNumbers {

	public static void main(String[] args) {
		
		//using additional variable
		int a=100;//200
		int b=200;//100
		
		
		int c=a;//100
		a=b;//200
		b=c;//100
		System.out.println(a);
		System.out.println(b);
		
		//With out additional variable
		
		int x=10;//20
		int y=20;//10
		
		x=x+y;//30
		y=x-y;//10
		x=x-y;//20
		
		System.out.println(x);//20
		
		System.out.println(y);//10
		
		
	}

}
