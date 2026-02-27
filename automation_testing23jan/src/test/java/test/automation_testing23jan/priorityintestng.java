package test.automation_testing23jan;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class priorityintestng {
	ChromeDriver driver; //declaring (it is null here)
	
	@Test(priority=4)
	void pen() {driver.close();}
	@Test(priority =3)
	void charger(){driver.manage().window().maximize();}
	@Test(priority=1)
	void glass(){driver=new ChromeDriver();}//initializing
	@Test(groups="smoketesting")
	void apple(){driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");}
	
}
