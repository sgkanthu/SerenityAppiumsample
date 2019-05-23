package com.TWG.Mobile.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class LoginPage extends PageObject{
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(className="android.widget.ImageButton")
	public WebElementFacade menuHamBurger;
	
	@FindBy(id="nz.co.thewarehouse.wow.qat:id/btn_login")
	public WebElementFacade btnlogin;
	
	@FindBy(id="nz.co.thewarehouse.wow.qat:id/email")
	public WebElementFacade txtUserName;
	
	@FindBy(id="nz.co.thewarehouse.wow.qat:id/password")
	public WebElementFacade txtPassword;
	
	@FindBy(id="nz.co.thewarehouse.wow.qat:id/login_btn")
	public WebElementFacade btnSignin;
	
	@FindBy(id="")
	public WebElementFacade btnSignout;
	 
	
	public void click_Menu() {
		menuHamBurger.click();
	}
	
	public void click_Login() {
		btnlogin.click();
	}
	public void enter_UserName(String username) {
		txtUserName.clear();
		txtUserName.click();
		txtUserName.sendKeys(username);
	}
	
	public void enter_Password(String password) {
		txtPassword.clear();
		txtPassword.click();
		txtPassword.sendKeys(password);
	}
	public void click_Signin() {
		btnSignin.click();
	}

}
