package stepdefinations;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demoblaze {
	ChromeDriver driver;
@Given("launch demoblaze website")
	public void launch_demoblaze()
	{
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(4));
	}
@When("user click on sign up button on navbar")
 public void signup()
 {
	driver.findElement(By.id("signin2")).click();
 }
@When("user enter username")
	public void username()
	{
		driver.findElement(By.id("sign-username")).sendKeys("yogita");
	}
@And("user enter password")
	public void password()
	{
		driver.findElement(By.id("sign-password")).sendKeys("yogita123");
	}
@And("click on sign up button")
	public void signupbutton()
	{
		driver.findElement(By.xpath("//button[@onclick='register()']")).click();
	}
@Then("demoblaze sign up successfull and should display alert message")
	public void display_alert() throws InterruptedException
	{
	    Thread.sleep(2000);
		Alert al=driver.switchTo().alert();
		System.out.println("Alert message:"+al.getText());
	    al.accept();
		//driver.close();
	}
@When("user click on login button on navbar")
public void navbar_login()
{
	System.out.println("clicked on login button on navbar");
}
@And("enter registred username and password")
public void reg_usernameandpass()
{
	System.out.println("abc and abc123");
}
@And("Click on login button")
public void login_button()
{
	System.out.println("login button");
}
@Then("demoblaze login successfull and should display alert message")
public void login_alert()
{
	System.out.println("login alert");
}
}
