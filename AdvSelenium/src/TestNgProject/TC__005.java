package TestNgProject;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TC__005 extends BaseClass{
	
	@Test
	public void clickonmajortabs() {
		driver.findElement(By.xpath("//a[@href=\"/books\"][1]")).click();
		driver.findElement(By.xpath("//a[@href=\"/computers\"][1]")).click();
		driver.findElement(By.xpath("//a[@href=\"/electronics\"][1]")).click();
		driver.findElement(By.xpath("//a[@href=\"/apparel-shoes\"][1]")).click();
		driver.findElement(By.xpath("//a[@href=\"/digital-downloads\"][1]")).click();
		driver.findElement(By.xpath("//a[@href=\"/jewelry\"][1]")).click();
		driver.findElement(By.xpath("//a[@href=\"/gift-cards\"][1]")).click();
		
	}

}
