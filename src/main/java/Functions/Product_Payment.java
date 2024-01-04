package Functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Product_Payment {
	public int prosition;

	public static void Cart(WebDriver driver) {
		try {
			WebElement Cart = driver.findElement(By.cssSelector(".lzd-nav-cart"));
			if (Cart.isDisplayed() && !Cart.getAttribute("disabled").equals("true")) {
				Cart.click();
			} else {
				System.out.println("Không thể Click");
			}

		} catch (Exception e) {
			System.out.println("Khong tim thay element ");
		}
	}

	public static void ClickInAdd(WebDriver driver, int prosition) {
		List<WebElement> ClickInAdds = driver.findElements(By.cssSelector(".promoted-icon"));
		if (prosition > 0 && prosition < ClickInAdds.size()) {
			ClickInAdds.get(prosition).click();
		} else {
			System.out.println("Không tìm thấy phần tử");
		}

	}

	public static void Payment(WebDriver driver) {
		try {
			WebElement Payment = driver.findElement(By.xpath("//button[@type='button']"));
			if (Payment.isDisplayed() && !Payment.getAttribute("disabled").equals("true")) {
				Payment.click();
			} else {
				System.out.println("Không thể Click");
			}
		} catch (Exception e) {
			System.out.println("Không tìm thấy Element");
		}
	}

	public static void Payment_Confirmation(WebDriver driver) {
		try {
			WebElement Confirmation = driver.findElement(By.cssSelector(".undefined.checkout-order-total button"));
			if (Confirmation.isDisplayed() && Confirmation.getAttribute("disabled").equals("true")) {
				Confirmation.click();
			} else {
				System.out.println("Không tìm thể xác nhận");
			}
		} catch (Exception e) {
			System.out.println("Không tìm thấy Element");
		}
	}

}
