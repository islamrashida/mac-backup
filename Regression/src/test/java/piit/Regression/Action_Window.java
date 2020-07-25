package piit.Regression;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class Action_Window {

	WebDriver driver;
	@Test
	public void f() {

		Actions obj = new Actions (driver);
		WebElement shift = driver.findElement(By.linkText("Forgotten account?"));
		obj.keyDown(shift, Keys.LEFT_SHIFT).click().build().perform();
		String CurrnectWindowHand = driver.getWindowHandle();
		System.out.println("Current Window iD "+CurrnectWindowHand);
		ArrayList <String> transfer = new ArrayList <String> (driver.getWindowHandles());
		System.out.println("Size of the ArrayList : "+transfer.size());

		for (String windows:transfer) {

			if(windows.equalsIgnoreCase(CurrnectWindowHand)) {
				System.out.println("This is current Window");
			}else {
				driver.switchTo().window(windows);
				driver.findElement(By.id("identify_email")).sendKeys("Modon Kumar");
			}
		} 



	}
	@BeforeMethod
	public void beforeMethod() {
	}

	@AfterMethod
	public void afterMethod() {

	}
	@ Parameters({"browser", "url"})

	@BeforeClass
	public void browser (String browser, String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/rashidaislam/Downloads/chromedriver 5");
		driver = new ChromeDriver();
		driver.navigate().to(url);
		Thread.sleep(1000);


	}

	@AfterClass
	public void afterClass() {
	}

	@BeforeTest
	public void beforeTest() {
	}

	@AfterTest
	public void afterTest() {
	}

}
