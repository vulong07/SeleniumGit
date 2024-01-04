
import org.openqa.selenium.WebDriver;

import Functions.Infor_Product;
import Functions.Login;
import Functions.Product_Cancel_Payment;
import Functions.Product_Filtering;
import Functions.Product_Payment;
import Functions.Product_Search;
import SetUp.Config;



public class Run {
	public static void main(String[] args) throws Exception {
		String link = "https://member.lazada.vn/user/login?spm=a2o4n.home-vn.header.d5.19053bdc146Tjw&redirect=https%3A%2F%2Fwww.lazada.vn%2F";
		Thread thread = new Thread(() -> {
			try {
				WebDriver driver = Config.getDriver("Edge");
				driver.get(link);

				new Login(driver, "longb3676@gmail.com", "Vulong009@@", 500, 0);
				Thread.sleep(2000);
				new Product_Search(driver, "giay nam");
				Thread.sleep(1000);
				Product_Search.ButtonSearch(driver);
				Thread.sleep(500);
				try {
					Product_Filtering.Filterin(driver, "camel");
					Thread.sleep(10000);
				} catch (Exception e) {
					
				}
				try {
					Product_Filtering.Filterin(driver, "adidas");
					Thread.sleep(10000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				Product_Filtering.Filterin(driver,"camel");
				Thread.sleep(10000);
				Product_Filtering.Price(driver, 20000.00,50000.00);
				Product_Filtering.ButtonPrice(driver);
				Thread.sleep(1000);
				Product_Filtering.Shipping(driver,"flashsale");
				Thread.sleep(2000);
				Product_Filtering.Size_Product(driver,"EU", 43);
				Thread.sleep(10000);
				Infor_Product.Find_Product(driver, 1);
				Thread.sleep(10000);
				Infor_Product.Get_Infor(driver, 43);
				Thread.sleep(10000);
				Infor_Product.Quantity(driver, 2);
				Thread.sleep(10000);
				Infor_Product.Addcard_Product(driver);
				Thread.sleep(10000);
				Infor_Product.TurnPopup(driver);
				Thread.sleep(10000);
				Product_Payment.Cart(driver);
				Thread.sleep(10000);
				Product_Payment.ClickInAdd(driver, 2);
				Thread.sleep(10000);
				Product_Payment.Payment(driver);
				Thread.sleep(10000);
				Product_Payment.Payment_Confirmation(driver);
				Thread.sleep(10000);
				Product_Cancel_Payment.Summary(driver);
				Thread.sleep(10000);
				Product_Cancel_Payment.SelectCancel(driver, 2);
				Thread.sleep(10000);
				Product_Cancel_Payment.Cancel(driver);
				Thread.sleep(1000);
				Product_Cancel_Payment.ReasonCancel(driver, 2);
				Thread.sleep(1000);
				Product_Cancel_Payment.ConfirmCancel(driver);
				Thread.sleep(1000);
				Product_Cancel_Payment.ConfirmCancelProduct(driver);
				Thread.sleep(1000);
				driver.quit();
			} catch (Exception e) {
				e.printStackTrace();
			}
		});

		Thread.sleep(500);

		thread.start();

		thread.join();

	}

}
