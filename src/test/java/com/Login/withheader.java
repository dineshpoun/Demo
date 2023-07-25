package com.Login;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class withheader {
static WebDriver driver;
@Given("go to the login page")
public void go_to_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
    System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
    driver =new ChromeDriver();
    driver.get("https://www.facebook.com/login/");
    
}

@When("enter the below credentials")
public void enter_the_below_credentials(io.cucumber.datatable.DataTable dataTable) {
    // Write code here that turns the phrase above into concrete actions
    List<Map<String,String>> keyValuePair=dataTable.asMaps(String.class,String.class);
    String username=keyValuePair.get(0).get("Username");
    String password=keyValuePair.get(0).get("Password");
    
    driver.findElement(By.id("email")).sendKeys(username);
    driver.findElement(By.id("pass")).sendKeys(password);
    
}

@When("clicks login button")
public void clicks_login_button() {
    driver.findElement(By.id("loginbutton")).click();
}

@Then("Navigate to homepage")
public void navigate_to_homepage() {
	System.out.println("nnnnnn");
   driver.findElement(By.xpath("//*[@id=\"mount_0_0_iW\"]/div/div[1]/div/div[3]/div/div/div/div[1]/div[1]/div/div[1]/div/div/div[1]/div/div/div[1]/ul/li/div/a/div[1]/div[2]/div/div/div/div/span/span")).getText();
   System.out.println("bbbbbb");
}

 

}
