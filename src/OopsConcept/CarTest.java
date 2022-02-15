package OopsConcept;

public class CarTest {
	
public static void main(String[] args) {
		
		Car c1=  new Car();
		c1.name="BMW";
		c1.price=50;
		c1.color="red";
		c1.model="2020";
		
		Car c2=  new Car();
		c2.name="Audi";
		c2.price=30;
		c2.color="Blue";
		c2.model="2018";
		
		Car c3=  new Car();
		c3.name="Honda";
		c3.price=20;
		c3.color="White";
		c3.model="2021";
		
		System.out.println(c1.name+" "+c1.price+" "+c1.color+" "+c1.model+" "+Car.wheels);
		System.out.println(c2.name+" "+c2.price+" "+c2.color+" "+c2.model+" "+Car.wheels);
		System.out.println(c3.name+" "+c3.price+" "+c3.color+" "+c3.model+" "+Car.wheels);
	}

}
