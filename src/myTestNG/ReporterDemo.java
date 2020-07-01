package myTestNG;
import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReporterDemo 
{	
	
	 
	 @Test 
	 public void OpenBrowser() 
	 {
		 System.out.println("Test 1");
		 Reporter.log("Default method");
	 }
    
	 
	 public void CloseBrowser() 
	 {
		 System.out.println("Test 2");
		 Reporter.log("Ignored method");
	 }
    
}
	
	

