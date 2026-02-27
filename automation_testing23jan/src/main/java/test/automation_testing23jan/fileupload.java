package test.automation_testing23jan;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class fileupload extends launch_demoreg{

	void file() throws InterruptedException
	{
		WebElement image=driver.findElement(By.id("imagesrc"));
		image.sendKeys("C:\\Users\\Admin\\Pictures\\Screenshots\\sw test.png");
		Thread.sleep(2000);
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException {
		fileupload f=new fileupload();
		f.demo_website();
		f.file();
	}
}
