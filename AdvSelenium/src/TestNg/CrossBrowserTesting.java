package TestNg;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting {
	
	WebDriver driver;
	@Parameters({"browsername","url"})
	@Test
	//without xml we can run this by using @optional in @test level only
	//public void browser(@optional("chrome")string browsername,@optional(string url))
	public void browser(String browserName,String url) {
		if(browserName.equals("chrome")) {
			driver=new ChromeDriver();
		}else if(browserName.equals("firefox")) {
			driver=new FirefoxDriver();
		}else if(browserName.equals("edge")) {
			driver=new EdgeDriver();
		}else {
			System.out.println("browser name is not valid");
		}
		
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.quit();
		
		
		
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
