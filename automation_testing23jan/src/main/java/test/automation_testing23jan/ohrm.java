package test.automation_testing23jan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ohrm {
	ChromeDriver driver;
	void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
	}
	public static void main(String[] args) {
		ohrm o=new ohrm();
		o.launch();
		o.login();
	}
}
