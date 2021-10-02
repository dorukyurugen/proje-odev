package pages;

import basepackage.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BasketPage extends BasePageUtil {

	public BasketPage(WebDriver driver) {
		super(driver);
	}

	public void checkPrice(String price) {
		Assert.assertEquals("Price does not equal",getText(By.cssSelector(".rd-cart-item-price.mb-15")),price);
	}

	public void increaseProductAndEmptyBasket() {
		clickElement(By.cssSelector(".oq-up.plus"));
		Assert.assertEquals("Product quantity is wrong", findElement(By.cssSelector(".item-quantity-input.ignored")).getAttribute("value"),("2"));
		clickElement(By.cssSelector(".fa.fa-trash-o"));
		clickElement(By.cssSelector(".inverted-modal-button.sc-delete.ins-init-condition-tracking"));
		Assert.assertTrue("There are no products in your basket",findElement(By.className("cart-empty-title")).isDisplayed());
	}

}
