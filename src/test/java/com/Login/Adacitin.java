package com.Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Adacitin {
	static WebDriver driver;
	
	public String selectfromDropDown(WebElement element,String option) {
		Select obj=new Select(element);
		obj.selectByValue(option);
		return obj.getFirstSelectedOption().getText();
		
	}
	
	@Given("user is on adacitin hotel page")
	public void user_is_on_adacitin_hotel_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/eclipse-workspace/Cucumberhello/lib/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}

	@Then("navigate to home page")
	public void navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("username")).sendKeys("HDeepika");
		driver.findElement(By.id("password")).sendKeys("Mine#143");
		driver.findElement(By.id("login")).click();
	}

	@When("select location")
	public void select_location() {
	    // Write code here that turns the phrase above into concrete actions
	   WebElement location= driver.findElement(By.id("location"));
	    selectfromDropDown(location, "Sydney");
	}

	@Then("validate location")
	public void validate_location() {
	    // Write code here that turns the phrase above into concrete actions
	   
	    System.out.println("location has selected");
	}

	@When("select hotel")
	public void select_hotel() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement hotel=driver.findElement(By.id("hotels"));
	    selectfromDropDown(hotel,"Hotel Creek");
	}

	@Then("validate hotel")
	public void validate_hotel() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("hotel selected");
	}

	@When("select room")
	public void select_room() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement rooms=driver.findElement(By.id("room_type"));
	    selectfromDropDown(rooms,"Deluxe");
	}

	@Then("user select room")
	public void user_select_room() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("rooms are selected");
	}

	@When("select room nos")
	public void select_room_nos() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement roomno=driver.findElement(By.id("room_nos"));
	    selectfromDropDown(roomno,"4");
	}

	@Then("room nos select")
	public void room_nos_select() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("rooms selected");
	}

	@When("checkin date")
	public void checkin_date() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement checkin=driver.findElement(By.id("datepick_in"));
	    checkin.clear();
	    checkin.sendKeys("14/2/2023");
	}

	@Then("checkout date")
	public void checkout_date() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement checkout=driver.findElement(By.id("datepick_out"));
	    checkout.clear();
	    checkout.sendKeys("17/03/2023");
	}

	@When("given adults detail")
	public void given_adults_detail() {
	    // Write code here that turns the phrase above into concrete actions
	    WebElement adult=driver.findElement(By.id("adult_room"));
	    selectfromDropDown(adult,"2");
	}

	@Then("given children detail")
	public void given_children_detail() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement child=driver.findElement(By.id("child_room"));
		selectfromDropDown(child,"2");
	}

	@When("user submit the button")
	public void user_submit_the_button() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.id("Submit")).click();
	    
	}

	@Then("navigate the given detail")
	public void navigate_the_given_detail() {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.xpath("/html/body/table[2]/tbody/tr[1]/td[2]/a[4]")).click();
	    driver.close();
	}

}
