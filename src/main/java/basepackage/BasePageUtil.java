package basepackage;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class BasePageUtil{
	final static Logger logger = Logger.getLogger(BasePageUtil.class);

	protected WebDriver driver;

	public BasePageUtil(WebDriver driver) {
		this.driver = driver;
	}

	protected void sendKeys(By by, String value) {
		WebElement element = findElement(by);
		element.sendKeys(value);
		logger.info(by.toString() + " elementine " + value + " texti gönderildi");
	}

	protected void clickElement(By by) {
		WebElement element = findElement(by);
		element.click();
		logger.info(by.toString() + " elementine tıklandı");
	}

	protected WebElement findElement(By by) {
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(by));
		return driver.findElement(by);
	}

	protected String getText(By by) {
		String text = findElement(by).getText();
		logger.info(text + " yazısı bulundu");
		return text;
	}

	protected  void pageEnd(){
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL, Keys.END);
	}

	protected  void javaScriptClick(By by){
		WebElement element = findElement(by);
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
		logger.info(by.toString() + " elementine javascript komutu ile tıklandı");
	}
}
