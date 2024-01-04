package Functions;

import java.time.Duration;
import java.util.List;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Product_Filtering {
	public double Input;
	public double minPrice;
	public float maxPrice;
	public String Service;
	public String Dimension;
	public int Size;

	public static void Filterin(WebDriver driver, String textToFind) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(200));
		List<WebElement> checkboxElements = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".ant-checkbox-input")));
		for (WebElement checkboxElement : checkboxElements) {
			String businessValueText = checkboxElement.getAttribute("businessvalue");
			if (businessValueText.equals(textToFind)) {
				checkboxElement.click();

				break;
			}

		}

	}

	public static void Price(WebDriver driver, double minPrice, double maxPrice) {

		List<WebElement> priceInputs = driver.findElements(By.cssSelector(".q9tZB"));

		WebElement minPriceInput = null;
		WebElement maxPriceInput = null;
		for (WebElement priceInput : priceInputs) {
			String placeholder = priceInput.getAttribute("placeholder");
			if (placeholder.equals("Tối thiểu")) {
				minPriceInput = priceInput;
			} else if (placeholder.equals("Tối đa")) {
				maxPriceInput = priceInput;
			}
		}

		if (minPriceInput != null && maxPriceInput != null) {
			minPriceInput.clear();
			minPriceInput.sendKeys(Double.toString(minPrice));

			maxPriceInput.clear();
			maxPriceInput.sendKeys(Double.toString(maxPrice));
		} else {

			System.out.println("Không tìm thấy element input min hoặc max");
		}
	}

	public static void ButtonPrice(WebDriver driver) {
		WebElement buttonElement = driver.findElement(By.cssSelector(".gJ98q .y9-OE ._1lPeN button"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(buttonElement));
		buttonElement.click();
	}

	public static void Shipping(WebDriver driver, String Service) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		List<WebElement> Shippings = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector(".gJ98q .y9-OE .uM5g9 .ant-checkbox-input[businesstype='multiple']")));
		for (WebElement shipping : Shippings) {
			String shippingValue = shipping.getAttribute("businessvalue");
			if (shippingValue.equals(Service)) {
				shipping.click();
			}
		}
	}

	public static void Size_Product(WebDriver driver, String Dimension, int Size) {
		WebElement Size_Product = driver.findElement(By.cssSelector(".ant-select-selector"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(Size_Product));
		wait.until(ExpectedConditions.elementToBeClickable(Size_Product));
		String value = Size_Product .getText();
		if (value.equals(Dimension)) {
			Size_Product.click();

			List<WebElement> Option_1s = driver.findElements(By.cssSelector(".ant-checkbox-wrapper"));
			for (WebElement Option_1 : Option_1s) {
				String Option_1Value = Option_1.getText();
				try {
					int Option_ValueInt = Integer.parseInt(Option_1Value);
					if (Option_ValueInt == Size) {
						Option_1.click();
						break;
					} else {
						System.out.println("Không tìm thấy kích cỡ riêng: " + Size);
					}
				} catch (NumberFormatException e) {
					System.err.println("Lỗi: Không thể chuyển đổi giá trị '" + Option_1Value + "' thành số!");

				}
			}
		}
	}

}
