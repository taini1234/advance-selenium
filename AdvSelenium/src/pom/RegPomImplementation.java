package pom;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.testng.annotations.Test;

public class RegPomImplementation extends BaseClass{
	/*static String Fname;
	static String Lname;
	static String pswd;
	static String cfpswd;
	static String mail;
	public static void main(String[] args) throws Throwable {
		File file=new File("./Data/data.properties");
		FileInputStream fis=new FileInputStream(file);
		Properties prop=new Properties();
		prop.load(fis);
		Fname = prop.getProperty("firstname");
		Lname = prop.getProperty("lastname");
		mail=prop.getProperty("email");
		pswd = prop.getProperty("password");
		cfpswd = prop.getProperty("confirmpassword");
	}	*/
	
	@Test
	public void register() {
	RegisterPagePom regpg=new RegisterPagePom(driver);
	regpg.getRegisterlink().click();
	regpg.getMaleradiobutton().click();
	regpg.getFirstnametextfield().sendKeys("taini");
	regpg.getLastnametextfield().sendKeys("george");
	regpg.getEmailtextfield().sendKeys("tezza@6789gmail.com");
	regpg.getPasswordtextfield().sendKeys("123456");
	regpg.getConfpswdtextfield().sendKeys("123456");
	regpg.getRegbutton().click();
	

}}
