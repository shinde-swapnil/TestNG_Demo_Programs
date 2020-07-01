package POM_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Pages.LoginPage;

public class LoginTest 
{
	// 1. define WebDriver instance	
	private static WebDriver driver;
	
	public LoginTest(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) 
	{
		test();
	}
	
	public static void test()
	{
		driver = new ChromeDriver();
		
		// create object of page class
		LoginPage pageObject = new LoginPage(driver);
		
		// goto URL
		driver.get("https://www.google.com/");
		
		// use above object to call action methods
		pageObject.setQuery("MAVEN");		
		pageObject.clickButton();	
		
		//close session
		driver.close();
		
	}
	
	
}
