package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.runnerclass.DemoBlaze_Runner;
import com.web.pom.DemoBlaze_Homepage;

public class DemoBlaze_Testng extends DemoBlaze_Runner {

	// public static WebDriver driver=null;

	@Test(priority = 0)
	public void launchBrowser() throws InterruptedException {
		launchUrl("https://www.demoblaze.com/");
		implicitlyWait();
		// sleep();
	}

//	@Test(priority = 1)
//	public void clickSignUp() throws InterruptedException {
//		DemoBlaze_Homepage home = new DemoBlaze_Homepage();
//		//sleep();
//		clickOnElement(home.signIn());
//	}
//	
//	@Test(priority = 2)
//	public void signUpForm() {
//		DemoBlaze_Homepage home = new DemoBlaze_Homepage();
//		userInput(home.userSignup(), "Harirmnm");
//		userInput(home.passSignup(), "Harirmnm");
//		clickOnElement(home.btnSignup());
//		//acceptAlert();
//	}

	@Test(priority = 1)
	public void clicklogin() {
		DemoBlaze_Homepage home = new DemoBlaze_Homepage();
		clickOnElement(home.login());
	}

	@Test(priority = 2)
	public void loginForm() {
		DemoBlaze_Homepage home = new DemoBlaze_Homepage();
		userInput(home.userLogin(), "Harirmnm");
		userInput(home.passLogin(), "Harirmnm");
		clickOnElement(home.btnLogin());
	}

	@Test(priority = 3)
	public void verification() {
		DemoBlaze_Homepage home = new DemoBlaze_Homepage();
//		if(home.msg().getText().contains(expected)) {
//			System.out.println("Login Successfull");
//		}
		String expected = "Welcome Harirmnm";
		String actual = home.msg().getText();
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actual, expected);
//		try {
//			Assert.assertEquals(actual, expected);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}

	}
}
