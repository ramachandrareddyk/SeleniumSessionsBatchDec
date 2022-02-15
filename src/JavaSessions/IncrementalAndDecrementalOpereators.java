package JavaSessions;

public class IncrementalAndDecrementalOpereators {

	public static void main(String[] args) {
	
		//incremental operators
			//1. post increment
			//2. Pre increment
		
		//1. post increment
		System.out.println("-----------post increment------------------");	
		int a=100;
		int b=a++;
		
		System.out.println(a);
		System.out.println(b);
		
		int x=5;
		int y=x++;//y==5 x=6
		
		System.out.println(x);
		System.out.println(y);
		
		
		System.out.println("-----------pre increment------------------");
		//2. Pre increment
		
		int c=5;
		int d=++c;
		
		
		System.out.println(c);
		System.out.println(d);
		
		int m=10;
		int n=++m;
		
		System.out.println(m);
		System.out.println(n);

		System.out.println("-----------Post Decrement------------------");
		//post decrement
		
		int i=10;
		int i1=i--;
		
		System.out.println(i);
		System.out.println(i1);
		
		System.out.println("-----------pre Decrement------------------");
		//pre decrement
		
		int e=10;
		int f=--e;
		
		
		System.out.println(e);
		System.out.println(f);
	}

}
