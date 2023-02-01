package com.amazon.bag;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Page {
	
	public WebDriver driver;
	
	@FindBy(xpath="//input[@type='text']")
	private WebElement bag;

	@FindBy(xpath="//input[@type='submit']")
	private WebElement submit;		
	
	@FindBy (xpath="//span[text()='School Bags']")
    private WebElement schoolbags;
	
	@FindBy (xpath="(//span[text()='American Tourister'])[3]")
    private WebElement americanbags;
	
	@FindBy (xpath="(//img[@class='s-image'])[1]")
    private WebElement imgbags;
	
	@FindBy(xpath="//input[@id='add-to-cart-button']")
     private WebElement cart;	
	
	public Search_Page(WebDriver driver2) {
		this.driver=driver2;
		PageFactory.initElements(driver,this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getBag() {
		return bag;
	}

	public WebElement getSubmit() {
		return submit;
	}

	public WebElement getSchoolbags() {
		return schoolbags;
	}

	public WebElement getAmericanbags() {
		return americanbags;
	}

	public WebElement getImgbags() {
		return imgbags;
	}

	public WebElement getCart() {
		return cart;
	}		

}
