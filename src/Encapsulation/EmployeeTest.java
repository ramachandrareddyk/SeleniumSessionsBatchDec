package Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		
		emp.setAge(25);
		emp.setName("Tom");
		emp.setCity("BLR");
		emp.setState("KA");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getCity());
		System.out.println(emp.getState());

	}

}
