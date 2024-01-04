package com.qa.selection04;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testfromdangnhap{ 
	@Test(dataProvider="getData")
	public void Testlogin(String username, String password) throws InterruptedException {
	ChromeDriver driver = null;
	System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	driver.get("https://www.facebook.com/");
	WebElement usernameFB = driver.findElement(By.xpath("//input[@id='email']"));
	usernameFB.clear();
	usernameFB.sendKeys(username);
	WebDriverWait wait = new WebDriverWait(driver, 10);
	WebElement passwordFB = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("pass")));
	passwordFB.clear();
	passwordFB.sendKeys(password);
	WebElement login = driver.findElement(By.xpath("//button[@type='submit']"));
	login.click();
	driver.close();
	

}
	@DataProvider(name="getData")
	public Object[][] getData(){
		Object[][] data= new Object[2][2];
			data[0][0]="test00@gmail.com";
			data[0][1]="test01@gmail.com";
			data[1][0]="test02@gmail.com";
			data[1][1]="test03@gmail.com";

		return data;
	}

}
