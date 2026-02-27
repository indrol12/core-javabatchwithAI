package test.automation_testing23jan;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class readingexternalfile {
	@Test
	void read_file() throws IOException
	{
		//reading external file
		FileReader fr=new FileReader("C:\\Users\\Admin\\corejava15thdec\\automation_testing23jan\\websites.properties");
		
		Properties pr=new Properties();//reading properties of the file
	    pr.load(fr);//it is used to load file to properties 
	    
	    ChromeDriver driver=new ChromeDriver();
	    driver.get(pr.getProperty("orangehrm"));
	    driver.manage().window().maximize();
	  //  driver.quit();
	}
}
