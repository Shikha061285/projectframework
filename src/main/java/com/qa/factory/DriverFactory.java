package com.qa.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory
{
 public WebDriver driver;
 
 public static ThreadLocal <WebDriver> tlDriver = new ThreadLocal<WebDriver>();
 
 //This method is used to initialize thread local driver on the basis of given browser
 
 public WebDriver init_driver(String browser)
 {
	 System.out.println("Browser is: "+browser);
	 
	 if (browser.equals("chrome"))
	 {
		 WebDriverManager.chromedriver().setup();
		 tlDriver.set(new ChromeDriver());
	 }
	 else if(browser.equals("firefox"))
	 {
		 WebDriverManager.firefoxdriver().setup();
		 tlDriver.set(new FirefoxDriver()); 
	 }
	 else if(browser.equals("safari"))
	 {
		 WebDriverManager.firefoxdriver().setup();
		 tlDriver.set(new SafariDriver()); 
	 }
	 else
	 {
		 System.out.println("Please select the correct browser: "+browser);
	 }
	 
	 getDriver().manage().deleteAllCookies();
	 getDriver().manage().window().maximize();
	 return getDriver();
 }
 
 public static synchronized WebDriver getDriver()
 {
	 return tlDriver.get();
 }
}
