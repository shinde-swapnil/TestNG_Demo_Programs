package FB_POM;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FB_Test
{
	static WebDriver driver;

	@BeforeTest
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");		
	}	
	@Test(priority=1)
	public static void testFacebookLogin() throws InterruptedException
	{
		FB_LoginPage loginObject = new FB_LoginPage(driver);
		loginObject.setEmail("sopi7488@gmail.com");
		loginObject.setPassword("facebook1234");
		loginObject.clickOnSubmit();		
		FB_HomePage homeObject = new FB_HomePage(driver);
		homeObject.clickOnMenu();
		homeObject.clickOnLogout();		
	}
	
	@AfterTest
	public void finish() throws InterruptedException
	{
		Thread.sleep(5);
		driver.quit();
	}

}
