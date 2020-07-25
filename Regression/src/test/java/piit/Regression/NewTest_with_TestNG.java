package piit.Regression;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;

public class NewTest_with_TestNG {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  WebElement drop = driver.findElement(By.xpath("//*[@name='birthday_month']"));
		
		Select ui = new Select(drop);
		ui.selectByIndex(8);
		Thread.sleep(6000);
		ui.selectByValue("10");
		Thread.sleep(6000);
		ui.selectByVisibleText("Apr");
			
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  @BeforeClass
  public void beforeClass() {
	  
	  String userDirectoryPath = System.getProperty("user.dir");
		System.out.println(userDirectoryPath);
		System.setProperty("webdriver.chrome.driver", "/Users/rashidaislam/Downloads/chromedriver 2");
		driver = new ChromeDriver();
		driver.navigate().to("https://fb.com");
		
	driver.manage().window().maximize();//how to maximize the screen
  }

  @AfterClass
  public void afterClass() {
  }

}
