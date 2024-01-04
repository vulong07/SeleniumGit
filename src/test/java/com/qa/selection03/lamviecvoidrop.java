package com.qa.selection03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class lamviecvoidrop {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		WebElement click = driver.findElement(By.xpath("//a[contains(text(),'Droppable')]"));
		click.click();
		driver.switchTo().frame(0);
		WebElement drap = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions actions =  new Actions(driver);
		actions.clickAndHold(drap)
				.moveToElement(drop)
				.release(drap)
				.build()
				.perform();
		Thread.sleep(200);
		driver.quit();

	}

}
