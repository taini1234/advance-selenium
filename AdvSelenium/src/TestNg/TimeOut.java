package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
//time critical situation we give TIMEOUT
public class TimeOut {
	@Test(timeOut = 5000)
	public void tolaunchapp() throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.redbus.in/");
		//Thread.sleep(2000);
		driver.quit();

}}
