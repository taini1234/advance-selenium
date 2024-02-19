package Group;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SugerLanuch {
	@Test(groups = "beauty")
	public void apple() {
		WebDriver driver=new ChromeDriver();
		driver.get("https://in.sugarcosmetics.com/");
		driver.manage().window().maximize();
	}
}
