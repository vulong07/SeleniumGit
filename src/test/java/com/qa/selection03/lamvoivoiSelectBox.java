package com.qa.selection03;

import java.util.List;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class lamvoivoiSelectBox {

	public static void main(String[] args) throws InterruptedException, TimeoutException {
		//intinal driver
				WebDriver driver =null;
				//config driver
				System.setProperty("webdriver.chrome.driver","src/test/resource/executables/chromedriver-win64/chromedriver.exe");
				//assing driver
				driver = new ChromeDriver();
				//open Url
				driver.get("https://www.facebook.com/");
				// Full màn hình
		        driver.manage().window().maximize();
				driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
				WebDriverWait wait = new WebDriverWait(driver, 10);
				//Tuong tac modual
				WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='_8fgl _9l2p']")));
				modal.click();
		
				//thuc hien cac tuong tac khac voi cac phan tu trong modual neu can	
				driver.findElement(By.name("firstname")).clear();
				driver.findElement(By.name("firstname")).sendKeys("vu");
				driver.findElement(By.name("lastname")).clear();
				driver.findElement(By.name("lastname")).sendKeys("long");
				driver.findElement(By.name("reg_email__")).clear();
				driver.findElement(By.name("reg_email__")).sendKeys("000220");
				driver.findElement(By.name("reg_passwd__")).clear();
				driver.findElement(By.name("reg_passwd__")).sendKeys("vulong");
				
				String strDay = driver.findElement(By.id("day")).getAttribute("value").toString();
				String strMonth = driver.findElement(By.id("month")).getAttribute("value").toString();
				String strYear = driver.findElement(By.id("year")).getAttribute("value").toString();
				System.out.println("[Day"+strDay+"]");
				System.out.println("[month"+strMonth+"]");
				System.out.println("[Year"+strYear+"]");
				//input day
				List<WebElement> listDay = driver.findElements(By.cssSelector("select#day>option"));
				for(WebElement day:listDay) {
					if(day.getText().trim().contains("15")) {
					day.click();
					break;
				}
				}
				//input month
				List<WebElement> listMonth = driver.findElements(By.cssSelector("select#month>option"));
				for(WebElement month:listMonth) {
					if(month.getText().trim().contains("Jun")) {
						month.click();
						break;
				}
				}
				//input year
				List<WebElement> listYear = driver.findElements(By.cssSelector("select#year>option"));
				for(WebElement year:listYear) {
					if(year.getText().trim().contains("2015")) {
						year.click();
						break;
				}
				}
				WebElement imgElement = driver.findElement(By.className("_8idr"));

		        // Thực hiện click vào phần tử
		        imgElement.click();
				
				//WebDriverWait wait1 = new WebDriverWait(driver, 100);
		        //WebElement closeButton = wait1.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#u_2_9_En")));
		        

	
	}
			}
	
				



	


