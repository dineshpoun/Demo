package com.Login;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Backgroud {
	static WebDriver driver;
	@Given("user is on hrmhotel page") 
	public void user_is_on_hrmhotel_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:/Users/DELL/eclipse-workspace/Cucumberhello/lib/chromedriver.exe");
		driver =new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
	} 

	@When("enters the username and password")
	public void enters_the_username_and_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(30000);
	    driver.findElement(By.name("username")).sendKeys("Admin");
	    driver.findElement(By.name("password")).sendKeys("admin123");
	    
	}

	@Then("navigate to homrpage")
	public void navigate_to_homrpage() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}

	@When("user clicks admin button")
	public void user_clicks_admin_button() {
	    // Write code here that turns the phrase above into concrete actions
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
	}

	@Then("admin button gets open")
	public void admin_button_gets_open() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("admin page get open");
	    driver.close();
	}

	@When("user clicks on user")
	public void user_clicks_on_user() {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
	}

	@Then("logout page get displayed")
	public void logout_page_get_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	    boolean result=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).isDisplayed();
	    Assert.assertTrue(result);
	}
}
