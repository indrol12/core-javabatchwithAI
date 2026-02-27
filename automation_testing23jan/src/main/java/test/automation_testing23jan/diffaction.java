package test.automation_testing23jan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class diffaction {
ChromeDriver driver;
Actions ac;
	void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();;
	}
	void mousehover()
	{
	ac=new Actions(driver);
		WebElement pointme=driver.findElement(By.xpath("//button[text()='Point Me']"));
		ac.moveToElement(pointme).build().perform();
	}
	void draganddrop()
	{
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		ac.dragAndDrop(drag, drop).build().perform();
	}
	public static void main(String[] args) {
		diffaction ob=new diffaction();
		ob.launch();
		ob.mousehover();
		ob.draganddrop();
	}
}
