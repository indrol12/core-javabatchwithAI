package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ohrm_login {
	ChromeDriver driver;
@Given("Launch orangehrm login page")
	public void launch_ohrm()
	{
		driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	}
	@When("enter username and password")
	public void credential()
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	}
	@And("Click on login button of orangehrm")
	public void login()
	{
		driver.findElement(By.tagName("button")).click();
	}
	@Then("orangehrm login should be successfull")
	public void validate()
	{
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}
}
