package com.qa.selection03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dongbohoa {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		WebElement click = driver.findElement(By.xpath("//a[contains(text(),'Dynamic Loading')]"));
		click.click();
		WebElement click1 = driver.findElement(By.xpath("//a[contains(text(),'Example 1: Element on page that is hidden')]"));
		click1.click();
		WebElement button = driver.findElement(By.xpath("//button[contains(text(),'Start')]"));
		button.click();
		Thread.sleep(1000);
		
		

	}

}
