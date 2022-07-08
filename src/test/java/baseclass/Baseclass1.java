package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass1 {
	public WebDriver driver;
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_103.exe");
		//WebDriver driver = new ChromeDriver();
		driver=new ChromeDriver();
		//return driver;
	}

}
