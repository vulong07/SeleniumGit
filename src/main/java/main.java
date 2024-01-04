import org.openqa.selenium.WebDriver;

import Functions.Login;
import SetUp.Config;

public class main {

		 public static void runTest(String[] args) throws Exception {
		        // Get browser from system property
		        String browser = System.getProperty("browser");

		        // Get URL and driver based on browser
		        String url = Config.getUrl(browser);
		        WebDriver driver = Config.getDriver(browser);

		        // Login with username and password
		        new Login(driver, "long3676@gmail.com", "Vulong009@@");

		        // Perform further actions or tests using the driver object

		        // Quit the driver after completing tasks
		        driver.quit();
		    
		    }
		 public static void main(String[] args) {
		        // Run the test
		        runTest(args);
		 }
		

}
