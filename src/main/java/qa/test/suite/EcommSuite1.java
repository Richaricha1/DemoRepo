package qa.test.suite;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import cart.Cart;
import category.Category;
import home.Home;
import login.LogOut;
import login.Login;
import qa.util.EcommerceUtil;


/**
 * 
 * @author Aditya.Kumar1
 * Step 1 : Login
 * Step 2 : Click on Profile
 * Step 3 : Logout
 */
public class EcommSuite1 {

	
	public static void main (String aa [])
	{
		WebDriver driver = EcommerceUtil.getDriver();
		
		Login.login(driver);
		LogOut.logout(driver);
		Cart.cart(driver);
		Category.category(driver);
		Home.home();
	}
	
}
