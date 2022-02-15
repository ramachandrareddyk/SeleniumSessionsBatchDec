package JavaSessions;

public class StringConcatinations {

	public static void main(String[] args) {
		// String is group of characters
		//String is non primitive data type

		String s = "Testing";
		
		System.out.println(s);
		
		String s1="200";
		
		System.out.println(s1);
		
		
		
		int a=100;
		int b=200;
		
		
		System.out.println(a+b);
		
		
		String x= "Hello";
		
		String y= "Testing";
		
		System.out.println(x+y);
							//300hellotesting
		System.out.println(a+b+x+y);
							//hellotesting100+200
		System.out.println(x+y+a+b);//hello+testing+100200
		
		System.out.println(x+y+(a+b));
		
		
		
		
		double d1=12.33;
		double d2=23.33;
		
		System.out.println(d1+d2);//35.66
							//hello12.3323.33testing
		System.out.println(x+d1+d2+y);
							//112.33Hello20023.33testing
		System.out.println(a+d1+x+b+d2+y);//112.33hello20023.33testing
		
		
		String str="100";
		
		String str1="200";
		
		System.out.println(str+str1);
		
		System.out.println(str+a+b+str1);
		
		System.out.println(str+(a+d1+d2+b)+str1);//100
		
		
		char c1='a';
		char c2='b';
		
		System.out.println(c1);
		
		
		System.out.println(c1+c2);
		
		//a-z=97-122
		//A-Z=65-90
		//0-9=48-57
		

		
		
	}

}
