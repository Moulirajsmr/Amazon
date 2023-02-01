package com.amazon.stepdefenition;

import java.util.Set;

import org.Cucumber_Amazon.Amazon_Login;
import org.Cucumber_Amazon.Amazon_Search;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import com.amazon.runner.Runner_Amazon;
import com.base.amazon.Base_Amazon;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdefenition_Amazon extends Base_Amazon {
	
	public static WebDriver driver= Runner_Amazon.driver;
			
	@Given("User Launch The Amazon Url {string}")
	public void user_launch_the_amazon_url(String string) {
	    url(driver, string);
	}	
	
	public static Amazon_Login login = new Amazon_Login(driver);
	
	Actions a = new Actions(driver);

	@When("User Navigate To Account and List Field")
	public void user_navigate_to_account_and_list_field() {
	   a.moveToElement(login.getAccount()).build().perform();
	}
	@When("User Click The Signin button")
	public void user_click_the_signin_button() {
	    a.click(login.getSignin()).build().perform();
	}
	@When("User Enter The Username {string} In The Username Field")
	public void user_enter_the_username_in_the_username_field(String string) {
	   send_keys(login.getUsername(), string);
	}	
	@When("User Click The Continue button")
	public void user_click_the_continue_button() {
	   click(login.getConti());
	}
	@When("User Enter The Password {string} In The Password Field")
	public void user_enter_the_password_in_the_password_field(String string) {
	   send_keys(login.getPwd(), string); 
	}
	@Then("User Click The Submit button And It Navigate To Amazon Search Page")
	public void user_click_the_submit_button_and_it_navigate_to_amazon_search_page() {
	   click(login.getSubmit());
	}
	
	public static Amazon_Search search = new Amazon_Search(driver);
	
	@When("User Click On The Mobiles In The Menu Tab")
	public void user_click_on_the_mobiles_in_the_menu_tab() {
	   click(search.getMobile()); 
	}
	@When("User Click On The Smarphones&Basicphones In The Menu Category")
	public void user_click_on_the_smarphones_basicphones_in_the_menu_category() {
	   click(search.getPhones());
	}
	@When("User Click On The Ios In The Operating System Checkbox")
	public void user_click_on_the_ios_in_the_operating_system_checkbox() {
	    click(search.getOs());
	}
	@When("User Click On The Apple In The Brands Check Box")
	public void user_click_on_the_apple_in_the_brands_check_box() {
	    click(search.getBrand());
	}
	@When("User Click On The Feature DropDown Box")
	public void user_click_on_the_feature_drop_down_box() {
	   click(search.getSortby()); 
	}
	@When("User Click On The High To Low In The Feature Box")
	public void user_click_on_the_high_to_low_in_the_feature_box() {
	    click(search.getHigh_to_low());
	}	
	@When("User Click On The Preferred Apple Iphone")
	public void user_click_on_the_preferred_apple_iphone() throws InterruptedException {
		Thread.sleep(20000);
	   click(search.getIphone());
	   String parent_Id = driver.getWindowHandle();
		
		Set<String> all_id = driver.getWindowHandles();
		
		for (String id : all_id) {
			
			System.out.println("id"+ id);
			
			if (id.equals(parent_Id)) {
				continue;				
			}else {
				driver.switchTo().window(id);
				Thread.sleep(5000);				
			}			
		}
	}
	
	@When("User Click On The Add To Cart button")
	public void user_click_on_the_add_to_cart_button() throws InterruptedException {
		Thread.sleep(20000);
	   click(search.getCart());
	}
	@Then("User Click on The Proceed To Checkout button")
	public void user_click_on_the_proceed_to_checkout_button() throws InterruptedException {
		Thread.sleep(50000);
	   click(search.getBuy());
	}

}
