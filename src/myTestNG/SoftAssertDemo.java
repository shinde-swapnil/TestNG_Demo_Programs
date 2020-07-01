package myTestNG;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class SoftAssertDemo 
{	
		WebDriver driver = new ChromeDriver();
		
		@Test (priority = 0)
		public void CloseBrowser() {
			driver.close();
			Reporter.log("Driver Closed After Testing");
		}
		
		@Test (priority = -1)
		public void OpenBrowser() 
		{
			Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
		    Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
		        
		    driver.get("https://www.google.com");
		        
		    Reporter.log("The website used for searching anything", true);

		    // create object of SoftAssert
		    SoftAssert sa = new SoftAssert();

		    // title validation
		    String expectedTitle = "google";
		    String originalTitle = driver.getTitle();
		    sa.assertEquals(originalTitle, expectedTitle , "match title");
		    Reporter.log("The Title Validation", true);


		    // URL validation
		    String expectedURL = "https://www.google.com";
		    String actualURL = driver.getCurrentUrl();
		    sa.assertEquals(actualURL, expectedURL);
		    Reporter.log("The URL Validation", true);

		    
		    
	  }
}
	


