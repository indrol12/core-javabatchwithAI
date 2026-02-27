package test.automation_testing23jan;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class newtabnewwindow {
	ChromeDriver drv;
void launch_amazon()
{
	drv=new ChromeDriver();
	drv.get("https://www.amazon.in/");
	drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
}
void newtab()
{
	WebElement w_page=drv.findElement(By.linkText(".in"));
	w_page.sendKeys(Keys.CONTROL+"t");//using keys enum
	drv.navigate().to("https://www.unipune.ac.in/");
	
	drv.switchTo().newWindow(WindowType.TAB);//using new window method
	drv.navigate().to("https://www.fortunecloudindia.com/leadership-awards-2026");
	
}
void newwindow()
{
	drv.switchTo().newWindow(WindowType.WINDOW);//switching to new window
	drv.navigate().to("https://socialoffline.in/restaurant/fc-road-social/");
	drv.quit();
}
public static void main(String[] args) {
	newtabnewwindow nw=new newtabnewwindow();
	nw.launch_amazon();
	nw.newtab();
	nw.newwindow();
	
}
}
