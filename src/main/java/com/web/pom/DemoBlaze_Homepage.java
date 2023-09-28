package com.web.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.DemoBlaze_Base;

public class DemoBlaze_Homepage extends DemoBlaze_Base {

	@FindBy(xpath = "//a[@id='signin2']")
	private WebElement signin;

	@FindBy(id = "sign-username")
	private WebElement userSignup;

	@FindBy(id = "sign-password")
	private WebElement passSignup;

	@FindBy(xpath = "//button[contains(text(),'Sign up')]")
	private WebElement btnSignup;

	@FindBy(id = "login2")
	private WebElement login;

	@FindBy(id = "loginusername")
	private WebElement userLogin;

	@FindBy(id = "loginpassword")
	private WebElement passLogin;

	@FindBy(xpath = "//button[contains(text(),'Log in')]")
	private WebElement btnLogin;

	@FindBy(xpath = "//a[@id='nameofuser']")
	private WebElement msg;

	public WebElement userSignup() {
		return userSignup;
	}

	public WebElement passSignup() {
		return passSignup;
	}

	public WebElement login() {
		return login;
	}

	public WebElement userLogin() {
		return userLogin;
	}

	public WebElement passLogin() {
		return passLogin;
	}

	public WebElement btnLogin() {
		return btnLogin;
	}

	public WebElement msg() {
		return msg;
	}

	public WebElement btnSignup() {
		return btnSignup;
	}

	public WebElement signIn() {
		System.out.println(signin.toString());
		return signin;
	}

	public DemoBlaze_Homepage() {
		PageFactory.initElements(driver, this);
	}

}
