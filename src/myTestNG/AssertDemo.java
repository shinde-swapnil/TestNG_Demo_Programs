package myTestNG;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AssertDemo 
{	
		WebDriver driver = new ChromeDriver();
		
		@Test (priority = 0)
		public void CloseBrowser() {
			driver.close();
			Reporter.log("Driver Closed After Testing");
		}
		
		@Test (priority = -1)
		public void OpenBrowser() {
			Reporter.log("This test verifies the current selenium compatibility with TestNG by launching the chrome driver");
		        Reporter.log("Launching Google Chrome Driver version 81 for this test"); 
		        
		        driver.get("https://www.google.com");
		        
		        Reporter.log("The website used was DemoQA for this test", true);
		        String expectedTitle = "google";
		        String originalTitle = driver.getTitle();
		       // Assert.assertEquals(originalTitle, expectedTitle);
		        Assert.assertEquals(originalTitle, expectedTitle , "mismatch title");

	  }
}
	


