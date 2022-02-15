package Encapsulation;

public class Company {

	public String name;
	public int age;
	private int price;
	
	
	
	public void setPrice(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	
	
	public String getname() {
		return "Tom";
	}
	
	/*
	 * private int getPrice() { return 100; }
	 */
	
	
	public static void main(String[] args) {


		Company com= new Company();

		com.name="Java";
		com.age=25;
		com.price=35;
		System.out.println(com.name+" "+com.age+" "+com.price);
		
		System.out.println(com.getname());
	//System.out.println(com.getPrice1());
		
		
	}

}
