package test.automation_testing23jan;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class printnum {
@Parameters({"S"})
	@Test
	void display(int num)
	{
		System.out.println("The number is:"+num);
	}
}
