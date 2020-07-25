package Sites.PageObjectModelFrameWork;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import javax.imageio.IIOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class BaseClass {
	public WebDriver driver;
	
 
  @Parameters({"browser", "url"})
  @BeforeClass
  public void browser(String browser,String url) throws InterruptedException {
	  if(browser.equalsIgnoreCase("Chrome")) {
			
			//String userDirectoryPath = System.getProperty("user.dir");
		  System.setProperty("webdriver.chrome.driver", "/Users/rashidaislam/Downloads/chromedriver 5");
			driver = new ChromeDriver();
			driver.navigate().to(url);
			
		driver.manage().window().maximize();//how to maximize the screen
		
		} else if(browser.equalsIgnoreCase("Firefox")) {
			
			//String userDirectoryPath = System.getProperty("user.dir");
			//System.out.println(userDirectoryPath);
			
	//		System.out.println(userDirectoryPath);
			System.setProperty("webdriver.gecko.driver", "/Users/rashidaislam/Downloads/geckodriver");
			
			driver = new FirefoxDriver();
			driver.navigate().to(url);
			driver.manage().window().maximize(); //how to maximize
		}else {
			System.out.println("Wrong browser name");
	}
	}
  @AfterClass
  public void afterClass() throws IOException, IIOException, InterruptedException  {
	  screenshots();
	  Thread.sleep(6000);
	  driver.quit();
  }
	  
  public void screenshots() throws IOException {
	  String userDirectoryPath = System.getProperty("user.dir");
		Date dt = new Date();
		String ut = dt.toString().replace(" ", "_").replace(":", "_") + ".jpg";
		File CaptureShots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(CaptureShots, new File(userDirectoryPath+"/Photos/"+ut));

	
}

	
}
  


