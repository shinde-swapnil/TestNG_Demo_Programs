package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	//define WebDriver instance
	WebDriver driver = null;
	
	// create constructor
	public LoginPage(WebDriver driver) 
	{
		this.driver = driver;
		// this const will be used whenever you want to refer a driver.  
	}
	
	
	// Step 1 : locate the available elements
	
	// 1. search box
	By search_text_box = By.name("q");
	
	// 2. button
	By submit = By.xpath("//div[@class='FPdoLc tfB0Bf']//input[@name='btnK']");
	
	
	// ******************************************

	// Step 2 : define action
	
	public void setQuery(String text)
	{
		driver.findElement(search_text_box).sendKeys(text);
	}
	
	public void clickButton()
	{
		driver.findElement(submit).sendKeys(Keys.RETURN);
	}
	
}
