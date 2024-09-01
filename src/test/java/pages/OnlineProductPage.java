package pages;

import actions.ActionPerform;
import utility.ReadConfig;

public class OnlineProductPage {

	ActionPerform action = new ActionPerform();
	ReadConfig read = new ReadConfig("C:\\Users\\srajp\\eclipse-workspace\\StoreProject\\xpath.config");
	public void navigateOnlineProductPage() throws InterruptedException {
		action.normalClick(read.getConfigValue("Navigate_onlineproductpage"));
	}
	
	public void clickFormalShoesDropdown() {
		action.normalClick(read.getConfigValue("Click_formalshoedropdown"));
	}
	
	public String getTextFormalShoeName() {
		String firstFormalShoeName = action.getTextOfTheElementByXpath(read.getConfigValue("GetText_firstformalshoename"));
		return firstFormalShoeName;
	}
	
}
