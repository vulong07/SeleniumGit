package com.qa.selection03;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testcheckbox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://formy-project.herokuapp.com/form");
		WebElement fistname = driver.findElement(By.xpath("//input[@id='first-name']"));
		fistname.clear();
		fistname.sendKeys("longvu");
		WebElement lastname = driver.findElement(By.cssSelector("#last-name"));
		lastname.clear();
		lastname.sendKeys("cong");
		WebElement jobtitle = driver.findElement(By.cssSelector("#job-title"));
		jobtitle.clear();
		jobtitle.sendKeys("Tester");
		List<WebElement>listradions = driver.findElements(By.cssSelector("input[type='radio']"));
		for(WebElement radions:listradions ) {
		if(radions.getAttribute("value").equals("radio-button-2")) {
			radions.click();
			break;
		
	}
	}
		 try {
	            // Tìm phần tử checkbox bằng XPath hoặc một cách khác
	            WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox' and @value='checkbox-2']"));

	            // Sử dụng phương thức click() để chọn checkbox
	            checkbox.click();
	        } catch (Exception e) {
	            // Xử lý ngoại lệ (nếu có) khi không tìm thấy checkbox hoặc không thể thực hiện click
	            e.printStackTrace();
	        }
	}
}
