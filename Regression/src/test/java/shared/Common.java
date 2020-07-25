package shared;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

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

public class Common {
	public WebDriver driver;

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

  @AfterClass
  public void afterClass() throws IOException, InterruptedException { 
	  Pictures();
	  Thread.sleep(3000);
	  driver.quit();
  }
   

    public void Pictures() throws IOException {
    	String userdirectoriespth = System.getProperty("user", "dir");
    	Date dt= new Date();
		String ut = dt.toString().replace(" ", "_").replace(":", "_") + ".jpg";
		File CaptureShots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//String userDirectoryPath;
		FileHandler.copy(CaptureShots, new File("/Users/rashidaislam/eclipse-workspace/Regression/Photos/"+ut));

    }
}

	






