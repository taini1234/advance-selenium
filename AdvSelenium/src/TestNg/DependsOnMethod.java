package TestNg;

import org.testng.annotations.Test;

public class DependsOnMethod {
	@Test
	public void register() {
		
		System.out.println("user is able to register");
	}
	@Test(dependsOnMethods = "register")
	public void login() {
		System.out.println("user is able to login");
	}
	@Test(dependsOnMethods = "login")
	public void search() {
		System.out.println("user is able to search");
	}
	
	@Test(dependsOnMethods = "search")
	public void cart() {
		System.out.println("user is able to cart");
	}
	@Test(dependsOnMethods = "cart")
	public void logout() {
		System.out.println("user is able to logout");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
