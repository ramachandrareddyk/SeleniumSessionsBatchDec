package OopsConcept;

public class ClassAndObject {

	
	//A class is a group of objects which have comman properties
	String name;
	int age;
	double Salary;
	boolean isActive;
	
	
	
	
	public static void main(String[] args) {
		
		
	
		ClassAndObject emp1 = new ClassAndObject();//RHS
		
		emp1.name="Tom";
		emp1.age=32;
		emp1.Salary=35000;
		emp1.isActive=true;
		
		System.out.println(emp1.name);
		System.out.println(emp1.age);
		System.out.println(emp1.Salary);
		System.out.println(emp1.isActive);
		
		ClassAndObject emp2=new ClassAndObject();
		emp2.name="peter";
		emp2.age=32;
		emp2.Salary=35000;
		emp2.isActive=true;
		
		System.out.println(emp2.name);
		System.out.println(emp2.age);
		System.out.println(emp2.Salary);
		System.out.println(emp2.isActive);
		
		new ClassAndObject();
		
		new ClassAndObject().name="Sanjay";
		new ClassAndObject().age=25;
		
		System.gc();
		
		
		
		
	}
	
	

}
