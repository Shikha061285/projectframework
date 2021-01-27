package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
   private WebDriver driver;
   
   
   //By Locators
   
   private By emailaddress = By.id("inputLoginUsername");
   private By password = By.id("inputLoginPassword");
   private By SignIn = By.linkText("Sign in");
   private By ForgotPassword = By.linkText("Forgot your email address or password?");
   //constructor of page class
   
   public LoginPage(WebDriver driver)
   {
	   this.driver = driver;
   }
   
   // actions: features of the page
    public String getLoginPageTitle()
    {
    	return driver.getTitle();
    }
    
    public boolean isForgotPswdLinkexists()
    {
    	return  driver.findElement(ForgotPassword).isDisplayed();
    }
    public void enteremailaddress(String email)
    {
    	driver.findElement(emailaddress).sendKeys(email);
    }
    public void enterpassword ( String pass)
    {
    	driver.findElement(password).sendKeys(pass);
    }
   
   public void clickonsignin()
   {
	   driver.findElement(SignIn).click();
	   System.out.println("done");
   }
}
