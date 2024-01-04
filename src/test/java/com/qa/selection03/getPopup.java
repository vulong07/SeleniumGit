package com.qa.selection03;

import java.awt.Window;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class getPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");






	     List<WebElement> allLinks = driver.findElements(By.tagName("a"));

	        // In ra danh sách tất cả các liên kết
	        for (WebElement link : allLinks) {
	            System.out.println("Link Text: " + link.getText());
	            System.out.println("URL: " + link.getAttribute("href"));
	            System.out.println("------");
	        }
	    WebElement getlink = driver.findElement(By.linkText("Privacy Policy"));
	    getlink.click();


		 Thread.sleep(200);
		String strParentWindow = driver.getWindowHandle();
		Set<String> Windows = driver.getWindowHandles();
		for(String window:Windows) {
			if(!Windows.equals(strParentWindow)) {
				driver.switchTo().window(window);
			}
		}
		Thread.sleep(200);
		
		 // Tạo đối tượng Actions
        Actions actions = new Actions(driver);

        // Tìm phần tử "Setting"
        WebElement settingElement = driver.findElement(By.xpath("//*[contains(text(),'Setting')]"));

        // Sử dụng Actions để click vào phần tử "Setting"
        actions.moveToElement(settingElement).click().perform();
		Thread.sleep(200);
		driver.switchTo().window(strParentWindow);
		

	}
	

	}
