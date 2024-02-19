package TestNg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Basic {//test case id

	@Test
	public void demo()//test case 
	{
		//System.out.println("hello testNg");
		//instead of sysout we can use reporter.log in testng
		Reporter.log("HELLO testNg",true);
	}
	@Test
	public void login()
	{
		//System.out.println("user is able to login");
		
		Reporter.log("USER is able to login",true);
	}
	@Test
	public void register()
	{
		//System.out.println("user is able to register");
		
		Reporter.log("USER is able to register",true);
	}
	
	
	
	
	
}
