package Functions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Login {
	public Login(WebDriver driver, String name, String password, int xOffset, int yOffset) throws InterruptedException {

		WebElement UsrernamField = driver.findElement(By.cssSelector("input[data-meta='Field']"));
		UsrernamField.clear();
		UsrernamField.sendKeys(name);
		Thread.sleep(1000);

		WebElement PasswordField = driver.findElement(By.cssSelector("input[type='password']"));
		PasswordField.clear();
		PasswordField.sendKeys(password);
		Thread.sleep(1000);

		try {
			WebElement Button = driver
					.findElement(By.xpath("//button[@class='next-btn next-btn-primary next-btn-large']"));
			Button.click();
		} catch (Exception e) {
			System.out.println("Khong can den button");
		}
		try {
			WebElement Button_1 = driver.findElement(By.cssSelector(".nc_iconfont.btn_slide"));
			Actions action = new Actions(driver);
			action.dragAndDropBy(Button_1, xOffset, yOffset).build().perform();

			Thread.sleep(10000);

		} catch (Exception e) {

			System.out.println("Khong the keo thanh cong cu");
		}

	}
}
