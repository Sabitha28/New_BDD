package stepdefinition;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.sun.org.apache.xerces.internal.impl.PropertyManager;

import baseclass.Baseclass1;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
//import baseclass.Baseclass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefinition extends Baseclass {
	// public WebDriver driver;

	/*
	 * Stepdefinition(WebDriver driver){ this.driver=driver; }
	 */
	// Properties pro=new Properties();

	@Given("login in to face book app")
	public void login_in_to_face_book_app() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		// System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		launchBrowser();
		// driver=new ChromeDriver();
		// Thread.sleep(2000);

		// Configfilereader config=new Configfilereader();
		// driver.get("https://www.facebook.com");
		String url = Configfilereader.getPath();
		System.out.println("urll:" + url);
		driver.get(url);
	}

	@When("enter username")
	public void enter_username() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		Configfilereader config = new Configfilereader();

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(Configfilereader.getUserNane());
	}

	@When("enter password")
	public void enter_password() throws IOException {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
		Configfilereader config = new Configfilereader();
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys(Configfilereader.getpassword());
	}

	@Then("click on submit")
	public void click_on_submit() {

	}

	@AfterStep
	public void addScreenshot(Scenario scenario) {

		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");

	}

}
