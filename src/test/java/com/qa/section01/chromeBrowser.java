package com.qa.section01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeBrowser {

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		//config driver
		System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");
	    driver = new ChromeDriver();
		// open URL
		driver.get("https://search.yahoo.com/search?fr=mcafee&type=E210US91215G0&p=tai+chorme");
		System.out.println("[title:"+driver.getTitle()+"]");

	}

}
