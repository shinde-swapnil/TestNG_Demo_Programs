package myTestNG;
import org.testng.annotations.Test;
public class GroupsDemo 
{
	// test case 1
	@Test(groups = "SMOKE")
	public void tc1()
	{
		System.out.println("In TC1 - & - Group : Smoke Testing");
	}	
	// test case 2
		@Test(groups = "SMOKE")
		public void tc2()
		{
			System.out.println("In TC2 - & - Group : Smoke Testing");
		}	
   // test case 3
		@Test(groups = "SANITY")
		public void tc3()
		{
			System.out.println("In TC3 - & - Group : Sanity Testing");
		}		
	// test case 4
		@Test(groups = "SANITY")
		public void tc4()
		{
			System.out.println("In TC4 - & - Group : Sanity Testing");
		}		
	// test case 5
		@Test(groups = "Regression")
		public void tc5()
		{
			System.out.println("In TC5 - & - Group : Regression Testing");
		}		
	// test case 6
		@Test(groups = "Regression")
		public void tc6()
		{
			System.out.println("In TC6 - & - Group : Regression Testing");
		}		
	// test case 7
		@Test(groups = "Adhoc")
		public void tc7()
		{
			System.out.println("In TC7 - & - Group : Adhoc Testing");
		}
}
