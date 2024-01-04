package com.qa.selection03;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class anton {
	public WebDriver driver ;
	@BeforeMethod
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		driver = new ChromeDriver();

//		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); // Sử dụng Duration
	}
	@AfterMethod
	public void teardow() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}
	@Test
	public void test_form_hardsanity() {
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
	List<WebElement> CHECKBOXES= driver.findElements(By.cssSelector("input[type='checkbox']"));
		for(WebElement BOXES:CHECKBOXES)
		{
			if(BOXES.getText().trim()=="College") {
			BOXES.click();
			break;
			}
			}
	List<WebElement> Listdate = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement date:Listdate) {
			if(date.getText().trim()=="Female") {
			date.click();
			break;
	}
	}

	WebElement datepicker = driver.findElement(By.id("datepicker"));
		datepicker.clear();
		datepicker.sendKeys("20/11/2023");
	WebElement submit=driver.findElement(By.xpath("//a[contains(text(),'Submit')]"));
		submit.click();
		
	String strExpected = "Thanks for submitting your form";
	String strActual= driver.findElement(By.xpath("//h1[contains(text(),'Thanks for submitting your form')]")).getText();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Thanks for submitting your form')]")));

	Assert.assertEquals(strExpected, strActual);

}
		@Test
		public void test_form_softsanity() {
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

		List<WebElement> CHECKBOXES= driver.findElements(By.cssSelector("input[type='checkbox']"));
			for(WebElement BOXES:CHECKBOXES)
			{
				if(BOXES.getText().trim()=="College") {
				BOXES.click();
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
	
		

//		List<WebElement> Listdate = driver.findElements(By.xpath("//input[@type='checkbox' ]"));
//			for(WebElement date:Listdate) {
//				if(date.getText().trim()=="Female") {
//				date.click();
//				break;
//		}
//		}


		WebElement datepicker = driver.findElement(By.id("datepicker"));
			datepicker.clear();
			datepicker.sendKeys("20/11/2023");
		WebElement submit=driver.findElement(By.xpath("//a[contains(text(),'Submit')]"));
			submit.click();
			
		String strExpected = "Thanks for submitting your form";
		String strActual= driver.findElement(By.xpath("//h1[contains(text(),'Thanks for submitting your form')]")).getText();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Thanks for submitting your form')]")));
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(strExpected, strActual);	
		driver.quit();
	}
}
