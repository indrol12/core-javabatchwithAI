package test.automation_testing23jan;

import org.openqa.selenium.chrome.ChromeDriver;

public class driver_methods {
public static void main(String[] args) throws InterruptedException {
	launch_fb();
}
	
	
static	void launch_fb() throws InterruptedException
	{
		
		//configure webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\corejava15thdec\\automation_testing23jan\\driverresources\\chromedriver.exe");
	    System.out.println("Chromedriver configured!!");
	    
	    //initialized chromedriver
	    ChromeDriver driver=new ChromeDriver();
	    System.out.println("Initialized ChromeDriver");
	    
	    driver.get("https://www.facebook.com/");
	    System.out.println("fb launch");
	    
	    driver.manage().window().maximize();
	    System.out.println("window maximized!");
	    
	    System.out.println("Title: "+driver.getTitle());
	    
	    System.out.println("CurrentURL: "+driver.getCurrentUrl());
	    
	    driver.navigate().to("https://chatgpt.com/?");
	    
	    driver.navigate().back();//fb
	    
	    driver.navigate().forward();//cgpt
	    Thread.sleep(2000);
	    driver.navigate().refresh();
	    
	    driver.close();
	    System.out.println("browser closed!!");
	    
	}
}
