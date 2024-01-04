package com.qa.section02;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public final class findElementbbyDandlinktext {

	public static void main(String[] args) throws InterruptedException {
		//intinal driver
		
		//config driver
		System.setProperty("webdriver.chrome.driver","src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		//assing driver
		//tat thong bao
	    ChromeOptions options = new ChromeOptions();
	    options.addArguments("--disable-notifications");

	        // Khởi tạo trình duyệt Chrome với các tùy chọn đã cấu hình
	    WebDriver driver = new ChromeDriver(options);
		//open Url
		driver.get("https://www.facebook.com/");
		   // Full màn hình
        driver.manage().window().maximize();
        //Get all tag
       
        // Lấy phần tử id email
		driver.findElement(By.id("email")).clear();
		// get ID
		driver.findElement(By.id("email")).sendKeys("vulonghk2@gmail.com");
		//lấy phần tử bằng ID password
		driver.findElement(By.id("pass")).clear();
		// get ID
		driver.findElement(By.id("pass")).sendKeys("Vulong009@@");
		// điều hướng button bằng Xpath
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//dieu kien tat thong bao sau khi dang nhap thanh cong
	  try {
       Thread.sleep(5000); // Chờ 5 giây (có thể cần điều chỉnh thời gian chờ)
   } catch (InterruptedException e) {
       e.printStackTrace();
   }

	}

}
