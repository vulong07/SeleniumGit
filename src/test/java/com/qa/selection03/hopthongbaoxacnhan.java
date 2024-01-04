package com.qa.selection03;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hopthongbaoxacnhan {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		WebElement click = driver.findElement(By.xpath("//button[contains(text(),'Click for JS Confirm')]"));
		click.click();
		Alert alertContent = driver.switchTo().alert();
		String stralertal=alertContent.getText();
		System.out.println("[alert Content"+stralertal+" ]");
		alertContent.dismiss();
		Thread.sleep(200);
		
		

	}

}
