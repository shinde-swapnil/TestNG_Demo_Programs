package myTestNG;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
public class DataProviderDemo 
{	
	// Objective : login details sending

	@Test(dataProvider="logindetails")
	public void TestLogin(String email,String password)
	{
			System.out.println(email +"--"+password);
	}	
	
	// Step 1. define UserName & PassWord data provider
	
	@DataProvider(name = "logindetails")
	public Object[][] dpMethod()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0] = "abc@gmail.com";
		data[0][1] = "abc123";
		
		data[1][0] = "xyz@gmail.com";
		data[1][1] = "xyz";
		
		return data;
	}
}
