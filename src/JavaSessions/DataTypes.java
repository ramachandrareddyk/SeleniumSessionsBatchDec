package JavaSessions;

public class DataTypes {

	public static void main(String[] args) {
		
		//Primitive Data types - With out creating an object
		//non primitive data types - we can use only when object is created
		
		//Primitive Data types
		//1. Integer family
			//a. byte
			//b. Short
			//c. Long
			//d. int
		//2. Floating family
			//a. double 
			//b. float
		//3 character 
				//char
		//4 boolean
			//true or false
		
		
		
	//1. Integer family
		//a. byte	
		
		byte a =10;
		
		System.out.println(a);
		
		//range -128 to 127
		//1 byte=8 bits
		byte b=127;
		System.out.println(b);
		//byte= data type
		//a = variable name
		//=  Assignment operator
		//  10 value
		
	//b. Short
		
		short s = 150;
		System.out.println(s);
		short s1 =32767;
		System.out.println(s1);
		//range -32768 to 32767
		//2 byts= 16 bits
		
	//d. int
		
		int i = 10000;
		
		//range = -2^31 to 2^32
		//4 byts =32 bits
		
	//c. Long	
		
		long l = 1234567890;
		
		//range = up to 10 digits
		//8byts = 64 bits
		
	//2. Floating family
		//a. double 
		
		double d= 100.0;
		
		//range = 15 digits after decimal
		//8 byts =  64 bits
		
		//b. float
		
		float f = 100.0f;
		
		float f1= (float)125.0;
		
		//range 7 digits after decimal
		// 4 byts = 32 bits
		
		//3 character 
		//char
		 char c='G';
		
		char c1='1';
		
		char c2='#';
		
		char c3=' ';
		
		
		//4 boolean
		//true or false
		
		boolean b1=true;
		
		boolean b2=false;
		
		
		//non primitive data types
		
		//String
		//Arraylist
		//Array
		//Hashmap
		
		String str = "testing";
		System.out.println(str);
		String str1= "123456";
		System.out.println(str1);
		String str2= "Thiais my testing class 12345 !@#$%^^&";
		System.out.println(str2);
	}

}
