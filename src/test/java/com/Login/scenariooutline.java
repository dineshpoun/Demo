package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenariooutline {
	static WebDriver driver;
	@Given("user navigate to adacitin hotel page")
	public void user_navigate_to_adacitin_hotel_page() {
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/eclipse-workspace/Cucumberhello/lib/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	}

	@When("i enter username as {string} and password as {string}")
	public void i_enter_username_as_and_password_as(String un, String pn) {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.id("password")).sendKeys(pn);
		driver.findElement(By.id("login")).click();
 
	} 

	@Then("login should be unsuccessful")
	public void login_should_be_unsuccessful() {
		if(driver.getCurrentUrl().equals(

				"https://adactinhotelapp.com/SearchHotel.php")) {
			System.out.println("Test pass");
		}else {
			System.out.println("test fail");
		}


	} 

}
