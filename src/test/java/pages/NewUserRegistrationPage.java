package pages;

import actions.ActionPerform;
import utility.ReadConfig;

public class NewUserRegistrationPage {

	ActionPerform actions = new ActionPerform();
	ReadConfig read = new ReadConfig("C:\\Users\\srajp\\eclipse-workspace\\StoreProject\\xpath.config");

	public String getTextUserRegistrationPage() {
		String userRegistrationHeading = actions
				.getTextOfTheElementByXpath(read.getConfigValue("GetText_userregistrationpage"));
		return userRegistrationHeading;
	}

}
