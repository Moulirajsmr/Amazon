package com.amazon.bag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {
	
	public WebDriver driver;
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement account;
	
	@FindBy(xpath="(//span[text() = 'Sign in'])[1]")
	private WebElement signin;
	
	@FindBy(xpath="//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement contin;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement password;
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	private WebElement sign;
		
	public Login_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
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

	public WebElement getEmail() {
		return email;
	}

	public WebElement getContin() {
		return contin;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSign() {
		return sign;
	}

}
