package org.pojo;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPojoclass extends BaseClass{
	
	//using annotation
	@FindBy(id="username")
	private WebElement username;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private WebElement Loginbutton;
	
	public LoginPojoclass() {
		PageFactory.initElements(driver, this);
	}
	public WebElement getusername() {
		return username;
}
	public WebElement getpassword() {
		return password;
	}
	public WebElement getLoginbutton() {
		return Loginbutton;
		// TODO Auto-generated method stub
		
	}
}