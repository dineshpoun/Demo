package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps { 
static WebDriver driver;

	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/"); 
		
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		driver.findElement(By.id("username")).sendKeys("string");
		
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		System.out.println("inside step- clicks on login button");
	}


		@Then("user is navigated to the home page;")
		public void user_is_navigated_to_the_home_page() {
			
		    throw new io.cucumber.java.PendingException();
	}


}
