package com.base.amazon;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Amazon {
	
public static WebDriver driver;
	
	public static WebDriver browser_launch(String name) {
		
		if (name.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\DR\\eclipse-workspace\\Cucumber_Amazon\\Driver\\chromedriver.exe");
			//ChromeOptions options = new ChromeOptions();
			//options.addArguments("incognito");
			driver = new ChromeDriver();
			
		} else if (name.equals("edge")) {
			System.setProperty("webdriver.edge.driver", 
					"C:\\Users\\DR\\eclipse-workspace\\Cucumber_Amazon\\Driver\\msedgedriver.exe");
			
			EdgeOptions options = new EdgeOptions();
			options.addArguments("incognito");
			driver = new EdgeDriver(options);
		}
		return driver;
	}
	
	public static void url(WebDriver u,String string) {
		u.get(string);

	}

	public static void maximize(WebDriver d) {
		d.manage().window().maximize();
	}
	
	public static void send_keys(WebDriver c, String url) {
		c.get(url);
	}

	public static void close(WebDriver c) {
		c.close();
	}

	public static void quit(WebDriver c) {
		c.quit();
	}

	public static void navigate_to(WebDriver n, String String) {
		n.navigate().to(String);
	}

	public static void navigate_back(WebDriver n) {
		n.navigate().back();
	}

	public static void navigate_forward(WebDriver n) {
		n.navigate().forward();
	}

	public static void navigate_refresh(WebDriver n) {
		n.navigate().refresh();
	}

	public static void click(WebElement elem) {
		elem.click();
	}

	public static void send_keys(WebElement elem, CharSequence value) {
		elem.sendKeys(value);
	}

	public static void clear(WebElement elem) {
		elem.clear();
	}

	public static void get_text(WebElement elem) {
		elem.getText();
	}

	public static void is_displayed(WebElement elem) {
		elem.isDisplayed();
	}

	public static void is_enabled(WebElement elem) {
		elem.isEnabled();
	}

	public static void is_selected(WebElement elem) {
		elem.isSelected();
	}

	public static void select_index(WebElement ele, int index) {
		Select s = new Select(ele);
		s.selectByIndex(index);
	}

	public static void select_value(WebElement elem, String value) {
		Select s = new Select(elem);
		s.selectByValue(value);
	}

	public static void select_vtext(WebElement elem, String txt) {
		Select s = new Select(elem);
		s.selectByVisibleText(txt);
	}

	public static void accept(WebDriver d) {
		d.switchTo().alert().accept();
	}

	public static void dismiss(WebDriver d) {
		d.switchTo().alert().dismiss();
	}

	public void frame_index(WebDriver f, int i) {
		f.switchTo().frame(i);
	}

	public static void frame_idname(WebDriver f, String ni) {
		f.switchTo().frame(ni);
	}

	public static void frame_webelement(WebDriver f, WebElement webele) {
		f.switchTo().frame(webele);
	}

	public static void jsexec(WebDriver j, WebElement el) {
		JavascriptExecutor js = (JavascriptExecutor) j;
		js.executeScript("arguments[0].click");
	}

	public static void down() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
	}

	public static void a_click(WebDriver d, WebElement element) {
		Actions a = new Actions(d);
		a.click(element).build().perform();
	}

	public static void a_ctxtclick(WebElement element, WebDriver d) {
		Actions a = new Actions(d);
		a.contextClick(element).build().perform();

	}

}
