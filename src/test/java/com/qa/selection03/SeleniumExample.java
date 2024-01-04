package com.qa.selection03;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumExample {
    public static void main(String[] args) throws InterruptedException {
        // Thiết lập đường dẫn đến ChromeDriver
        System.setProperty("webdriver.chrome.driver", "src/test/resource/executables/chromedriver-win64/chromedriver.exe");

        // Khởi tạo WebDriver
        WebDriver driver = new ChromeDriver();

        // Mở trang web chứa mã HTML
        driver.get("https://www.linkedin.com/jobs/search/?currentJobId=3731571978&geoId=104195383&keywords=Business%20Development&location=Vietnam"); // Thay URL của trang web của bạn

        // Tìm phần tử dropdown "Experience level"
        WebElement experienceDropdown = driver.findElement(By.xpath("//button[contains(text(),'Experience level')]"));

        // Kích hoạt dropdown để hiển thị các tùy chọn
        experienceDropdown.click();

        // Tìm tất cả các tùy chọn trong dropdown
        
       
        // Tìm tất cả các tùy chọn trong dropdown
        List<WebElement> listItem = driver.findElements(By.cssSelector("p.display-flex"));

        // In ra các giá trị của dropdown
        for (WebElement item : listItem) {
            String text = item.getText();
            System.out.println(text);
        }
       
        // Đóng trình duyệt
        driver.quit();
    }
}

