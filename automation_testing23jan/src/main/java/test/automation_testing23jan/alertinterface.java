package test.automation_testing23jan;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alertinterface {
ChromeDriver driver;
	void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();
	}
	void simple_alert() throws InterruptedException
	{
		driver.findElement(By.id("alertBtn")).click();
		Alert al=driver.switchTo().alert();
		System.out.println(al.getText());
		Thread.sleep(2000);
		al.accept();//click on ok button of alert box
		
	}
	void confirmation_alert() throws InterruptedException
	{
		driver.findElement(By.id("confirmBtn")).click();
		Alert al2=driver.switchTo().alert();	 
		Thread.sleep(1000);
		al2.accept();//press ok
		
		driver.findElement(By.id("confirmBtn")).click();
		Alert al3=driver.switchTo().alert();
		Thread.sleep(1000);
		al3.dismiss();	//press cancel 
		
		}
	void prompt_alert()
	{
		driver.findElement(By.id("promptBtn")).click();
		Alert al4=driver.switchTo().alert();
		al4.sendKeys("Pratiksha");
		al4.accept();
		
	}
	public static void main(String[] args) throws InterruptedException {
		alertinterface a=new alertinterface();
		a.launch();
		a.simple_alert();
		a.confirmation_alert();
		a.prompt_alert();
	}
}
