package Functions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product_Search {
	String search;

	public Product_Search(WebDriver driver, String search) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		try {
			WebElement Search = wait.until(ExpectedConditions
					.elementToBeClickable(By.cssSelector(".search-box__bar--29h6 input[type='search']")));
			Search.clear();
			Search.sendKeys(search);

		} catch (Exception e) {
			System.out.println("O khong tim thay element");
		}
	}

	public static void ButtonSearch(WebDriver driver) {
		WebElement Button = driver.findElement(By.cssSelector(".search-box__button--1oH7"));
		Button.click();
	}
}
