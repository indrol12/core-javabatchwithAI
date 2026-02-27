package test.automation_testing23jan;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class fbtestcase {

	 ChromeDriver driver;//declare chromedriver globally
	 //int a;
	 //a=90;
	 //int a=90;
	 void launch_fb()
	 {
		  driver =new ChromeDriver();
		    driver.get("https://www.facebook.com/login");
		    driver.manage().window().maximize();
	 }
	void invalid_login_usingID()
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\corejava15thdec\\automation_testing23jan\\driverresources\\chromedriver.exe");
	
	    //using ID locator finding email textbox
	    driver.findElement(By.id("email")).sendKeys("fctqqq@gmail.com");
	    driver.findElement(By.id("pass")).sendKeys("fct123");
	    driver.findElement(By.id("loginbutton")).click();
	    System.out.println("test fb login using ID");
	}
	void invalidlogin_usingNAME()
	{
	//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\corejava15thdec\\automation_testing23jan\\driverresources\\chromedriver.exe");
//	    ChromeDriver driver=new ChromeDriver();
	   // driver.get("https://www.facebook.com/login");
	   // driver.manage().window().maximize();
	    //using name locator
	    driver.findElement(By.name("email")).sendKeys("hfgf@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("qa123");
	    driver.findElement(By.name("login")).click();
	    System.out.println("test fb login using NAME");
	    
	    }
	void invalidlogin_usingTAGNAME()
	{
		//driver.findElement(By.tagName("input")).sendKeys("Test@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("123125");
		driver.findElement(By.tagName("button")).click();
		System.out.println("test fb login using TAGNAME");
	}
	void forget_passlinktext()
	{
		driver.findElement(By.linkText("Forgotten account?")).click();
		driver.navigate().back();
	}
	void partial_linktext()
	{
		driver.findElement(By.partialLinkText("Forgotten")).click();
	}
	void classname()
	{
		driver.findElement(By.className("_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy")).click();
		
	}
	public static void main(String[] args) throws InterruptedException {
		fbtestcase ob=new fbtestcase();
	//	ob.invalid_login_usingID(); 
		//ob.invalidlogin_usingNAME();
	//	Thread.sleep(4000);
		//ob.invalidlogin_usingTAGNAME();
		ob.launch_fb();
		//ob.forget_passlinktext();
		//ob.partial_linktext();
		ob.classname();
	}
}
