package bdd.steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BaseStep {
	@Given("today is Sunday")
	public void today_is_Sunday() {
		System.out.println("today_is_Sunday");
	}

	@When("I ask whether it's Friday yet")
	public void i_ask_whether_it_s_Friday_yet() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("i_ask_whether_it_s_Friday_yet");
	}

	@Then("I should be told {string}")
	public void i_should_be_told(String string) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("i_should_be_told" + string);
	}
}
