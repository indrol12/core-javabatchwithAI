package stepdefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class gmaillogin {
@Given("user should create the account on gmail")
public	void create_ac()
	{
		System.out.println("Precondition:user created the account");
	}
@When("launch gmail website ,enter email and password,click on login button")
 public void login_steps()
  {
	  System.out.println("Test steps:user performed all the steps");
  }
@Then("login should be successfull")
public void login_button()
{
	System.out.println("Expected result:login successfull");
}
}
