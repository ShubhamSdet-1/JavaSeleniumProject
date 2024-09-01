package stepDefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import pages.NewUserRegistrationPage;

public class Newuserregistration {
	NewUserRegistrationPage run = new NewUserRegistrationPage();

	@Then("User should be able to view the user registration page")
	public void newUserRegistrationPage() {
		String actualText = run.getTextUserRegistrationPage();
		assertEquals(actualText, "User Registration Page");
	}
}
