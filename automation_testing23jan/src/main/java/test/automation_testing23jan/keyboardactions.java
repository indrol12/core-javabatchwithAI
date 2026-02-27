package test.automation_testing23jan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class keyboardactions {
  ChromeDriver driver;
  
	void launch()
	{
		driver=new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
	}
	
	void search()
	{
		WebElement se=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		//enter key
		se.sendKeys("Software Testing");
		se.sendKeys(Keys.ENTER);
	}
	void copypaste()
	{
		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Shruti");
		name.sendKeys(Keys.CONTROL+"A");
		name.sendKeys(Keys.CONTROL+"C");
	}
	void delete() throws InterruptedException
	{
		WebElement se=driver.findElement(By.id("Wikipedia1_wikipedia-search-input"));
		se.sendKeys("Java");
		Thread.sleep(1000);
		se.sendKeys(Keys.CONTROL+"A");
		se.sendKeys(Keys.DELETE);
	}
	public static void main(String[] args) throws InterruptedException {
		keyboardactions k=new keyboardactions();
		k.launch();
		k.search();
		k.copypaste();
		k.delete();				
	}
}
