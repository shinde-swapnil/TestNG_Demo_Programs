package myTestNG;
import org.testng.annotations.*;
public class PriorityDemo 
{
	// test case for Signing up 
	@Test(priority=1)
	public void signUp()
	{
		System.out.println("Method:signUp --- Register Yourself");
	}
	
	// test case for Successful account login
	@Test(priority=3)
	public void loginToAccount()
	{
		System.out.println("Method:loginToAccount --- Login to Your Account");
	}
	
	// test case for Verification Email
	@Test(priority=2)
	public void verifyEmail()
	{
			System.out.println("Method:verifyEmail --- Check inbox & Click on Verify Account");
	}
}
