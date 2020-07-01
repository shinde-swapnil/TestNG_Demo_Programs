package myTestNG;

import org.testng.annotations.DataProvider;

public class DataProviderMethod {
	//@DataProvider(name="Single Attribute Login")
	
	
	
	@DataProvider(name="Single Attribute Login")
	public Object[] dpMethod2()
	{
		Object[] data = new Object[1];
		return data;
		
	}

}
