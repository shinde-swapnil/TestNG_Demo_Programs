package POM_Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Guru99Page 
{
	WebDriver driver = null;

	public Guru99Page(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	By clickSearchbox = By.className("gsc-search-button gsc-search-button-v2"); 
	By query = By.id("gsc-i-id1");
	
	public void clickBox()
	{
		driver.findElement(clickSearchbox).click();
	}
	
	public void queryText(String text)
	{
		driver.findElement(query).sendKeys(text);		
	}
	
}
