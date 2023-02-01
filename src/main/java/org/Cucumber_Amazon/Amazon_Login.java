package org.Cucumber_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Login {
	
public WebDriver driver;
	
	@FindBy(xpath = "//a[@id= 'nav-link-accountList']")
	private WebElement account;
	
	@FindBy(xpath = "//span[text() = 'Sign in']")
	private WebElement signin;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement username;
	
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement conti;
	
	@FindBy(xpath = "//input[@type='password']")
	private WebElement pwd;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;
	
	public Amazon_Login(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getSignin() {
		return signin;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getConti() {
		return conti;
	}

	public WebElement getPwd() {
		return pwd;
	}

	public WebElement getSubmit() {
		return submit;
	}

}
