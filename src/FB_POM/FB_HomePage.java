package FB_POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FB_HomePage 
{
	WebDriver driver;
	
	// constructor
	public FB_HomePage(WebDriver driver) 
	{
		super();
		this.driver = driver;
	}
	
	// locators	
	By menuitem = By.className("_59tf _2ftq _7gxv");
	By logout = By.className("_52x7");
	
	// action methods	
	public void clickOnMenu()
	{
		driver.findElement(menuitem).click();
	}
	
	public void clickOnLogout()
	{
		driver.findElement(logout).click();
	}

}
