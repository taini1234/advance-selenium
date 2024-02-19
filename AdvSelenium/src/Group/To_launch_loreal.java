package Group;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class To_launch_loreal{
	
	@Test(groups = "beauty")
	public void loreal() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.loreal.com/en/");
		driver.manage().window().maximize();
	}
	
	
	

}
