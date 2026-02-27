package test.automation_testing23jan;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshothandling {
ChromeDriver driver;
	void flipcart_launch() throws InterruptedException
	{
		driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	void screen_shot() throws IOException
	{
		
		File ts=driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("C:\\Users\\Admin\\flipcartdashboard.jpg");
		FileHandler.copy(ts, dest);
	}
	void partial_ss() throws IOException
	{
		WebElement image=driver.findElement(By.xpath("//img[@alt='FLIPKART']"));
		File src=image.getScreenshotAs(OutputType.FILE);
		File destination=new File("C:\\Users\\Admin\\corejava15thdec\\automation_testing23jan\\fcimage.jpg");
		FileHandler.copy(src, destination);
	}
	public static void main(String[] args) throws IOException, InterruptedException {
		screenshothandling o=new screenshothandling();
		o.flipcart_launch();
		o.screen_shot();
		o.partial_ss();
	}
}
