package pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StaleElementExcep extends BaseClass {
	
	@Test
	public void basepage() {
	BasePage bp=new BasePage(driver);
	
	bp.getSearchtextfield().sendKeys("Books");
	bp.getSearchbutton().click();
	driver.navigate().refresh();
	bp.getSearchtextfield().sendKeys("b");
	}	
	
	
	
	
	
	

}
