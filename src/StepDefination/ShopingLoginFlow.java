package StepDefination;


import org.openqa.selenium.chrome.ChromeDriver;
import PageObject.ShopingSiteLogin;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ShopingLoginFlow extends BaseClass{
	
	public void setup() {
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
	}
	
	@Given("User Launch Chrome browser for ShopingSite")
	public void user_launch_chrome_browser_ShopingSite() {
	    shopingSitelgn= new ShopingSiteLogin(driver);
	}
	
	@When("User opens the given URL {string}")
	public void User_opens_URL(String url) {
		driver.get(url);
	}
	
	@When("User enters Email id as {string} and Password as {string}")
	public void user_enters_email_id_as_and_password_as(String emailAdd, String password) {
		shopingSitelgn.EnterValidCreds(emailAdd, password);
	
}
	
	@Then("User click on Login button")
	public void User_Login() {
		shopingSitelgn.userLogin();
	}
	
	@And("User logout")
	public void User_out() {
		shopingSitelgn.userLogOut();
		driver.close();
		 
	}
	

}
