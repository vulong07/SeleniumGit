package com.qa.selection03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class lamviecvoiResize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		WebElement click = driver.findElement(By.xpath("//a[contains(text(),'Resizable')]"));
		click.click();
		driver.switchTo().frame(0);
		WebElement Resize = driver.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-e']"));
		Thread.sleep(200);
		Actions actions = new Actions(driver);
		actions.clickAndHold(Resize).moveByOffset(150, 150).build().perform();
		Thread.sleep(1000);

		
	}

}
