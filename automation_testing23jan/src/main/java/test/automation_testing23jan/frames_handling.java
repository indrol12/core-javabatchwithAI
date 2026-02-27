package test.automation_testing23jan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frames_handling {
ChromeDriver dr;
	void launch_demoreg()
	{
		dr=new ChromeDriver();
		dr.get("https://demo.automationtesting.in/Frames.html");
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
	}
	void frame()
	{
		WebElement w=dr.findElement(By.id("singleframe"));
		
//		dr.switchTo().frame(w);//by using webelement
//		dr.findElement(By.tagName("input")).sendKeys("jiya");
		
		//by using index
//		dr.switchTo().frame(0);
//		dr.findElement(By.tagName("input")).sendKeys("poonam");
		
		//by using id
		dr.switchTo().frame("singleframe");
		dr.findElement(By.tagName("input")).sendKeys("Amruta");
	}
	public static void main(String[] args) {
		frames_handling fh=new frames_handling();
		fh.launch_demoreg();
		fh.frame();
	}
}
