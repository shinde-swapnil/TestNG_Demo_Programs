package RetryAutomaticListener;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryListenerTest 
{
	@Test()
    public void firstTestMethod() {
        System.out.println("First test method");
        Assert.assertTrue(true);
    }

    @Test()
    public void secondTestMethod() {
        System.out.println("Second test method");
        Assert.assertTrue(false);
    }
}
