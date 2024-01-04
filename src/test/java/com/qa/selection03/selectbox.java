package com.qa.selection03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selectbox {

	public static void main(String[] args) {
		//initail driver
		WebDriver driver = null;
		//config
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		//assgin chrome
		driver = new ChromeDriver();
		//URL
		driver.get("https://www.facebook.com/");
		 driver.manage().window().maximize();
			driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			//Tuong tac modual
			WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_8fgl _9l2p']")));
			modal.click();
			WebDriverWait wait1 = new WebDriverWait(driver, 10);
			By hiddenElementLocator = By.id("u_d_9_wz"); // Thay đổi id thành id của phần tử bạn muốn kiểm tra
	        
			try {
	            Boolean hiddenElement = wait1.until(ExpectedConditions.invisibilityOfElementLocated(hiddenElementLocator));
	            System.out.println("Phần tử đã bị ẩn.");
	        } catch (Exception e) {
	            System.out.println("Phần tử không bị ẩn.");
	        }
		

		

		
	}
	
}


