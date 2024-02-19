package AdvSel;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc__demo002 {

//validate product is added to the cart
	public static void main(String[] args) {
		String actualurl = "https://demowebshop.tricentis.com/";
		String digdownloadurl = "https://demowebshop.tricentis.com/digital-downloads";
		String addtocartt = "https://demowebshop.tricentis.com/digital-downloads";
		String cart = "https://demowebshop.tricentis.com/cart";
		// step 1: open the browser
		WebDriver driver = new ChromeDriver();
		System.out.println("user is able to oprn the browser");

		// step2: enter the url
		driver.get("https://demowebshop.tricentis.com/");
		String url = driver.getCurrentUrl();
		if (actualurl.equals(url)) {
			System.out.println("user is able to open demowebshop");
		} else {
			System.out.println("user is not able to open demowebshop");
		}

		// step3:user is able to click on digital downloads
		driver.findElement(By.linkText("Digital downloads")).click();
		String digdownload = driver.getCurrentUrl();
		if (digdownloadurl.equals(digdownload)) {
			System.out.println("user is able to click on digital downloads");
		} else {
			System.out.println("user is not able to click on digital downloads");
		}

		// step4: user is able to click on add to cart
		List<WebElement> carts = driver.findElements(By.xpath("//input[@value='Add to cart']"));
		for (WebElement e : carts) {
			e.click();
		}
		String addtocarturl = driver.getCurrentUrl();
		if (addtocartt.equals(addtocarturl)) {
			System.out.println("user is able to click on add to cart");
		} else {
			System.out.println("user is not able to click on add to cart");
		}
		// step5:user is able to click on shopping cart

		driver.findElement(By.linkText("Shopping cart")).click();
		String carturl = driver.getCurrentUrl();
		if (cart.equals(carturl)) {
			System.out.println("user is able to click on shopping cart");
		} else {
			System.out.println("user is not able to click on shopping cart");
		}

		// step 6:to validate product is added to cart
		List<WebElement> ref = driver.findElements(By.className("cart-item-row"));
		if (ref.size() > 0) {
			System.out.println("product is addded");
		} else {
			System.out.println("product is not added");
		}

		// step7:quit
		driver.quit();
		System.out.println("user is able to quit demowebshop");

	}

}
