package com.qa.selection03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class sudungRightClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver= null;
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		WebElement clicklnk = driver.findElement(By.xpath("//a[contains(text(),'Context Menu')]"));
		clicklnk.click();
		WebElement hotpot = driver.findElement(By.xpath("//div [@id='hot-spot']"));
		Actions action = new Actions(driver);
		action.contextClick(hotpot).build().perform();
		Thread.sleep(200);
		Alert alert =driver.switchTo().alert();
		System.out.println("[alert:"+alert.getText()+"]");
		Thread.sleep(100);
		alert.accept();		

	}

}
