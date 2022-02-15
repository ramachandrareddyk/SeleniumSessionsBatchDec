package Constructor;

public class Employee {

	
	
			//Consroctor is a block
			//it will execute at the time of creating an object
			//constructor is like method/function but it will not return any athing no void
			//create constructor using class name
			
	String name;
	int age;
	int empid;
	double salary;
	char gender;
	
	// there is 2 types of constructors
	//1. default constructor
	
	/*
	 * public Employee() { System.out.println("This is my test..."); } //2.
	 * Parametarised constructor public Employee(int a) {
	 * System.out.println("this is mt test a.."+a); }
	 * 
	 * public Employee(int a, String b) {
	 * System.out.println("this is mt test a.."+a+b); }
	 */
	
	public Employee() {
		System.out.println("This is my default cons....");
	}
	public Employee(String name) {
		
		this.name=name;
		
	}
	
	public Employee(String name,int age) {
		this.name=name;
		this.age=age;
	}
	
	
	
	
	
	public static void main(String[] args) {
		
	Employee emp= new Employee();
	
	Employee emp2= new Employee("tom");
	System.out.println(emp.name);
	System.out.println(emp2.name);
	
	Employee emp3=new Employee("Peter",25);
	System.out.println(emp3.name);
	System.out.println(emp3.age);
	System.out.println(emp3.empid);
	}

}
