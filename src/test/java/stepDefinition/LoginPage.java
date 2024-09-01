package stepDefinition;

import java.io.IOException;
import io.cucumber.java.en.When;
import pages.*;
public class LoginPage {
	Loginpage run1 = new Loginpage();
	
	@When("User successfully enter the login details")
	public void enterLoginDetailsAndLogin() throws IOException {
		run1.enterLoginDetails();
		run1.clickLoginButton();
	}
	@When("User click on new user registration")
	public void clickNewUserRegistration() throws IOException {
		run1.clickNewUserRegistration();
	}
	
}
