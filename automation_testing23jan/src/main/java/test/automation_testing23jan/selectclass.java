package test.automation_testing23jan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class selectclass {
ChromeDriver driver;
	void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	void practice_form()
	{
		driver.findElement(By.id("name")).sendKeys("nisha");
		driver.findElement(By.id("female")).click();
		driver.findElement(By.id("saturday")).click();
	//handle dropdowm
		Select sel=new Select(driver.findElement(By.id("country")));
		//selectbyindex
		sel.selectByIndex(9);//it will select india
		//selectbyvalue
		sel.selectByValue("canada");//IT WILL SELECT CANADA
		
	}
	public static void main(String[] args) {
		selectclass ob=new selectclass();
		ob.launch();
		ob.practice_form();
	}
}
