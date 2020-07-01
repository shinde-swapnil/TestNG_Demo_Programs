package RetryDemo;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer
{
	static int count = 1;
	static int maxtry = 3;
	
	@Override
	public boolean retry(ITestResult result) 
	{
		if(count < maxtry)
		{
			count++;
			System.out.println("Retry test :" + result.getName()+ " Status: " + result.getStatus());
			return true;
		}		
		return false;
	}
}
