package browserdrivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.quit();

	}

}
