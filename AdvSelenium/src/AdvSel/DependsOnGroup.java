package AdvSel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class DependsOnGroup {
@Test(groups = "cabs")
	public void ola() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.olacabs.com/");
		driver.quit();
		
	}
}
