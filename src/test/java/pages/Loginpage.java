package pages;

import java.io.IOException;

import actions.ActionPerform;
import utility.ReadConfig;
import utility.ReadExcelFile;

public class Loginpage {

	ActionPerform action = new ActionPerform();
	ReadConfig read = new ReadConfig("C:\\Users\\srajp\\eclipse-workspace\\StoreProject\\xpath.config");
	ReadExcelFile readExcel = new ReadExcelFile("C:\\Users\\srajp\\eclipse-workspace\\StoreProject\\inputFile.xlsx");
	public void loginPage() {
		action.normalClick(read.getConfigValue("Navigate_loginPage"));
	}
	public void enterLoginDetails() throws IOException {
		action.enterValueVisiblityOfElementByXpath(read.getConfigValue("Enter_username"),readExcel.readInputFromExcel("Enter_username"));
		action.enterValueVisiblityOfElementByXpath(read.getConfigValue("Enter_password"),readExcel.readInputFromExcel("Enter_password"));
	}
	public void clickLoginButton() throws IOException {
		action.normalClick(read.getConfigValue("Click_loginbutton"));
	}
	public void clickNewUserRegistration() throws IOException {
		action.normalClick(read.getConfigValue("Click_newuserregistration"));
	}
	public String getTextLoggedInPage() {
		String text1 = action.getTextOfTheElementByXpath(read.getConfigValue("GetText_LoggedInPage"));
		return text1;
	}
	
	
}
