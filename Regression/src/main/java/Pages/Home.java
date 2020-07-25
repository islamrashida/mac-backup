package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
	
	@FindBy(id = "email")
	WebElement emailField;
	
	@FindBy (xpath = "//div//div//div//div//div//div//div//form//td[2]//input[1]")
	WebElement passwordField;

	@FindBy (id = "loginbutton")
	WebElement button;

	@FindBy(xpath = "//html//body//div//div//div//div//div//div//div//form//table//tbody//tr//td//div//a")
	WebElement forgotLink;

	//creating constructor
	
	public Home (WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	// now create method
	
	public void emailField () {
		
		emailField.sendKeys("modonKumar");
	}
	
	public void passwordField () {
		passwordField.sendKeys("abulRbabul");
	}
	
	public void loginButton () {
		button.click();
	}
	
	public void forgotLink () {
		forgotLink.click();
	}

}
