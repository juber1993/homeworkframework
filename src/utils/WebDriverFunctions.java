package utils;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebDriverFunctions {

	protected WebDriver driver;
	public static Logger APPLICATION_LOGS = Logger.getLogger("devpinoyLogger");
	public void typeByXpath (String jub, String value){
		driver.findElement(By.xpath(jub)).sendKeys(value);


	}

	public void typebyXpath2(String x) {
		driver.findElement(By.xpath(x)).click();
	}
}
