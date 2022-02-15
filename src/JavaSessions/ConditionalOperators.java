package JavaSessions;

public class ConditionalOperators {

	public static void main(String[] args) {
	
		
		//Mathamatical operators =+,-,*,/,%
		//Comaparision operators = <,>,<=,>=
		//Equal operators = ==,!=
		// Logical operators  &&(and), ||(or)
		
		int a=10;
		int b=20;
		
		System.out.println(a+b);
		
		int c=a+b;
		
		System.out.println(c);
		
		
		int d=a-b;
		
		System.out.println(d);
		
		int e=a*b;
		
		System.out.println(e);
		System.out.println("---------didvision---------------");
		int f=b/a;
		//if you use percentaile % 
		
		int g=b%a;
		System.out.println("g value is = "+g);
		
		System.out.println(f);
		
		
		float x=9f;
		
		float  y=2f;
		
		float z=y/x;
		System.out.println("z value is = "+z);
		
		float z1=y%x;
		
		System.out.println("z1 value is = "+z1);
		
		//int a1=9/0;
		
		//System.out.println(a1);
		
		
		
		//Comparison Operators
		
		System.out.println("---------------Comparison Operators---------------------");
		
		int i1=400;
		int i2=300;
		
		
		System.out.println(i1<i2);
		
		//if
		
		if(i1<i2) {
			
			System.out.println("i1 is the small value");
			
		}
		
		if(i1>i2) {
			System.out.println("i1 is the larg value");
		}
		
		//if else
		
		if(i1<i2) {
			System.out.println("i1 is the small value");
		} else {
			System.out.println("i2 is the small value");
		}
		//dead code
		if(false) {
			System.out.println("Hello");
		} else {
			System.out.println("Hii...");
		}
		
		//nested if
		
		int marks=60;
		
		if(marks>=50) {
			System.out.println("Pass");
			if(marks>=60) {
				System.out.println("grade A");
				if(marks>=80) {
					System.out.println("grade A++");
				}
			}
		}
		
		//if else if
		
		if(marks>=80) {
			System.out.println("grade a++");
		} else if(marks>=60) {
			System.out.println("grade a");
		}else if(marks>=50) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
		
		//
		
		String browser="chrome";
		
		if(browser.equals("Chrome")) {
			System.out.println("launch chrome broser");
		} else if(browser.equals("firefox")) {
			System.out.println("launch FF broser");
		} else if (browser.equals("Safari")) {
			System.out.println("Launch safari browser");
		} else if (browser.equals("ie")) {
			System.out.println("Launch IE browser");
		} else {
			System.out.println("Please pass the correct browser");
		}
		
		
		
		int ss =100;
		int ss1=1000;
		
		if(ss == ss1) {
			System.out.println("Both are equal");
		} 
		
		if(ss == ss1) {
			System.out.println("Both are equal");
		} else if(ss != ss1) {
			System.out.println("Both are not equal");
		}
		
		
		//logical operators
		// &&, ||
		int age=25;
		int age1=30;
		int age2=40;
			//true		+	true = true
			//false		+   true = false
			//false		+	false = false
		if(age<= age1 && age1==age2 ) {
			System.out.println("Testing pass....");
		} else {
			System.out.println("Testing fail....");
		}
		System.out.println("-----------------------------------------");
		//||
		
		if(age<= age1 || age1==age2 ) {
			System.out.println("Testing pass....");
		} else {
			System.out.println("Testing fail....");
		}
		
	//print highest number	
		int h=100;
		int h1=200;
		int h3=50;
		int h4=15;
		
		
		
	}

}
