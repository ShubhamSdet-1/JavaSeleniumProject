package stepDefinition;

import static org.testng.Assert.assertEquals;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.OnlineProductPage;

public class Onlineproductpage {

	OnlineProductPage run = new OnlineProductPage();

	@When("User click on formal shoes dropdown")
	public void clickFormalShoeDropdown() {
		run.clickFormalShoesDropdown();
	}

	@Then("User should be able to view the products")
	public void viewProducts() {
		String actualText = run.getTextFormalShoeName();
		assertEquals(actualText,"   Classic Cheltenham");
	}
}
