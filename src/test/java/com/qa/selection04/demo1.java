package com.qa.selection04;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.DevTools;
import org.openqa.selenium.devtools.v117.log.Log;
import org.openqa.selenium.support.locators.RelativeLocator;



public class demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));  // Sử dụng Duration
		try{
		//cac buoc den listen to Chromiudriver
		DevTools devTools = ((ChromeDriver) driver).getDevTools();
		devTools.createSession();
		devTools.send(Log.enable());
		devTools.addListener(Log.entryAdded(),entry -> System.out.println(entry.asSelenium));
		driver.get("https://www.facebook.com/");
		WebElement emailField = driver.findElement(By.id("email"));
		emailField.clear();
		emailField.sendKeys("longvu");
		WebElement pass = driver.findElement(By.id("pass"));
		pass.clear();
		pass.sendKeys("000500");
		driver.findElement(RelativeLocator.withTagName("button").below(By.name("pass")));
		Thread.sleep(200);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally {
			driver.quit();
		}
	
	}
}
		
//		File srcFile = emailField.getScreenshotAs(OutputType.FILE);
//		try{
//			FileUtils.copyFile(srcFile, new File("./target/Sceenshorts1/emailField.png"));
//		}catch(Exception ex){
//			ex.printStackTrace();
//		}
//		takeElement(emailField,"emailField");	
//		emailField.clear();
//		emailField.sendKeys("longvu");
//		takeElement(emailField,"emailtext");
//		WebElement pass = driver.findElement(By.id("pass"));
//		takeElement(pass,"passField");
//		pass.clear();
//		pass.sendKeys("000500");
//		takeElement(pass,"passtext");
//		WebElement click = driver.findElement(By.xpath("//input[@id='u_0_9_SM']"));
//		click.click();
//		
//		Thread.sleep(200);
//		driver.close();
//		
//	}
//	public static void takeElement(WebElement element, String filename) {
//		File srcFile = element.getScreenshotAs(OutputType.FILE);
//		try {
//			FileUtils.copyFile(srcFile, new File("./target/Sceenshorts1/"+filename+".png"));
//		}catch(Exception ex) {
//			ex.printStackTrace();
//		}
//	}


//}
