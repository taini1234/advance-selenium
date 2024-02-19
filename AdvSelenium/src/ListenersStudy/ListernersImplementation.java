package ListenersStudy;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.ITest;

public class ListernersImplementation implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName() + "Test case started");
	}
	@Override
	public void onTestSuccess(ITestResult result) {
		
		System.out.println(result.getName() + "test successfull");
	}
	@Override
	public void onTestFailure(ITestResult result) {
		
		System.out.println(result.getName() + "test case is fail");
		TakesScreenshot ts = (TakesScreenshot)ListernersDemo.driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest=new File("./failed.png");
		try {
			FileUtils.copyFile(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
