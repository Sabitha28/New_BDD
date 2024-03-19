package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver driver;
	public void setup() throws InterruptedException, IOException {
		
		//*** chrome version 122.0.6261.129 having issue not able to execute the script ****//
		//** executed in Edge using webdriver manager without download driver manually **// 
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sannaram\\OneDrive - Corebridge Financial\\Documents\\Sabitha\\New_BDD-main\\chromedriver.exe");
		
EdgeOptions options = new EdgeOptions();		 
WebDriverManager.edgedriver().setup();
options.addArguments("--remote-allow-origins=*");
driver = new EdgeDriver(options);
Thread.sleep(2000);
String url = Configfilereader.getPath();
	System.out.println("urll:" + url);
		driver.get(url);
		Thread.sleep(2000);
		
	}


	
	
	public String captureScreenShot(String ScreenshotName) throws IOException {
        String timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
        TakesScreenshot tst = (TakesScreenshot) driver;
        File source = tst.getScreenshotAs(OutputType.FILE);
        String dest = (System.getProperty("user.dir") + "\\target\\" + ScreenshotName + "_Screenshot.png");
        File destination = new File(dest);
        FileHandler.copy(source, destination);
        return destination.getName();
    }
}

