package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ShopingSiteLogin {
	
	WebDriver driver;
	
	public ShopingSiteLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
String expectedUsername = "Vikas";
	
	@FindBy(xpath ="//input[@data-qa='login-email']")
	WebElement UserEmail;
	
	@FindBy(xpath ="//input[@data-qa='login-password']")
	WebElement UserPassword;
	
	@FindBy(xpath ="//button[@data-qa='login-button']")
	WebElement LogginButton;
	
	@FindBy(xpath="//b[normalize-space()='Vikas']")
	WebElement LoggedInUser;
	
	@FindBy(xpath ="//p[text()=\"Your email or password is incorrect!\"]")
	WebElement logginErrorMessage;
	
	@FindBy(xpath="//a[normalize-space()='Logout']")
	WebElement LoggedOutBtn;
	
	
	public void EnterValidCreds(String username, String password) {
		UserEmail.sendKeys(username);
		UserPassword.sendKeys(password);
	}
	
	public void userLogin() {
		LogginButton.click();
		String currenturl = "https://automationexercise.com/";
		Assert.assertEquals(currenturl,"https://automationexercise.com/", "Incorrect url");
		String ActualUserN = LoggedInUser.getText();
		Assert.assertEquals(ActualUserN, expectedUsername, "Logged-in username does not match expected username!");	
		
		
	}
	
	public void invalidUserSignIn(String Invaliduser, String Invalidpass) {
		UserEmail.sendKeys(Invaliduser);
		UserPassword.sendKeys(Invalidpass);
		LogginButton.click();
		String loginErrMessage= logginErrorMessage.getText();
		System.out.println(loginErrMessage);
		Assert.assertEquals(loginErrMessage, "Your email or password is incorrect!", "Error Message doesn't match");
		
	}
	
	public void userLogOut() {
		LoggedOutBtn.click();
	}
	
	
	

	
}

