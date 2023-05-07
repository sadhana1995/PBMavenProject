package pBazaarLogInPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

@FindBy(xpath="//a[@class=\"sign-in\"]")
private WebElement signIN;
 
 public LogInPage(WebDriver driver) 
 {
	PageFactory.initElements(driver, this); 
	 
 }
	
	public void clickLogInPageSignInBtn() 
	{
		signIN.click();
	}
	
	
}
