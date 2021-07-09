package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import pages.Page1;

public class TestCase002 {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = BrowserFactory.SelectBrowser("chrome");
		driver.get("https://www.google.com/");
		Page1.txtBox(driver).sendKeys("Tsunami");
		Page1.txtBox(driver).sendKeys(Keys.ENTER);
		driver.close();
	}
}