import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class testNGpractice {
	WebDriver driver;
  @Test
  public void f() {
	  System.out.println("this is test annotation");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is before method annotation");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after method annotation");
  }
  @Test
  public void td() {
	  System.out.println("this is a test");
  }
  @Test
  public void third() {
	  System.out.println("this third test");
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
}