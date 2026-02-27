package test.automation_testing23jan;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class dataproviderannotation {
  @Test(dataProvider = "data")
  public void login_logout_test(String uname, String pass) {
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	  driver.findElement(By.id("user-name")).sendKeys(uname);
	  driver.findElement(By.id("password")).sendKeys(pass);
	  driver.findElement(By.id("login-button")).click();
	//  driver.findElement(By.id("react-burger-menu-btn")).click();
	  //driver.findElement(By.id("logout_sidebar_link")).click();
	  driver.close();
  }

  @DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] { "standard_user", "secret_sauce" },
      new Object[] { "problem_user", "secret_sauce" },
      new Object[] { "performance_glitch_user", "secret_sauce" },
    };
  }
}
