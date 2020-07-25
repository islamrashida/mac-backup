package piit.Regression;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class Action_iframe_dragAndDrop {
	
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	 
	
	  Actions obj = new Actions (driver);
		
		driver.switchTo().frame(0);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));

		obj.dragAndDrop(draggable, droppable).build().perform();
		driver.switchTo().parentFrame();
		driver.findElement(By.linkText("Slider")).click();
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
		obj.dragAndDropBy(slider, 400, 0).build().perform();
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
