package GR.Spractice2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverLearning {
	
	public static WebDriver driver;
	

public static void main(String[] args) {
		
	System.setProperty("webdriver.chrome.driver","/Users/rashidaislam/Downloads/chromedriver 3");
	driver = new ChromeDriver();
	driver.get("https://google.com");
	
//	Webdriver driver = new Webdriver();
//	
//	System.setProperty("webdriver.gecko.driver","/Users/rashidaislam/Downloads/geckodriver" );
	
			
	
	
}
}
