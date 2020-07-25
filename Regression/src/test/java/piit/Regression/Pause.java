package piit.Regression;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;

public class Pause {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	 
	  Actions obj = new Actions (driver);
		WebElement signOptionsAmazon = driver.findElement(By.id("nav-link-accountList"));
		Thread.sleep(6000);
		obj.moveToElement(signOptionsAmazon).build().perform();
		Thread.sleep(6000);
		WebElement orders = driver.findElement(By.xpath("//span[text()='Your Orders']"));
		obj.moveToElement(orders).click().perform();

  }
 
  @Parameters({"browser", "url"})

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
}
