package test.automation_testing23jan;

import org.openqa.selenium.chrome.ChromeDriver;

public class firstscript {

	public static void main(String[] args) {
		
		//1.configure webdriver
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\corejava15thdec\\automation_testing23jan\\driverresources\\chromedriver.exe");
		//System.out.println("1.configure chromedriver");
		
		//2.Initialize webdriver
		ChromeDriver driver=new ChromeDriver();
		System.out.println("2.Initialize chromedriver");
		
		//3.launch website
		driver.get("https://www.fortunecloudindia.com/");
		System.out.println("3.launch website");
		
		driver.close();
	}
}
