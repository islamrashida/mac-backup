package GR.SeleniumJune28;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Assignment {
	
	public static WebDriver driver;
	

	public static void main(String[] args) throws InterruptedException {
			
		System.setProperty("webdriver.chrome.driver", "/Users/rashidaislam/Downloads/chromedriver 5");
		 driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
		WebElement FirstNameField = driver.findElement(By.xpath("//*[contains(@name, 'firstname')]"));
		FirstNameField.sendKeys("Rashida");
		
		WebElement LastNameField = driver.findElement(By.xpath("//*[contains(@name, 'lastname')]"));
		LastNameField.sendKeys("Islam");
		
		WebElement PhNumberField = driver.findElement(By.xpath("//*[contains(@name, 'reg_email__')]"));
		PhNumberField.sendKeys("islammashu@gmail.com");
		
		WebElement ReEmailID = driver.findElement(By.xpath("//*[contains (@name, 'reg_email_confirmation__')]"));
		ReEmailID.sendKeys("islammashu@gmail.com");
		
		WebElement NewPassword   = driver.findElement(By.xpath("//*[contains(@name, 'reg_passwd__')]"));
		NewPassword.sendKeys("fbsigning");
		
		WebElement birthmonth = driver.findElement(By.xpath("//*[contains (@name, 'birthday_month')]"));
		Select MonthIndex = new Select(birthmonth);
		MonthIndex.selectByVisibleText("Jun");
		Thread.sleep(2000);
		
		WebElement birthdate = driver.findElement(By.xpath("//*[contains(@name, 'birthday_day')]"));
		Select DateIndex = new Select(birthdate);
		DateIndex.selectByVisibleText("4");
		//Thread.sleep(2000);
		
		WebElement BirthYear =  driver.findElement(By.xpath("//*[contains (@name, 'birthday_year' )]"));
		Select YearIndex = new Select (BirthYear);
		YearIndex.selectByVisibleText("1986");
		
		WebElement GenderField = driver.findElement(By.xpath("//*[contains (@id,'u_0_6')]"));
		GenderField.click();
	
		
		WebElement SignupField = driver.findElement(By.xpath("//*[contains(@name,'websubmit')]"));
		SignupField.click();
		Thread.sleep(2000);		
		//driver.navigate().back();
		driver.get("https://www.google.com");
		driver.get("http://www.facebook.com");
		
		WebElement Log_in_field = driver.findElement(By.xpath("//*[contains (@data-testid, 'royal_email')]"));
		Log_in_field.sendKeys("islammashu@gmail.com");
		
		//WebElement EmailField = driver.findElement(By.xpath("////input[@name'='email']']"));
		//Select Email = new Select(EmailField);
		//EmailField.sendKeys("islamrashu@gmail.com");
		
		WebElement Log_in_pass = driver.findElement(By.xpath("//*[contains (@data-testid, 'royal_pass')]"));
		Log_in_pass.sendKeys("HijiBiji");
		
				
		
		//WebElement loginButton = driver.findElement(By.xpath("//input[@type ='submit']"));
		//loginButton.click();
		//driver.navigate().back();
		//Thread.sleep(2000);
		
		//WebElement ForgotAcctField = driver.findElement(By.xpath("//*[contains(@name, 'timezone')]"));
		//ForgotAcctField.click();
		
		WebElement Login_Button = driver.findElement(By.xpath("//*[contains(@data-testid, 'royal_login_button')]"));
		Login_Button.click();
		Thread.sleep(2000);
		driver.navigate().back();
		//driver.navigate().back();
		//driver.get("http://www.facebook.com");
		WebElement Forgot_ac_Link = driver.findElement(By.linkText("Forgotten account?"));
		Forgot_ac_Link.click();
		Thread.sleep(2000);
		driver.quit();
		
		
		
		
		
		
		
	
		
				
		
		
		
		
		
		
				

	}

}

