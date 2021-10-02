package pages;

import basepackage.BasePageUtil;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage extends BasePageUtil {

  public MainPage(WebDriver driver) {
    super(driver);
  }


  public void mainPageControl() {
    findElement(By.className("header-icon-label"));
  }

  public void successfulLogin(String email, String password, String customerId) {
    clickElement(By.className("header-icon-label"));
    sendKeys(By.id("LoginEmail"),email);
    sendKeys(By.id("Password"),password);
    clickElement(By.id("loginLink"));
    Assert.assertEquals("You failed to login successfully", findElement(By.id("currentCustomerId")).getAttribute("value"),customerId);
  }

  public void myBasket(){
    clickElement(By.cssSelector(".header-bag-icon.bndl-shopping-bag.bndl-shopping-bag-dims"));
  }
}
