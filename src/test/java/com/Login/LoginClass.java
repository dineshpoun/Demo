package com.Login;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebDriver;
import org.pojo.LoginPojoclass;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginClass extends BaseClass {
	public static WebDriver driver;
	private DataTable dataTable1;
	@Given("user has to be in adacitin pages")
	public void user_has_to_be_in_adacitin_pages() {
	    // Write code here that turns the phrase above into concrete actions
	   launchBrowser();
	}

	@When("user has to fill the usernamee and password")
	public void user_has_to_fill_the_usernamee_and_password(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	   List<Map<String, String>> mp=dataTable.asMaps(String.class,String.class);
	    LoginPojoclass lp=new LoginPojoclass();
	    
	    setText(lp.getusername(),mp.get(0).get("username"));
	    setText(lp.getpassword(),mp.get(0).get("password"));
	}

	@When("user needs to click the login buttonn")
	public void user_needs_to_click_the_login_buttonn() {
	    // Write code here that turns the phrase above into concrete actions
	   LoginPojoclass lp=new LoginPojoclass();
	  buttonClick(lp.getLoginbutton()); 	
	}

	@Then("user has to navigate to homepagee")
	public void user_has_to_navigate_to_homepagee() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Result pass");
	   
	}

	@Given("To verify the login with invalid username and invalid password")
	public void to_verify_the_login_with_invalid_username_and_invalid_password() {
	    // Write code here that turns the phrase above into concrete actions
		 launchBrowser();
	}

	@When("user has to be in adacitin pageeee")
	public void user_has_to_be_in_adacitin_pageeee(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		List<Map<String, String>> mp=dataTable1.asMaps(String.class,String.class);
	    LoginPojoclass lp=new LoginPojoclass();
	    
	    setText(lp.getusername(),mp.get(0).get("username"));
	    setText(lp.getpassword(),mp.get(0).get("password"));
	}

	@When("user should to click the login buttonnn")
	public void user_should_to_click_the_login_buttonnn() {
	    // Write code here that turns the phrase above into concrete actions
		 LoginPojoclass lp=new LoginPojoclass();
		  buttonClick(lp.getLoginbutton());   
	}

	@Then("user has to navigate to the homepagee")
	public void user_has_to_navigate_to_the_homepagee() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Result fail");
	}


}
