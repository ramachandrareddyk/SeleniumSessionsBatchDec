package Encapsulation;

public class CompanyTest {

	public static void main(String[] args) {


		Company com= new Company();
		com.age=25;
		com.getname();
		com.setPrice(5000);
		System.out.println(com.getPrice());
		
		com.setPrice(10000);
		System.out.println(com.getPrice());
	}

}
