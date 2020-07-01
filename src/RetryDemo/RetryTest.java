package RetryDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTest 
{
	@Test(retryAnalyzer=Retry.class)
    public void firstTestMethod() {
        System.out.println("First test method");
        Assert.assertTrue(true);
    }

    @Test(retryAnalyzer=Retry.class)
    public void secondTestMethod() {
        System.out.println("Second test method");
    //This Test will fail with Assert here
        Assert.assertTrue(false);
    }
}
