package com.qa.selection03;

import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.lang.model.util.Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webElement {

	public static void main(String[] args) {
		//initail driver
		  System.setProperty("webdriver.chrome.driver", "đường-dẫn-đến-chromedriver.exe");

	        // Khởi tạo WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Mở trang web chứa mã HTML
	        driver.get("https://www.linkedin.com/jobs/search/?currentJobId=3731571978&geoId=104195383&keywords=Business%20Development&location=Vietnam");

	        // Tìm phần tử button "Experience level" và kích hoạt nó
	        WebElement experienceButton = driver.findElement(By.xpath("//button[contains(text(),'Experience level')]"));
	        experienceButton.click();
	        // Tìm tất cả các tùy chọn trong dropdown
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        List<WebElement> options = driver.findElements(By.cssSelector(".search-reusables__value-label"));

	        // Chọn tùy chọn "Director" và "Associate"
	        for (WebElement option : options) {
	            String text = option.getText();
	            if (text.contains("Director") || text.contains("Associate")) {
	                option.click();
	            }
	        }

	        // Đóng trình duyệt sau khi hoàn thành
	        driver.quit();
	}
}
