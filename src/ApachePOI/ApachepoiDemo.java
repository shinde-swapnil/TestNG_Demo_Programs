package ApachePOI;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class ApachepoiDemo 
{
	WebDriver driver = new ChromeDriver();
	
	XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFCell cell;
	
	@BeforeSuite
	public void setup()
	{
		driver.get("https://www.linkedin.com");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	@Test
	 public void ReadData() throws IOException, InterruptedException
	 {
	     // Import excel sheet.
	     File src=new File("/home/swapnil/ECLIPSE/eclipse-workspace/TestNG_Java/src/ApachePOI/linkedin.xlsx");
	      
	     // Load the file.
	     FileInputStream finput = new FileInputStream(src);
	      
	     // Load the workbook.
	    workbook = new XSSFWorkbook(finput);
	      
	     // Load the sheet in which data is stored.
	     sheet= workbook.getSheetAt(0);
	      
	     for(int i=1; i<=sheet.getLastRowNum(); i++)
	     {
	         // Import data for Email.
	         Cell c = sheet.getRow(i).getCell(1);
	         driver.findElement(By.id("session_key")).sendKeys(c.getStringCellValue());
	          
	         // Import data for password.
	         cell = sheet.getRow(i).getCell(2);
	         driver.findElement(By.id("session_password")).sendKeys(c.getStringCellValue());
	         
	         driver.findElement(By.xpath("/html/body/main/section[1]/div[2]/form/button")).click();
	         
	         Thread.sleep(5000);
	                 
	        }
	  } 
	
	@SuppressWarnings("deprecation")
	@Test
	public void WriteData() throws IOException
	{
		// Import excel sheet.
	     File src=new File("/home/swapnil/ECLIPSE/eclipse-workspace/TestNG_Java/src/ApachePOI/write.xlsx");
	      
	    
	     FileOutputStream fos=new FileOutputStream(src);
	     
	     // Load the workbook.
	    XSSFWorkbook workbook = new XSSFWorkbook();
	      
	  //create the blank excel sheet
		XSSFSheet sh= workbook.createSheet("Webkul");
	    
	    // Load the sheet in which data is stored.
	     sheet= workbook.getSheetAt(0);
	     
	   //define the position in the excel sheet where write operation needs to perform
	        Row rw= sh.createRow(4);
		Cell cl=rw.createCell(1);
	        //define input type
		cl.setCellType(CellType.STRING);
	        //define the data value
		cl.setCellValue("Webkul Software");
	        //write the workbook
		workbook.write(fos);

	     
	        	 
	}
	
	
	@AfterSuite
	public void teardown()
	{
		driver.close();
	}
	
	
}
