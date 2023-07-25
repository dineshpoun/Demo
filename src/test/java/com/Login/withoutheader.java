package com.Login;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class withoutheader {
static WebDriver driver;
@Given("you are on the login page")
public void you_are_on_the_login_page() {
    // Write code here that turns the phrase above into concrete actions
	System.setProperty("webdriver.chrome.driver", "lib\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}

@When("you enter the below credentials")
public void you_enter_the_below_credentials(io.cucumber.datatable.DataTable dataTable) {
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    List<String> input = dataTable.transpose().asList(String.class);
    String username = input.get(0);
    System.out.println(username);
    String pass = input.get(1);
    System.out.println(pass); 
    
    driver.findElement(By.name("username")).sendKeys(username);
    driver.findElement(By.name("password")).sendKeys(pass);
}

@And("click the login button")
public void click_the_login_button() {
    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
    
}

@Then("you should navigate the homepage")
public void you_should_navigate_the_homepage() {
    // Write code here that turns the phrase above into concrete actions
   boolean result=driver.findElement(By.linkText("Vignesh Collings")).isDisplayed();
   Assert.assertTrue(result);
}

}
