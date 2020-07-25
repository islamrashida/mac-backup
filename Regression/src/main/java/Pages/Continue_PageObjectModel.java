package Pages;

import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.BeforeClass;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Continue_PageObjectModel {
	WebDriver driver;
	@Test
	public void f() throws IOException {
		
		Home obj = new Home (driver);

		obj.emailField();

		screenShotPage();

		obj.passwordField();

		screenShotPage();

		obj.loginButton();
	}

	@Parameters ({"browser", "url" })
	@BeforeClass
	public void browser(String browser,String url) throws InterruptedException {

		if(browser.equalsIgnoreCase("Chrome")) {

			String userDirectoryPath = System.getProperty("user.dir");
			System.out.println(userDirectoryPath);
			System.setProperty("webdriver.chrome.driver", "/Users/rashidaislam/Downloads/chromedriver 5");
			driver = new ChromeDriver();
			driver.navigate().to(url);

			driver.manage().window().maximize();//how to maximise the screen

		} else if(browser.equalsIgnoreCase("Firefox")) {

			String userDirectoryPath = System.getProperty("user.dir");
			System.out.println(userDirectoryPath);

			System.out.println(userDirectoryPath);
			System.setProperty("webdriver.gecko.driver", "/Users/rashidaislam/Downloads/geckodriver");

			driver = new FirefoxDriver();
			driver.navigate().to(url);
			driver.manage().window().maximize(); //how to maximise
		}else {
			System.out.println("Wrong browser name");
		}
	}


	@Test
	public void forgotL() throws IOException {

		//Home ob = new Home (driver);

		//ob.forgotLink();
		//screenShotPage();

		Forgot fr = new Forgot (driver);
		fr.button2();
		screenShotPage ();

	}
	public void screenShotPage () throws IOException {
		String userDirectoryPath = System.getProperty("user.dir");

		Date date = new Date();
		String ut = date.toString().replace(" ", "_").replace(":", "_") + ".jpg";
		File CaptureShots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(CaptureShots, new File(userDirectoryPath+"/Photos/"+ut));

	}
	@AfterClass
	public void afterClass() {
		driver.close();
		driver.quit();
	}



}
