package test.automation_testing23jan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class actionclass {
//Fresh
	ChromeDriver driver;
	void launch()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
	void mousehover()
	{
		Actions act=new Actions(driver);
		WebElement fresh=driver.findElement(By.xpath("//span[text()='Fresh']"));
		act.moveToElement(fresh).build().perform();
	}
	public static void main(String[] args) {
		actionclass a=new actionclass();
		a.launch();
		a.mousehover();
	}
}
