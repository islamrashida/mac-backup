package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Forgot {

	WebDriver driver;

	@FindBy(xpath = "//html//body//div//div//div//div//div//div//form//div//div//div//a")
	WebElement forgot;

	public Forgot (WebDriver driver) { // creating constructor with driver
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void button2 () { // creating method of element according to object

		forgot.click();
	}

}
