package Constructor;

import java.util.ArrayList;

public class CarDesign {
	
	String name;
	String color;
	int price;
	double mailage;
	boolean isElactric;
	char isAvilable;
	ArrayList<String> featuresList;
	
	public CarDesign(String name, String color, int price) {
		
		this.name = name;
		this.color = color;
		this.price = price;
	}

	public CarDesign(String name, String color, int price, double mailage, boolean isElactric) {
		
		this.name = name;
		this.color = color;
		this.price = price;
		this.mailage = mailage;
		this.isElactric = isElactric;
	}

	public CarDesign(String name, String color, int price, double mailage, boolean isElactric, char isAvilable,
			ArrayList<String> featuresList) {
		
		this.name = name;
		this.color = color;
		this.price = price;
		this.mailage = mailage;
		this.isElactric = isElactric;
		this.isAvilable = isAvilable;
		this.featuresList = featuresList;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
