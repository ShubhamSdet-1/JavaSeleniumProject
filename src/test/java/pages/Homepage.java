package pages;

import actions.ActionPerform;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;
import utility.ReadConfig;

public class Homepage {
	ActionPerform actions = new ActionPerform();
	ReadConfig read = new ReadConfig("C:\\Users\\srajp\\eclipse-workspace\\StoreProject\\xpath.config");

	public void clickHamburgerMenu() throws InterruptedException {

		actions.openBrowser("Chrome");
		actions.openUrl("https://anupdamoda.github.io/AceOnlineShoePortal/index.html#");
		actions.normalClick(read.getConfigValue("Click_HamburgerMenu"));
		Thread.sleep(200);

	}

	public void home() throws InterruptedException {
		actions.clickOnVisiblityOfElementByXpath(read.getConfigValue("Homepage"));
		Thread.sleep(200);

	}
}
