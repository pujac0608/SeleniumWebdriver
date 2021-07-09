package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Page1 {

	
	public static WebElement txtBox(WebDriver driver) {
			WebElement element = driver.findElement(By.name("q"));
			return element;			
	}
	
	public static WebElement SearchBox(WebDriver driver) {
		WebElement element = driver.findElement(By.name("btnK"));
		return element;
	}
}
