package OopsConcept;

public class MethodOverLoading {

	public static void main(String[] args) {
		

		MethodOverLoading obj=new MethodOverLoading();
		
		obj.login();
		
		obj.login("Ramacchandra");//2
		
		obj.login(3500);//3
		
		
		obj.login("abc", "abc");//4
		
	}
	
	//Class having multiple methods with same
	//with different parameters//inputs
	// and Dif number of parameters
	
	
	public void login() {//1
		System.out.println("This is my login");
	}
	
	public void login(String username) {//2
		System.out.println("This is my login with user name");
	}
	
	public void login(int userId) {//3
		System.out.println("This is my login with user id");
	}
	
	public void login(String username, String password) {//4
		System.out.println("This is my login with user name and pass");
	}
	
	
	
	//
	
	public void productSearch(String Name) {
		System.out.println("search with product name");
	}
	
	public void productSearch(int price) {
		System.out.println("search with product price");
	}
	public void productSearch(String Name, int price) {
		System.out.println("search with product name and price");
	}
	
	public void productSearch(String Name, int price, int ram) {
		System.out.println("search with product name, price and Ram");
	}
	
	public void productSearch(String URL,int price,String camara) {
		System.out.println("search with product url, price and camara pixcels");
	}
	
	
	
	
	
	
	
	

}
