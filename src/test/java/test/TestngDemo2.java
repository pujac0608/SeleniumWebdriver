package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Page1;

public class TestngDemo2 {
	
	WebDriver driver;
	@BeforeTest
	public void setUp() {
		driver = BrowserFactory.SelectBrowser("chrome");
	}
	@Test
	public void GoogleSearch1() {
		driver.get("https://www.google.com/");
		Page1.txtBox(driver).sendKeys("Puja");
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
