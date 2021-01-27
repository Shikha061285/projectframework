package stepdefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps 
{
	private static String title;
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	
	@Given("^User is on Log In Page$")
	public void user_is_on_log_in_page() 
	{
	   DriverFactory.getDriver().get("https://www.dollardays.com/sitelogin.aspx");
	    
	}

	@When("^User gets the title of Page$")
	public void user_gets_the_title_of_page() 
	{
	   title =  loginpage.getLoginPageTitle();
	   System.out.println("login page title is: " +title);
	}

	@Then("^Page Title will be$")
	public void page_title_will_be(String expectedtitlename) 
	{
	   Assert.assertTrue(title.contains(expectedtitlename)); 
	}


	@Then("^Forgot your email address or password? link should be displayed$")
	public void forgot_your_email_address_or_password_link_should_be_displayed() 
	{
	   Assert.assertTrue(loginpage.isForgotPswdLinkexists());
	}

	@When("^User enters Email Address$")
	public void user_enters_email_address(String email) 
	{
	    loginpage.enteremailaddress(email);
	}

	@When("^User enters Password$")
	public void user_enters_password(String pass) 
	{
	    loginpage.enterpassword(pass);
	}

	@When("^User clicks on Sign In Button$")
	public void user_clicks_on_sign_in_button() 
	{
	    loginpage.clickonsignin();
	}

	
	

}
