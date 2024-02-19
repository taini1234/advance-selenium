package TestNg;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ChronologicalOrderInTestng {

	@Test//2
	public void run() {
		System.out.println("iam run");
	}

	@Test
	public void test() {
		System.out.println("iam test");
	}
	
	@BeforeSuite//1
	public void beforesuit()
	{
		System.out.println("iam before suite");
	}
	
	@AfterSuite//3
	public void aftersuite() {
		System.out.println("iam aftersuite");
	}
}
