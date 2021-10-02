package pages;

import basepackage.BasePageUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePageUtil {
  public ProductPage(WebDriver driver) {
    super(driver);
  }

  public String getPrice() {
    return getText(By.xpath("//div[@class='col-xs-12 price-area']//span[@class='price']"));
  }

}
