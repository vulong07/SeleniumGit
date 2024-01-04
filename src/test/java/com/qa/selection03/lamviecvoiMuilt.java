package com.qa.selection03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class lamviecvoiMuilt {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://jqueryui.com");
		WebElement click = driver.findElement(By.xpath("//a[contains(text(),'Selectable')]"));
		click.click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-selectable *"));
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).click(list.get(2)).click(list.get(5)).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(1000);
		
		
		
		

	}

}
