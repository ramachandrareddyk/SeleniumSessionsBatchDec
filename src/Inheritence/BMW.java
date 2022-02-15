package Inheritence;

public class BMW extends Car{

	public static void main(String[] args) {
		
		BMW bm= new BMW();
		bm.wheels();
		bm.start();
		bm.stop();
		
		
		bm.price();
		bm.color();bm.engine();
		System.out.println(bm.a=100);
		System.out.println(bm.b);
		System.out.println(bm.a=300);
		System.out.println(bm.b);
	}
	//over raiding 
	@Override
	public void start() {
		System.out.println("BMW have auto start");
	}
	//we can not override static methods
	/*
	 * public void wheels() { System.out.println("this BMW wheels"); }
	 */
	//we can not able to over ride final methods
	/*
	 * public void m1() {
	 * 
	 * }
	 */
	
	
	public void color() {
		System.out.println("Blue");
	}
	
	public void price() {
		System.out.println("35 Laks");
	}
	
	public void engine() {
		System.out.println("1300 cc");
	}

}
