package batchexecutiontestngproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC__003 extends BaseClass{
	
	@Test
	public void clickonradiobutton() {
		WebElement radio = driver.findElement(By.xpath("//input[@type='radio'][1]"));
		radio.click();
		if(radio.isSelected()) {
			Reporter.log("user is able to click on radio button",true);
		}
		
		driver.findElement(By.xpath("//input[@value='Vote']")).click();
		
	}
	
	
	
	

}
