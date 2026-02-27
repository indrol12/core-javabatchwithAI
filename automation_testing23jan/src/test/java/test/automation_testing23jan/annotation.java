package test.automation_testing23jan;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class annotation {

	@BeforeSuite
	void first()
	{
		System.out.println("first test case");
	}
	@BeforeTest  //it will run test before test case execution
	void second()
	{
		System.out.println("second test case");
	}
	@Test(groups="smoketesting")   //test case
	void third()
	{
		System.out.println("test case");
	}
	
}
