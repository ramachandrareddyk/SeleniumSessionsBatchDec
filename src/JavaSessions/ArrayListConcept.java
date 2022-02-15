package JavaSessions;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		
		// Arraylist -----default class
		//dynamic array
		//size is not fixed
		//index basis
		// To create an array list we have to create an object of arraylist class
		
		
		ArrayList ar= new ArrayList();
		
		System.out.println(ar.size());//0
		
		ar.add(100);//0
		ar.add(200);//1
		ar.add(300);//2
		
		System.out.println(ar.size());//3
		
		ar.add("Tom");//3
		ar.add("Peter");//4
		
		System.out.println(ar.size());//5
		
		ar.add("Tom");//5
		ar.add("Peter");//6
		
		System.out.println(ar.size());//7
		
		ar.remove(3);
		
		System.err.println(ar.size());//6
		
		System.out.println(ar.get(3));
		
		//System.out.println(ar.get(6));IndexOutOfBoundsException:
		System.out.println("--------------------for loop to print all values from arraylist-------------------");
		for(int i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		
		//Genarics in java
		//int ---price list
		System.out.println("--------------------Genarics in java-------------------");
		ArrayList<Integer> priceList= new ArrayList<Integer>();
		
		System.out.println(priceList.size());
		
		priceList.add(200);
		priceList.add(299);
		priceList.add(399);
		priceList.add(499);
		System.out.println(priceList.size());
		for(Integer e:priceList) {
			System.out.println(e);
		}
		
		ArrayList<String> names= new ArrayList<String>();
		
		names.add("Tom");
		names.add("Peter");
		names.add("Phill");
		
		for(String e:names) {
			System.out.println(e);
		}
		
		System.out.println("--------------Object ArrayList------------------------");
		ArrayList<Object> empdata= new ArrayList<Object>();
		
		empdata.add("Mike");
		empdata.add(36);
		empdata.add(52000.00);
		empdata.add('M');
		empdata.add(true);
		
		for (int i = 0; i < empdata.size(); i++) {
			
			System.out.println(empdata.get(i));
			
		}
		
		for (int i = 0; i <= empdata.size()-1; i++) {
			
			System.out.println(empdata.get(i));
			
		}
		
		//use case in selenium
		//Links in web page
		//to collect all the links we have to use an arryList
		//Start for loop
		//if(ele.text().equals("Flipkart"));
		//click();
		//break;
		
		System.out.println("------------------Selenium usecase-------------------");
		ArrayList<String> links= new ArrayList<String>();
		links.add("Flipkart");
		links.add("Top offers");
		links.add("Grocery");
		links.add("Mobile");
		links.add("Fashion");
		
		for(int i=0;i<links.size();i++) {
			if(links.get(i).equals("Mobile")) {
				System.out.println(links.get(i));
				break;
			}
		}

	}
	
	//Assignments
	//1. Write a java program to create a new array and add some colors and print all the colors using loop
	//2. Write java program to create a new arrya and remove values from array

}
