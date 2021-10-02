package testpackage;

import basepackage.BaseTest;
import org.junit.Test;
import pages.BasketPage;
import pages.MainPage;
import pages.ProductPage;
import pages.SearchPage;

public class ShoppingTests extends BaseTest{

	@Test
	public void onlineShopping(){
		new MainPage(driver).
				mainPageControl();

		new MainPage(driver).
				successfulLogin("dorukyurugen@gmail.com","BOTmustafa1", "17544831");

		new SearchPage(driver).
				searchWithScrollAndClick("pantolan");

		String price=
				new ProductPage(driver).getPrice();

		new MainPage(driver).myBasket();

		new BasketPage(driver).
				checkPrice(price);

		new BasketPage(driver).
				increaseProductAndEmptyBasket();
	}
}
