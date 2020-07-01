package Listeners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)


public class TestCaseListeners 
{
	WebDriver driver = new ChromeDriver();
		
	@Test
	public void login()
	{
		System.out.println("Test 2");
		driver.get("http://newtours.demoaut.com/");
		String expTitle = "Welcome: Mercury Tours";
		String actTitle = driver.getTitle();
		System.out.println(actTitle);
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test
	public void crmWebsite()
	{
		System.out.println("Test 1");
		Assert.assertTrue(false);
		
	}
	
	@Test()
	public void googlePage()
	{
		throw new SkipException("Skipping The Test Method ");

		//driver.get("https://www.google.com");
	}

}
