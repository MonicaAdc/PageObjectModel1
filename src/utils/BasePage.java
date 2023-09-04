package utils;

import pageObject.ContactPage;
import pageObject.LoginPage;
import pageObject.MenuPage;
import pageObject.ShopPage;

public class BasePage  extends BaseTest {
		
	public static final String genericEvent = null;
	public ContactPage contact =  new ContactPage(driver);
	public MenuPage menu =  new MenuPage(driver);
	public ShopPage shop = new ShopPage(driver);
	public LoginPage login =  new LoginPage(driver);
	
}