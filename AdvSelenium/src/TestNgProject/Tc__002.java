package TestNgProject;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Tc__002 extends BaseClass{
	
	@Test
	public void clickonwishlist() {
		driver.findElement(By.linkText("Wishlist")).click();
		Reporter.log("user is able to click on wishlist",true);
	}

}
