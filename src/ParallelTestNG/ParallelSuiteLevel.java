package ParallelTestNG;

import org.testng.annotations.Test;

public class ParallelSuiteLevel 
{
	// objective : run tests parallely at suite level
	
	@Test
	public void method1()
	{
		System.out.println("Method One & Thread ID = " + Thread.currentThread().getId());
	}
	@Test
	public void method2()
	{
		System.out.println("Method Two & Thread ID = " + Thread.currentThread().getId());
	}	
}
