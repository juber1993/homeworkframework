package base;

import java.util.Scanner;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import utils.WebDriverFunctions;

public class Config extends WebDriverFunctions{
	

	
	Scanner BrowserName=new Scanner(System.in);
	//System.out.println("Which browser would you like to use?");
	String Browser =BrowserName.next();



	// do all the configure
	// int driver
	// setup browser
	// company url
	// xyz
	//public String Browser="ff";

	@BeforeTest
	
	
	public void initDrivers() throws InterruptedException{
		
		
		if (Browser=="ch") {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//drivers//chromedriver");
		driver = new ChromeDriver();
		driver.get ("http://facebook.com");
		Thread.sleep(550);
		}
		else if(Browser=="ff") {
			System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir")+"//drivers//geckodriver");
			driver = new FirefoxDriver();
			driver.get ("http://facebook.com");
			Thread.sleep(550);
			
		}

	}
}
