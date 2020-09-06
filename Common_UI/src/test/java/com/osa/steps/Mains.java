package com.osa.steps;

import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Mains {
	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() throws Throwable {
	    System.out.println("Hi there 0");
	}

	@When("^I complete action$")
	public void i_complete_action() throws Throwable {
		   System.out.println("Hi there 1");
		   Assert.assertEquals(1, 2);
	}
	@When("^I complete action1$")
	public void i_complete_action1() throws Throwable {
		   System.out.println("Hi there 22");
		 
	}
	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() throws Throwable {
		   System.out.println("Hi there 2");
	}


}
