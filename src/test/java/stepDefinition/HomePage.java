package stepDefinition;

import io.cucumber.java.en.Given;

import java.io.IOException;

import pages.Homepage;
import pages.Loginpage;
import pages.OnlineProductPage;

public class HomePage {
	Homepage run = new Homepage();
	OnlineProductPage run1 = new OnlineProductPage();
	Loginpage run2 = new Loginpage();

	@Given("User navigate to the home page")
	public void userNavigateToTheLoginPage() throws InterruptedException {
		run.clickHamburgerMenu();
		run.home();
	}

	@Given("User navigate to the login page")
	public void navigateLoginPage() throws InterruptedException, IOException {
		run.clickHamburgerMenu();
		run2.loginPage();
	}

	@Given("User navigate to the online product page")
	public void navigateProdductPage() throws InterruptedException {
		run.clickHamburgerMenu();
		run1.navigateOnlineProductPage();
	}

}
