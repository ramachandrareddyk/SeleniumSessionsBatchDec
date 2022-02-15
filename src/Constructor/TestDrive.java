package Constructor;

import java.util.ArrayList;

public class TestDrive {

	public static void main(String[] args) {
		
		
		
		
		CarDesign c1= new CarDesign("Aulto", "White", 3);
		
		System.out.println(c1.name);
		System.out.println(c1.color);
		System.out.println(c1.price);
		System.out.println(c1.isAvilable);
		
		CarDesign c2= new CarDesign("BMW", "RED", 30,10.5,true);

		System.out.println(c2.name);
		System.out.println(c2.color);
		System.out.println(c2.price);
		System.out.println(c2.mailage);
		System.out.println(c2.isElactric);
		
		ArrayList<String> featuersList= new ArrayList<String>();
		featuersList.add("Auto Start");//0
		featuersList.add("Auto Parking");//1
		featuersList.add("Sun roof");//2
		
		CarDesign c3=new CarDesign("Audi", "Black", 25, 12.5, false, 'Y', featuersList);
		System.out.println(c3.name);
		System.out.println(c3.color);
		System.out.println(c3.price);
		System.out.println(c3.mailage);
		System.out.println(c3.isElactric);
		System.out.println(c3.isAvilable);
		System.out.println(featuersList.get(0));
		for(String e:featuersList) {
			System.out.println(e);
		}
		
	}

}
