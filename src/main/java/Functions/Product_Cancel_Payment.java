package Functions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Product_Cancel_Payment {
	public int reason;
	public int Cancel;

	public static void Summary(WebDriver driver) {
		WebElement Summary_1 = driver.findElement(By.cssSelector(".checkout-summary"));
		if (Summary_1.isDisplayed() && !Summary_1.getAttribute("disable").equals("true")) {
			Summary_1.click();
		} else {
			System.out.println("không thể Click");
		}
	}

	public static void SelectCancel(WebDriver driver, int Cancel) {
		List<WebElement> selectcancels = driver.findElements(By.cssSelector("item-image"));
		if (selectcancels.size() > Cancel) {
			selectcancels.get(Cancel).click();
		}
	}

	public static void Cancel(WebDriver driver) {
		WebElement Cancel_1 = driver.findElement(By.cssSelector("text.link.bold"));
		{
			if (Cancel_1.isDisplayed() && !Cancel_1.getAttribute("disabled").equals("true")) {
				Cancel_1.click();
			} else {
				System.out.println("không thể Hủy");
			}
		}
	}

	public static void ReasonCancel(WebDriver driver, int reason) {
		List<WebElement> selectBoxs = driver.findElements(By.cssSelector(".reason-col .next-select.medium.reason"));
		if (selectBoxs.size() > reason) {
			selectBoxs.get(reason).click();
		} else {
			System.out.println("Khong the chon ly do");
		}
	}

	public static void ConfirmCancel(WebDriver driver) {
		WebElement ConfirmCancel = driver.findElement(By.cssSelector(".next-checkbox checked"));
		if (ConfirmCancel.isDisplayed() && !ConfirmCancel.getAttribute("disabled").equals("true")) {
			ConfirmCancel.click();
		} else {
			System.out.println("Khong the chon xac nhan huy don hang ");
		}
	}

	public static void ConfirmCancelProduct(WebDriver driver) {
		WebElement confirmCP = driver.findElement(By.cssSelector(".next-btn next-btn-normal next-btn-large button"));
		if (confirmCP.isDisplayed() && !confirmCP.getAttribute("disabled").equals("true")) {
			confirmCP.click();
		} else {
			System.out.println("Khong the xac nhan huy");
		}
	}
}
