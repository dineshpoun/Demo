package org.BaseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	public static WebDriver driver;
	
	public void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");		
	}
	
	public String setText(WebElement element1,String name) {
		if(name!=null) {
			element1.click();
			element1.clear();
			element1.sendKeys(name);
			
		}
		return name;
	}
	public void buttonClick(WebElement element) {
		element.click();
	}
	}
