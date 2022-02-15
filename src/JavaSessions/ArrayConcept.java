package JavaSessions;

public class ArrayConcept {

	public static void main(String[] args) {
		
		int a=100;
		
		int b=200;
		/*
		 * System.out.println(b); b=300; System.out.println(b);
		 */
		
		
		//array is the collection of similar data type
		//in java array is the class
		//create an object
		
		//in array values will store in index basis
		//1 sts element of the array will store in 0th index, 2 element will store in 1st index
		
		//lowest inx of the array is =0
		//Highest index of the array is =length-1
		
		//2 types of array
		//1. static array
		//2. Dynamic array
		
		
		//---------------------------------------------------------
		
		//1. static array
		//int
		
		int i[] =new int[5];
		
		i[0]=120;
		i[1]=150;
		i[2]=200;
		i[3]=500;
		i[4]=1000;
		
		System.out.println(i[0]);//120
		System.out.println(i[3]);//500
		//System.out.println(i[5]);//ArrayIndexOutOfBoundsException:
		//System.out.println(i[-1]);//ArrayIndexOutOfBoundsException:
		
		System.out.println("LI = "+0);
		System.out.println(i.length);//5
		System.out.println(i.length-1);
		
		System.out.println(i[2]);
		System.out.println(i[4]);
		
		System.out.println("--------------------for loop--------------------");
		for(int j=0;j<i.length;j++) {
			System.out.println(i[j]);
		}
		
		System.out.println("--------------------for loop using ==--------------------");
		for(int j=0;j<=i.length-1;j++) {
			System.out.println(i[j]);
		}
		
		
		String names[]= new String[10];
		
		names[0]="tom";
		names[1]="peter";
		names[2]="Colin";
		names[3]="Phill";
		names[4]="Mike";
		
		//for each loop
		System.out.println("--------------------for each loop--------------------");
		for(String e:names) {
			System.out.println(e);
		}
		
		
		//double array
		double d[]=new double[2];
		d[0]=12.33;
		d[1]=100;
		System.out.println("--------------------for loop--------------------");
		for(int j=0;j<d.length;j++) {
			System.out.println(d[j]);
		}
		
		System.out.println("--------------------for each loop--------------------");
		for(double e:d) {
			System.out.println(e);
		}
		
		//char array
		System.out.println("--------------------Char array--------------------");
		char ch[]= new char[3];
		
		ch[0]='1';
		ch[1]='a';
		ch[2]='@';
		for(char e:ch) {
			System.out.println(e);
		}	
		
		//1. size is fixed : static array
		//2. We can store only similar data types
		
		//to over come the similar data types we have to use object array
		
		//object is the super class/ parent class for all the classes in java
		//we can store multiple data type vales
		
		
		
		System.out.println("---------------Object Array---------------------");
		Object empdata[]=new Object[5];
		
		empdata[0]="Tom";//String
		empdata[1]=30;//int
		empdata[2]=52000.35;//Double
		empdata[3]='M';// char
		empdata[4]=true;//boolian
		
		for(int j=0;j<empdata.length;j++) {
			System.out.println(empdata[j]);
		}
		
		System.out.println(empdata[2]);
		
		
		
		
		
		
		
		
		
		

	}

}
