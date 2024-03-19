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
	

	@Given("login in to app")
	public void login_in_to__app() throws InterruptedException, IOException {
		// Write code here that turns the phrase above into concrete actions
		
		setup();
		Thread.sleep(2000);
	}

	@When("search text")
	public void search_text() throws IOException, InterruptedException {

		driver.findElement(By.xpath("//input[@class='navbar__search--input']")).sendKeys("Selenium");
		Thread.sleep(1000);
	}

	
	@AfterStep
	public void addScreenshot(Scenario scenario) {

		final byte[] screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
		scenario.attach(screenshot, "image/png", "image");

	}

}
