package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReadExcelData
{
	WebDriver driver = new ChromeDriver();
	
	XSSFWorkbook wb; 
	XSSFSheet sh;
	
	@BeforeSuite
	public void setup()
	{
		System.out.println("...Initialization...");
		
	}
	
	@BeforeTest
	public void GoogleSetup()
	{
	System.out.println("..Test Started..");
	driver.get("https://www.google.com");
	//driver.manage().window().maximize();
	}
	
	
	@Test
	public void GoogleTest() throws IOException, InterruptedException
	{
		System.out.println("Welcome to test1");
		
		// find search box
		WebElement search = driver.findElement(By.className("gLFyf gsfi"));
		
		/*enter data from excel*/
		System.out.println("Welcome to test2");

		// Import Excel		
		File src = new File("/home/swapnil/ECLIPSE/eclipse-workspace/TestNG_Java/src/ApachePOI/Google Test.xlsx");
		
		System.out.println("Welcome to test3");

	     // Load the file.
		FileInputStream fin = new FileInputStream(src);
		
		System.out.println("Welcome to test4");

		// Load the workbook
		wb =  new XSSFWorkbook(fin);
		
		System.out.println("Welcome to test5");

		// define sheet
		sh = wb.getSheetAt(0);		
		
		System.out.println("Welcome to test5");

		String query = sh.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println("Welcome to test6");

		
		search.sendKeys(query);
		
		System.out.println("Welcome to test7");

		Thread.sleep(3000);
	}
	
	@AfterTest
	public void GoogleTestEnd()
	{
		System.out.println("..Test Ended..");
	}
	
	
	@AfterSuite
	public void teardown()
	{
		System.out.println("...Exiting...");
		driver.quit();
		
	}
	
	
}
