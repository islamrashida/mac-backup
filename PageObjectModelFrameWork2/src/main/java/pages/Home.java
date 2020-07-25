package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home {
	
	WebDriver driver;
	
	@FindBy(xpath = "(//*[text()='My Account'])[1]")
	WebElement MyAccountText;
	
	//@FindBy(xpath = "//*[text()=\"You're shopping \"]")
	//WebElement YouShoppingText;
	
	@FindBy(linkText ="Store Finder")
	WebElement StroreFinderText;
	
	@FindBy(xpath = "//p[3]//a[1]//span[1]")
	WebElement Register;
	
	public Home(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String MyAccountTextVerification() {
		String MyAccountCurrentText=MyAccountText.getText();
		return MyAccountCurrentText;
	}
	
	
	//public String YourShoppingTextVerification() {
	//	String MyAccountCurrentText=YouShoppingText.getText();
	//	return MyAccountCurrentText;
//	}
	
	public String StoreFinderTextVerification() {
		String MyAccountCurrentText=StroreFinderText.getText();
		System.out.println("Passed "+StroreFinderText);
		return MyAccountCurrentText;
	}
	public void MyAccountClick() {
		MyAccountText.click();
	}
	public void Registerbutton() {
		Register.click();
	}
	

}


