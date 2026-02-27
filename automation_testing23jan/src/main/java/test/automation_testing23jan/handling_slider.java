package test.automation_testing23jan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handling_slider {
ChromeDriver driver;
	void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}
	
	void leftslider()
	{
		WebElement left=driver.findElement(By.xpath("//*[@id=\"slider-range\"]/span[1]"));
		Actions ac=new Actions(driver);
		ac.dragAndDropBy(left, 120, 0).build().perform();
	}
	public static void main(String[] args) {
		handling_slider hs=new handling_slider();
		hs.launch();
		hs.leftslider();
	}
}
