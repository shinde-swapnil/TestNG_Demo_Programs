package ParallelTestNG;

import org.testng.annotations.Test;

public class ParallelTestLevel2 
{
	// objective : run tests parallely at suite level
	
	@Test
	public void method1()
	{
		System.out.println("Class-2 Method-One ThreadID= " + Thread.currentThread().getId());
	}
	
}
