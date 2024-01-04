package Functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Infor_Product {
	public int Numbers;
	public int Size;
	public int quantity;

	public static void Find_Product(WebDriver driver, int Numbers) {
		List<WebElement> Numberss = driver.findElements(By.cssSelector(".product-item"));
		if (Numbers >= 0 && Numbers < Numberss.size()) {
			WebElement numbers = Numberss.remove(Numbers);
			numbers.click();
		} else
			System.out.println("Không tìm thấy sản phẩm");

	}

	public static void Get_Infor(WebDriver driver, int Size) {
		List<WebElement> Infors = driver.findElements(By.cssSelector(".sku-variable-size-selected"));
		for (WebElement Infor : Infors) {
			String Infor_Value = Infor.getText();
			if (Integer.parseInt(Infor_Value) == Size) {
				Infor.click();
			} else {
				System.out.println("Không tìm thấy Size");
			}
		}
	}

	public static void Quantity(WebDriver driver, int quantity) {
		WebElement Quantity = driver.findElement(By.cssSelector("next-number-picker-input"));
		Quantity.clear();
		Quantity.sendKeys(String.valueOf(quantity));

	}

	public static void Addcard_Product(WebDriver driver) {
		try {
			WebElement Addcard = driver.findElement(By.cssSelector(".add-to-cart-buy-now-btn"));
			if (Addcard.isDisplayed() && !Addcard.getAttribute("disable").equals("true")) {
				Addcard.click();
			} else {
				System.out.println("Không thể Click vào thêm giỏ hàng");
			}
		} catch (Exception e) {
			System.out.println("Không tìm thấy Element");
		}

	}

	public static void TurnPopup(WebDriver driver) {
		WebElement OffPopup = driver.findElement(By.cssSelector(".next-dialog-close"));
		if (OffPopup.isDisplayed() && !OffPopup.getAttribute("disabled").equals("true")) {
			OffPopup.click();
		} else {
			System.out.println("Không thể tương tác với Popup");
		}
	}

}
