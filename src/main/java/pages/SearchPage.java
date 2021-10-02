package pages;

import basepackage.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePageUtil {

  public SearchPage(WebDriver driver) {
    super(driver);
  }

  public void searchWithScrollAndClick(String product) {
    sendKeys(By.id("search"),product);
    clickElement(By.cssSelector(".search-button.active"));
    pageEnd();
    clickElement(By.className("lazy-load-button"));
    javaScriptClick(By.cssSelector(".product-lazy-image.lazyloaded"));
    clickElement(By.xpath("//div[@id='option-size']//a[@data-tracking-category='UrunDetay']"));
    javaScriptClick(By.id("pd_add_to_cart"));
  }
}
