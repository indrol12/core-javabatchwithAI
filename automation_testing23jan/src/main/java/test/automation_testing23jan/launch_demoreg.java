package test.automation_testing23jan;

import org.openqa.selenium.chrome.ChromeDriver;

public class launch_demoreg {
ChromeDriver driver;

void demo_website()
{
	driver=new ChromeDriver();
	driver.get("https://demo.automationtesting.in/Register.html");
	driver.manage().window().maximize();
}
}
