package piit.Regression;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Route {
	
	static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
	
		
		browser("chrome", "http://www.facebook.com");
		
		//WebElement loginbutton = driver.findElement(By.xpath("/html/body/div/div/div/div/div/div/div/form/table/tbody/tr/td/label/input"));
		
		//loginbutton.click();
		WebElement EmailFieldHome = driver.findElement(By.xpath("////input[@name'='email']']"));
		WebElement PasswordFieldHome = driver.findElement(By.xpath("//input[@name='pass']"));
		WebElement SubmitFieldHome = driver.findElement(By.xpath("//input[@name='submit']"));
		EmailFieldHome.sendKeys("islamrashida@gmail.com");
		PasswordFieldHome.sendKeys("Piit Course");
		

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