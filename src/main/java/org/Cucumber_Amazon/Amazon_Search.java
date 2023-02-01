package org.Cucumber_Amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Amazon_Search {
	
public WebDriver driver;
	
	@FindBy(xpath = "//a[contains(@href,'mobile-phones')]")
	private WebElement mobile;
	
	@FindBy(xpath = "//span[text()='Smartphones & Basic Mobiles']")
	private WebElement phones;
	
	@FindBy(xpath = "//span[text()='iOS']")
	private WebElement os;
	
	@FindBy(xpath = "//span[text()='Apple']")
	private WebElement brand;
	
	@FindBy(xpath = "//span[contains(@class,'button')]")
	private WebElement sortby;
	
	@FindBy(xpath = "(//a[contains(text(),'Price')])[2]")
	private WebElement high_to_low;
	
	@FindBy(xpath = "(//img[@class='s-image'])[6]")
	private WebElement iphone;
	
	@FindBy(xpath = "(//input[contains(@id,'cart')])[2]")
	private WebElement cart;
	
	@FindBy(xpath = "(//input[@type='submit'])[32]")
	private WebElement buy;
	
	public Amazon_Search(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getPhones() {
		return phones;
	}

	public WebElement getOs() {
		return os;
	}

	public WebElement getBrand() {
		return brand;
	}

	public WebElement getSortby() {
		return sortby;
	}

	public WebElement getHigh_to_low() {
		return high_to_low;
	}

	public WebElement getIphone() {
		return iphone;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getBuy() {
		return buy;
	}

}
