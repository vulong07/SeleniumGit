package com.qa.selection03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class lamviecvoimousehover {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= null;
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/hovers");
		WebElement picture = driver.findElement(By.xpath("//div[@class='figure']"));
		System.out.println(picture);
		WebElement link = driver.findElement(By.xpath("//a[contains(text(),'View profile' ]"));
		System.out.println(link);
		Actions actions = new Actions(driver);
		actions.moveToElement(picture).build().perform();
		Thread.sleep(200);
		actions.moveToElement(link).click().build().perform();	
		Thread.sleep(200);

	}

}
