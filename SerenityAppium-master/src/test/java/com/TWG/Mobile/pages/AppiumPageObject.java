package com.TWG.Mobile.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.google.common.base.Predicate;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.webdriver.WebDriverFacade;

public class AppiumPageObject extends PageObject {
	  public AppiumPageObject(WebDriver driver) {
//	      super(driver);
//	      PageFactory.initElements(new AppiumFieldDecorator(((WebDriverFacade) getDriver()).getProxiedDriver(),
//	              this.getImplicitWaitTimeout().in(TimeUnit.SECONDS), TimeUnit.SECONDS), this);
//	  }
		  super(driver, new Predicate<PageObject>() {

			  @Override
			  public boolean apply(PageObject page) {

				  PageFactory
						  .initElements(new AppiumFieldDecorator(((WebDriverFacade) page.getDriver()).getProxiedDriver(),
								  page.getImplicitWaitTimeout()), page);
				  return true;
			  }

		  });
	  }
	}