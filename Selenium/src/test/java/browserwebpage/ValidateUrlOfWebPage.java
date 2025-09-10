package browserwebpage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidateUrlOfWebPage {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		String expectedUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
		String actualUrl = driver.getCurrentUrl();

		if (expectedUrl.equals(actualUrl)) {
			System.out.println("URL Matched");
		} else {
			System.out.println("URL Mismatched");
		}

		driver.quit();

	}

}
