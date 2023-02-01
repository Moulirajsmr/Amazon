package com.amazon.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base.amazon.Base_Amazon;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\amazon\\feature\\Amazon.feature",
glue="com.amazon.stepdefenition",
monochrome = true,
dryRun = false,
publish = true,
plugin = {"html:Report/rep.html",
		"pretty"})

public class Runner_Amazon {

	public static WebDriver driver;
	
	@BeforeClass
	public static void start() {
		
		driver = Base_Amazon.browser_launch("chrome");
	}
	

}
