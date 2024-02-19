package pom;

import org.testng.annotations.Test;

public class BasePageImple extends BaseClass{
	
	@Test
	public void basepage() {
	BasePage bp=new BasePage(driver);
	
	bp.getSearchtextfield().sendKeys("Books");
	bp.getSearchbutton().click();
	
	}
	
	
	
	
	
	

}
