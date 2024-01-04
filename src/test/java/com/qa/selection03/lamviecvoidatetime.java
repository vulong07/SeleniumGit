package com.qa.selection03;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class lamviecvoidatetime {

	public static void main(String[] args) throws InterruptedException {
				// TODO Auto-generated method stub
		
		        WebDriver driver = null;
		        System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		        driver = new ChromeDriver();
		        driver.get("https://www.expedia.com.vn/");
		        Thread.sleep(200);
		        WebElement days = driver.findElement(By.cssSelector("button[data-stid='uitk-date-selector-input1-default']"));
		        days.click();
		        Thread.sleep(200);
		        
		    
//		        	List<WebElement> listDay = driver.findElements(By.xpath("//div[contains(@class, 'uitk-date-number-default') and contains(@class, 'uitk-type-300') and contains(@class, 'uitk-type-regular')]"));
//        	System.out.println(listDay);
	        
//		        for (WebElement day : listDay) {
//		            if (day.getText().contains(noDay) || day.getText().contains(noDay1)) {
//		                Actions actions = new Actions(driver);
//		                actions.moveToElement(day).click().perform();
		      
		        
		        for (int i = 0; i < 30; i++) {
		            List<WebElement> listDay = driver.findElements(By.xpath("//div[contains(@class, 'uitk-date-number-default') and contains(@class, 'uitk-type-300') and contains(@class, 'uitk-type-regular')]"));
		            for (WebElement day : listDay) {
	                if (day.getText().contains("25") || day.getText().contains("28"))
	                	Thread.sleep(200);{
	                    Actions actions = new Actions(driver);
		                actions.moveToElement(day).click().perform();
	                    break;
	                }
	            }
		            // Exit the loop if the element is found and clicked
		            if (listDay.size() > 0) {
	                break;

		            }
		        
		            }
		        	// If the element is not found, refresh the parent element
		        	WebElement daysRefreshed = driver.findElement(By.cssSelector("button[data-stid='uitk-date-selector-input1-default']"));
		            daysRefreshed.click();
		            Thread.sleep(200);
		            
		    }
}
	

	

