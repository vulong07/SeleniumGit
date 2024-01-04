package com.qa.selection04;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LamviecvoivoiAnnatations {
@Test
public void test_form_sanity() {
	WebDriver driver ;
	System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
	List<WebElement >listradions = driver.findElements(By.xpath("//div[@class='input-group']"));
	for(WebElement radions:listradions ) {
		if(radions.getText().trim().contains("College")) {
			radions.click();
			break;
		
	}
}
	List<WebElement> CHECKBOXES= driver.findElements(By.xpath("//div[@class='col-sm-8 col-sm-offset-2']"));
	for(WebElement BOXES:CHECKBOXES) {
		if(BOXES.getText().trim().contains("Female")) {
			BOXES.click();
			break;
		}
	} 
	List<WebElement> Listdate = driver.findElements(By.cssSelector("select#select-menu>option"));
	for(WebElement date:Listdate) {
		if(date.getText().trim().contains("0-1")) {
			date.click();
			break;
			
		}
	}

}
}
