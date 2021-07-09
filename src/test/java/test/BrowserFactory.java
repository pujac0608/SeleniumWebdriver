package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {
	
	public static WebDriver driver;
	public static WebDriver SelectBrowser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\pujac\\eclipse-workspace\\test\\driver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.firefox.driver", "C:\\Users\\pujac\\eclipse-workspace\\test\\driver\\chromedriver.exe");
			driver = new FirefoxDriver();
		}
		
		return driver;
		
	}

}
