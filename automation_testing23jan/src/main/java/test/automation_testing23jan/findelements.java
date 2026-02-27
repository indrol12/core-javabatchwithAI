package test.automation_testing23jan;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class blogspot{
	ChromeDriver driver;
	void launch_blogspot()
	{
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}
}
public class findelements extends blogspot{

	void broken_link() throws InterruptedException
	{
		List<WebElement> bk=driver.findElements(By.tagName("a"));
	    
		for(WebElement li:bk)//iterating webelements
		{
			System.out.println(li.getText());
			Thread.sleep(1000);
		}
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException    {
		findelements we=new findelements();
		we.launch_blogspot();
		we.broken_link();
	}
}
