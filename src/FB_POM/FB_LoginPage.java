package FB_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class FB_LoginPage 
{
	WebDriver driver;
	
	// constructor
	public FB_LoginPage(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}
	
	
	// locators
	By email = By.name("email");	
	By pwd = By.name("pass");	
	By login = By.xpath("//input[@type='submit']");
	
	// action methods	
	public void setEmail(String emailtext)
	{
		driver.findElement(email).sendKeys(emailtext);
	}
	
	public void setPassword(String pwdtext)
	{
		driver.findElement(pwd).sendKeys(pwdtext);

	}
	
	public void clickOnSubmit()
	{
		driver.findElement(login).sendKeys(Keys.RETURN);
	}

}
