package allStepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BDD_FrameWorkSetup {
	@Given("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("user is on login page");
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("user enters username and password");
	}

	@Then("successful login")
	public void successful_login() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("successful login");
	}


}
