package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
	
	public BasePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//img[@alt='Tricentis Demo Web Shop']")
	private WebElement logoOfDemo;
	
	@FindBy(id="small-searchterms")
	private WebElement searchtextfield;
	
	@FindBy(xpath = "//input[@value='Search']")
	private WebElement searchbutton;

	public WebElement getLogoOfDemo() {
		return logoOfDemo;
	}

	public WebElement getSearchtextfield() {
		return searchtextfield;
	}

	public WebElement getSearchbutton() {
		return searchbutton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
