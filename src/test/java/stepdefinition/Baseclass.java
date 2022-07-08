package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static ChromeDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_103.exe");
		//WebDriver driver = new ChromeDriver();
		driver=new ChromeDriver();
		//driver.get("https://www.facebook.com");
		//return driver;
	}

}
