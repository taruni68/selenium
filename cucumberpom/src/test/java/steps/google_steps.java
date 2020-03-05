package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main_java.google_java;

public class google_steps extends google_java {
	
	@Given("^launch an chrome browser$")
	public void launch_an_chrome_browser() throws Throwable {
	  url();
	}

	@When("^the user opens google homepage$")
	public void the_user_opens_google_homepage() throws Throwable {
	   google_homepage();
	}

	@Then("^verify textbox$")
	public void verify_textbox() throws Throwable {
		verify();
	}

	@Then("^click the submit button$")
	public void click_the_submit_button() throws Throwable {
		submit();
	}

}
