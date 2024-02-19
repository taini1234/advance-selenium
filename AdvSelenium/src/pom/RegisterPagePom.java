package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPagePom {
	
	//step 1 create a constructor and pass the webdriver driver as arg to show the driver where to do task
	public RegisterPagePom(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(linkText="Register")
	private WebElement registerlink;
	
	@FindBy(id= "gender-male")
	private WebElement maleradiobutton;
	
	@FindBy(id="FirstName")
	private WebElement firstnametextfield;
	
	@FindBy(id="LastName")
	private WebElement lastnametextfield;
	
	@FindBy(id="Email")
	private WebElement emailtextfield;
	
	@FindBy(id="Password")
	private WebElement passwordtextfield;
	
	@FindBy(id="ConfirmPassword")
	private WebElement confpswdtextfield;
	
	@FindBy(id="register-button")
	private WebElement regbutton;

	public WebElement getRegisterlink() {
		return registerlink;
	}

	public WebElement getMaleradiobutton() {
		return maleradiobutton;
	}

	public WebElement getFirstnametextfield() {
		return firstnametextfield;
	}

	public WebElement getLastnametextfield() {
		return lastnametextfield;
	}

	public WebElement getEmailtextfield() {
		return emailtextfield;
	}

	public WebElement getPasswordtextfield() {
		return passwordtextfield;
	}

	public WebElement getConfpswdtextfield() {
		return confpswdtextfield;
	}

	public WebElement getRegbutton() {
		return regbutton;
	}
	
	
	
	
	
	

}
