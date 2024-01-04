package com.qa.section01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class edgeBrowser {
	

	public static void main(String[] args) {
		// initial driver
		WebDriver driver = null;
		//config driver
		System.setProperty("webdriver.edge.driver", "src/test/resource/executables/msedgedriver.exe");
	    driver = new EdgeDriver();
		// open URL
		driver.get("https://www.office.com/");
		System.out.println("[title:"+driver.getTitle()+"]");
		// điều hướng mở Url khác
		driver.navigate().to("https://www.bing.com/search?pglt=2081&q=google&cvid=fea28f9e4fdc4bd087862bac7c10c7c7&gs_lcrp=EgZjaHJvbWUqBAgBEC4yBggAEEUYOTIECAEQLjIECAIQADIECAMQLjIECAQQLjIECAUQLjIGCAYQRRg8MgYIBxBFGDwyBggIEEUYPNIBCTEzNzYzajBqMagCALACAA&FORM=ANSPA1&PC=U531");
		System.out.println("[URL:"+driver.getCurrentUrl()+"]");
		// điều hướng back lại trang
		driver.navigate().back();
		// nhận trang cửa sổ đề xử lý
        System.out.println("[code:"+driver.getWindowHandle()+"]");	
		// nhận source trang
		System.out.println("[code:"+driver.getPageSource()+"]");
	}
	
}
