package piit.Regression;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.AfterClass;

public class Asertion {
	private static final String Sysyem = null;
	WebDriver driver;
  @Test
  public void f() throws IOException {
	  WebElement button = driver.findElement(By.id("loginbutton"));
	  boolean bt = button.isDisplayed();
	  System.out.println("bt");
	  
	  File CaptureShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(CaptureShot, new File("/Users/rashidaislam/eclipse-workspace/Regression/Photos/page.jpg"));
	  
	  if(bt == true) {
		  button.click();
	  }else {
		  System.out.println("This is not displaying");
		  
		  		 
	  }
	  
	  
  }
	@ Parameters({"browser", "url"})

	@BeforeClass
	public void browser (String browser, String url) throws InterruptedException {
		if (browser.equalsIgnoreCase("chrome")) {
			String userdirectoriespth = System.getProperty("user.dir");
			System.out.println(userdirectoriespth);
		System.setProperty("webdriver.chrome.driver", userdirectoriespth);
		driver = new ChromeDriver();
		driver.navigate().to(url);
		Thread.sleep(1000);
		driver.manage().window().maximize();
		
		}else if(browser.equalsIgnoreCase("firefox")) {
			String userdirectoriespth = System.getProperty("user.dir") ;
			System.out.println(userdirectoriespth);
System.setProperty("webdriver.gecko.driver", userdirectoriespth);
			
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
  public void screenshotpage() throws IOException {
	  String userdirectoriespth = System.getProperty("user.dir");
	  Date dt = new Date();
	  String ut = dt.toString().replace(" ",  "_").replace(":",  "_")+".jpg";
	  File CaptureShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  FileHandler.copy(CaptureShot,  new File(userdirectoriespth+"\\Photos\\"+ut));
	  
	  
  }

}
