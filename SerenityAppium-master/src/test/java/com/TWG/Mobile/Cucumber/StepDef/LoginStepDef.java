package com.TWG.Mobile.Cucumber.StepDef;

import org.openqa.selenium.WebDriver;

import com.TWG.Mobile.steps.serenity.LoginSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;

public class LoginStepDef {
	
	@Steps
	LoginSteps loginSteps;
	
	
	@Given("^I launch Red App$")
	public void launch_Red_App() throws Throwable {
		System.out.println("LAUNCHED");
	}
	
	@When("^I click Hamburger menu$")
	public void click_Hamburger_menu() throws Throwable {
		loginSteps.click_menu();
	
	}
	
	@When("^I click Login link$")
	public void click_Login_link() throws Throwable {
		loginSteps.login();
	}
	
	@Then("^I enter an \"([^\"]*)\" and \"([^\"]*)\"$")
	public void enterEmail_Password(String email, String password) throws Throwable {
		loginSteps.enterCredentials(email, password);
	}

	@Then("^I click Sign In$")
	public void click_Sign_In() throws Throwable {
	    loginSteps.signin();
	}

	@Then("^I see the logged in email at Hamburger menu$")
	public void verify_Successful_Login() throws Throwable {
		loginSteps.click_menu();
		System.out.println("User logged in successfully");
	}
}
