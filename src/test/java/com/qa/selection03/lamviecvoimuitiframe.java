package com.qa.selection03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lamviecvoimuitiframe {

	public static void main(String[] args) {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-left");
		System.out.println("[iframe left:"+driver.findElement(By.xpath("//body[contains(text(),'LEFT')]")).getText()+"]");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		System.out.println("[iframe middle:"+driver.findElement(By.xpath("//div[@id='content']")).getText()+"]");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-right");
		System.out.println("[iframe right:"+driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]")).getText()+"]");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame-bottom");
		System.out.println("[iframe bottom:"+driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]")).getText()+"]");

	}

}
