package OopsConcept;

import java.util.ArrayList;

public class Company {

	
	public String getCeoName() {
		
		String CEO="Tom";
		
		return CEO;
	}
	
	public int EmployesscCount() {
		
		int age=50;
		int count=500;
		return count;
		
	}
	
	
	public void empData() {
		String name="Sachin";
		int age =32;
		double salary=25000.0;
		
	}
	
	public ArrayList<Object> empdata1() {
		ArrayList<Object> empdata= new ArrayList<Object>();
		
		empdata.add("Schain");
		empdata.add(25);
		empdata.add(25000);
		
		return empdata;
	}
	
	public String[] getCoFounders() {
		
		String[] founders=new String[3];
		founders[0]="Tom";
		founders[1]="Peter";
		founders[2]="Steve";
		
		return founders;
	}
	
	public ArrayList<String> getCustomerList() {
		
		ArrayList<String> customers= new ArrayList<String>();
		
		customers.add("Jon");
		customers.add("Hemu");
		customers.add("Anil");
		customers.add("Ravi");
		
		return customers;
	}
	
	
	

	public static void main(String[] args) {
		
		Company com= new Company();
		
		System.out.println(com.getCeoName());
		
		System.out.println(com.EmployesscCount());
		
		String[] cofounders=com.getCoFounders();
		for(String e:cofounders) {
			System.out.println(e);
		
		}
		
	
		ArrayList<String>ar= com.getCustomerList();
		
		for(String e:ar) {
			System.out.println(e);
		}
	}
	
	
	
	
	
	

}
