package TestNGPractise;

import org.testng.annotations.Test;

public class DemoTest_Priority {

	@Test(priority=3)
	public void demo()
	{
		System.out.println("demo");
	}
	
	@Test(priority=1)
	public void sample()
	{
		System.out.println("sample");
	}
	
	@Test(priority=2)
	public void dummy()
	{
		System.out.println("dummy");
	}
	
}
