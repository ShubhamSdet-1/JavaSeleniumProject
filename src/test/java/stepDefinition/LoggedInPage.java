package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import actions.ActionPerform;
import io.cucumber.java.en.Then;
import pages.Loginpage;

public class LoggedInPage {
	Loginpage run1 = new Loginpage();
	ActionPerform action = new ActionPerform();

	@Then("User should be able to view the product category page")
	public void categoryPageView() throws IOException, InterruptedException {
		String categoryPageText = run1.getTextLoggedInPage();
		assertEquals(categoryPageText, "Formal Shoes");
		TimeUnit.SECONDS.sleep(6);
		// action.closeBrowser();
	}

}
