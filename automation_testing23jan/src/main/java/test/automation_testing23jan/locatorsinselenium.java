package test.automation_testing23jan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class locatorsinselenium {
//xpath and cssselector
	ChromeDriver driver;
	void launch_setup()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.demoblaze.com/");
	}
	void xpath_locator() throws InterruptedException
	{
		//1.//tagname[@attribute='value']
//		driver.findElement(By.xpath("//a[@id='signin2']")).click();
//		driver.findElement(By.xpath("//input[@id='sign-username']")).sendKeys("dolly");
		
		//2.//parenttagname/childtagname
		//driver.findElement(By.xpath("//li/a")).click();
		//3.//tagname
				//driver.findElement(By.xpath("//img")).click();	
		//4.//tagname[text()='value']
		driver.findElement(By.xpath("//a[text()='Samsung galaxy s6']")).click();
	}
	void css_selectorlocator()
	{
		//1.tagname[attribute='value']
		//driver.findElement(By.cssSelector("a[id='login2']")).click();
		//2.tagname#idvalue
		//driver.findElement(By.cssSelector("a#login2")).click();
		//3.tagname.classname
		//4.tagname
		//driver.findElement(By.cssSelector("img")).click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		locatorsinselenium ob=new locatorsinselenium();
		ob.launch_setup();
		ob.css_selectorlocator();
		Thread.sleep(3000);
		ob.xpath_locator();
	}
}
