package com.qa.selection03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class thaotacvoislider {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= null;
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");
		WebElement click = driver.findElement(By.xpath("//a[contains(text(),'Slider')]"));
		click.click();
		WebElement click1 = driver.findElement(By.xpath("//a[contains(text(),'Colorpicker')]"));
		click1.click();
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		WebElement red = driver.findElement(By.xpath("//div[@id='red']"));
		WebElement 	green = driver.findElement(By.xpath("//div[@id='green']/span"));
		WebElement blue = driver.findElement(By.xpath("//div[@id='blue']/span"));
		Actions actions= new Actions(driver);
		actions.clickAndHold(red).moveByOffset(80, 20).release(red).build().perform();
		actions.clickAndHold(green).moveByOffset(20, 0).release(green).build().perform();
		actions.clickAndHold(blue).moveByOffset(20, 0).release(blue).build().perform();
		Thread.sleep(500);
				
	}

}
