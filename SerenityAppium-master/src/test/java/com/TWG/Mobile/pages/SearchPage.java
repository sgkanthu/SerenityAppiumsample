package com.TWG.Mobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;

public class SearchPage extends AppiumPageObject {


	public SearchPage(final WebDriver driver) {
		super(driver);
	}
	
	
//	@FindBy(id="nz.co.thewarehouse.wow.qat:id/action_search", timeoutInSeconds="10")
	
	@FindBy(xpath="//android.widget.TextView[@content-desc='Search']", timeoutInSeconds="10")
	public WebElement btnSearch;
	
	
	
//	@FindBy(id="nz.co.thewarehouse.wow.qat:id/tv_search")
	@FindBy(className="android.widget.EditText", timeoutInSeconds="10")
	public WebElement txtSearch;
	
	public void clickSearch() throws InterruptedException {
//		Boolean blnFlag = isElementVisible(By.id("nz.co.thewarehouse.wow.qat:id/action_search"));
//		System.out.println(blnFlag);
//		Thread.sleep(5000);
		element(btnSearch).waitUntilClickable();
		btnSearch.click();
	}
	
	public void enterSearchText(String text) {
		txtSearch.clear();
		txtSearch.click();
		txtSearch.sendKeys(text);
	}
}
