package com.TWG.Mobile.steps.serenity;

import com.TWG.Mobile.pages.LoginPage;

import net.thucydides.core.annotations.Step;

public class LoginSteps {

	LoginPage loginPage;
	
	@Step
	public void click_menu() throws Throwable {
		loginPage.click_Menu();
	}
	@Step
	public void login() throws Throwable{
		loginPage.click_Login();
	}
	@Step
	public void enterCredentials(String username, String password) throws Throwable{
		loginPage.enter_UserName(username);
		loginPage.enter_Password(password);
	}
	
	@Step
	public void signin() throws Throwable{
		loginPage.click_Signin();
		
	}
	
}
