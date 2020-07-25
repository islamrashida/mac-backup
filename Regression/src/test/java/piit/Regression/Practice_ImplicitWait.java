package piit.Regression;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Practice_ImplicitWait {

	WebDriver driver;
	@Test
	public void f() throws InterruptedException {
		
				
		WebElement FirstNameField = driver.findElement(By.xpath("//*[contains(@name, 'firstname')]"));
		FirstNameField.sendKeys("Rashida");
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
	}

	
	@Parameters ({"browser", "url" })
	@BeforeClass
	public void browser(String browser,String url) throws InterruptedException {

		if(browser.equalsIgnoreCase("Chrome")) {

			String userDirectoryPath = System.getProperty("user.dir");
			System.out.println(userDirectoryPath);
			System.setProperty("webdriver.chrome.driver", "/Users/rashidaislam/Downloads/chromedriver 2");
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
			driver.manage().window().maximize(); //how to maximize
		}else {
			System.out.println("Wrong browser name");
		}
	}

	@AfterClass
	public void afterClass() {
	}

}
