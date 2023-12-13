package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver driver;
	public void launchBrowser() throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sannaram\\OneDrive - Corebridge Financial\\Documents\\Sabitha\\New_BDD-main\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 driver = new ChromeDriver(options);
		String url = Configfilereader.getPath();
		System.out.println("urll:" + url);
		driver.get(url);
		Thread.sleep(2000);
	}

}
