package com.qa.selection03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class lamviecvoiIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= null;
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/");

	     List<WebElement> allLinks = driver.findElements(By.tagName("a"));

	        // In ra danh sách tất cả các liên kết
	        for (WebElement link : allLinks) {
	            System.out.println("Link Text: " + link.getText());
	            System.out.println("URL: " + link.getAttribute("href"));
	            System.out.println("------");
	        }
	      WebElement Draggable = driver.findElement(By.linkText("Draggable"));
	      Draggable.click();
	      WebElement iframe = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	      driver.switchTo().frame(iframe);
	      String value =driver.findElement(By.xpath("//div[@id='draggable']/p")).getText();
	      System.out.println("[p:"+value+"]");
	      driver.switchTo().defaultContent();
	      String value1 = driver.findElement(By.xpath("//div[@id='content']/h1")).getText();
	      System.out.println("[h1:"+value1+"]");
	      
	      }
		
	}
		


