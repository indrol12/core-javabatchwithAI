package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class fbloginnegative {
	ChromeDriver driver;
	@Given("chrome browser should be invoked")
public void browser()
{
	driver=new ChromeDriver();
}
	@And("fb login page should be visible")
public void fb_loginpage()
{
	driver.get("https://www.facebook.com/login/");
	driver.manage().window().maximize();
}
	@When("user enter email {string} and password {string}")
public void fb_invalid_credentials(String uname,String pass)
{
	driver.findElement(By.name("email")).sendKeys(uname);
    driver.findElement(By.name("pass")).sendKeys(pass);
}
	@And("click on login button of fb")
public void click_login()
{
	driver.findElement(By.xpath("//div[@role='button']")).click();
		//driver.findElement(By.xpath("//*[@id=\"login_form\"]/div/div[1]/div/div[3]/div/div/div/div[2]")).click();
}
	@Then("login should be failed when user enter invalid credentials")
public void result_offblogin()
{
	System.out.println("login failed!!!");
}

}
