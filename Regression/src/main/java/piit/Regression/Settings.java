package piit.Regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Settings {
	
	//private static final String FirstNameField = null;
	//private static final WebElement SignUpButton = null;
	public static WebDriver driver; //
	

	public static void main(String[] args) throws InterruptedException {
		// how to open Chrome
		
		browser("chrome", "https://www.facebook.com");
		
		//how to use locators and store into variable
		WebElement FirstnameField = driver.findElement(By.id("u_0_m"));
		
		FirstnameField.sendKeys("Saleem");
		
		driver.findElement(By.id("u_0_m")).sendKeys("Shahbaz");
		Thread.sleep(6000);
		
		FirstnameField.clear(); //how to clear
		FirstnameField.sendKeys("Shahbaz");
		
		WebElement LastNameField = driver.findElement(By.name("lastname"));
		LastNameField.sendKeys("Sajjad");
		WebElement ForgotLink = driver.findElement(By.linkText("forgot account?"));
		ForgotLink.click();
		driver.navigate().back();
		WebElement signupButton = driver.findElement(By.name("websubmit"));
		WebElement FemaleButton = driver.findElement(By.id("u_0_6"));
		signupButton.click();
		FemaleButton.click();
		
		
		
		
		
		
		/*System.setProperty("webdriver.chrome.driver", "/Users/rashidaislam/Downloads/chromedriver 2");
		driver = new ChromeDriver();
		driver.navigate().to("https://google.com");
		driver.get("http://www.amazon.com");
		driver.navigate().refresh(); // how to refresh
		driver.navigate().back(); //how to go back
		driver.navigate().forward();// how to forward
		driver.manage().window().maximize();//how to maximize the screen
		//driver.quit();
		 */
		 
    /*//		
			System.setProperty("webdriver.gecko.driver", "/Users/rashidaislam/Downloads/geckodriver");
			 driver = new FirefoxDriver();
			 driver.navigate().to("https://google.com");
		 	 driver.get("http://www.amazon.com");
			 driver.navigate().refresh(); // how to refresh
			 driver.navigate().back(); //how to go back
			 driver.navigate().forward();// how to forward
			 driver.manage().window().maximize();//how to maximize the screen */
	}
		
		public static void browser(String browser,String url) throws InterruptedException {
		if(browser.equalsIgnoreCase("Chrome")) {
			
			String userDirectoryPath = System.getProperty("user.dir");
			System.out.println(userDirectoryPath);
			System.setProperty("webdriver.chrome.driver", "/Users/rashidaislam/Downloads/chromedriver 2");
			driver = new ChromeDriver();
			driver.navigate().to(url);
			
		driver.manage().window().maximize();//how to maximize the screen
		
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
