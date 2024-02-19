package TestNg;

import org.testng.annotations.Test;
		//TO SKIP WE USE enabled:boolean
public class EnableSkip {
	@Test(priority = 1)
	public void register() {
		System.out.println("user is able to register");
	}
	@Test(priority = 2)
	public void openbrowser() {
		System.out.println("user is able to openbrowser");
	}
	@Test(priority =3)
	public void url() {
		System.out.println("user is able to enter url");
	}
	@Test(priority = 4)
	public void login() {
		System.out.println("user is able to login");
	}
	//if u give enable=false the method will be skipped
	@Test(enabled = false)
	public void logout() {
		System.out.println("user is able to logout");
	}
	

}
