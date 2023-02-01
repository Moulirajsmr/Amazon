package com.amazon1.stepdefenition;

import java.util.Set;

import org.openqa.selenium.interactions.Actions;

import com.amazon.bag.Login_Page;
import com.amazon.bag.Search_Page;
import com.base.amazon.Base_Amazon;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stepdefenition_Amazon1 extends Base_Amazon{
	
	@Given("User Launch The Amazon Url {string}")
	public void user_launch_the_amazon_url(String string) {
	   url(driver, string); 
	}
	
	public static Login_Page login= new Login_Page(driver);
	
	Actions a = new Actions(driver);
	
	@When("User Navigate To Account And List Field")
	public void user_navigate_to_account_and_list_field() {
	  a.moveToElement(login.getAccount()).build().perform();  
	}
	@When("User Click The Signin button")
	public void user_click_the_signin_button() {
	   a.click(login.getSignin()).build().perform();
	}
	@When("User Enter The Username {string} In The Username Field")
	public void user_enter_the_username_in_the_username_field(String string) {
	   send_keys(login.getEmail(), string); 
	}
	@When("User Click The Continue button")
	public void user_click_the_continue_button() {
	   click(login.getContin()); 
	}
	@When("User Enter The Password {string} In the Password Field")
	public void user_enter_the_password_in_the_password_field(String string) {
	    send_keys(login.getPassword(), string);
	}
	@Then("user Click The Signin Button And It Navigate To Search Page")
	public void user_click_the_signin_button_and_it_navigate_to_search_page() {
	    click(login.getSign());
	}
	
	public static Search_Page search = new Search_Page(driver);
	
	@When("User Enter The Fresh In The Menu Tab")
	public void user_enter_the_fresh_in_the_menu_tab() {
	    send_keys(search.getBag(), "bag");
	}
	@When("User Click On The Search button")
	public void user_click_on_the_search_button() {
	    click(search.getSubmit());
	}
	@When("User Click On The School Bags In The Menu Category")
	public void user_click_on_the_school_bags_in_the_menu_category() {
	   click(search.getSchoolbags());
	}
	@When("User Click On The  American Tourister")
	public void user_click_on_the_american_tourister() {
	   click(search.getAmericanbags());
	}
	@When("User Click On The preferred Bag")
	public void user_click_on_the_preferred_bag() throws InterruptedException {
		
	click(search.getImgbags());
	
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
	public void user_click_on_the_add_to_cart_button() {
	   click(search.getCart());
	}
}
