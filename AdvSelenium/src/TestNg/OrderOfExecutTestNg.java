package TestNg;

import org.testng.annotations.Test;

public class OrderOfExecutTestNg {
	
	//based on ascii value first capital letter executes then small letters
	@Test//2nd executes
	public void m()
	{
		System.out.println("iam m");
	}
	@Test//1st executed
	public void M()
	{
		System.out.println("iam M");
	}
	
	
	
	
	

}
