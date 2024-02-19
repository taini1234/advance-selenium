package TestNg;

import org.testng.annotations.Test;

//default value of priority is 0
//priority can be negative int too

public class PriorityTestng {
	@Test(priority = -1)
	public void register() {
		System.out.println("user is able to register");
	}
	@Test(priority = 2)
	public void login() {
		System.out.println("user is able to login");
	}
	@Test(priority =2)
	public void search() {
		System.out.println("user is able to search");
	}
	@Test(priority = 4)
	public void wishlist() {
		System.out.println("user is able to wishlist");
	}
	@Test(priority = 5)
	public void cart() {
		System.out.println("user is able to cart");
	}
	@Test(priority = 6)
	public void logout() {
		System.out.println("user is able to logout");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
