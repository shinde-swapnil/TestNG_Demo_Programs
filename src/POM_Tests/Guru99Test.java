package POM_Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM_Pages.Guru99Page;

public class Guru99Test 
{
	static WebDriver driver;
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		test();
	}

	public static void test()
	{
		driver = new ChromeDriver();
		driver.get("https://www.guru99.com/");
		Guru99Page obj = new Guru99Page(driver);
		obj.clickBox();
		obj.queryText("java");
		obj.clickBox();		
	}
}
