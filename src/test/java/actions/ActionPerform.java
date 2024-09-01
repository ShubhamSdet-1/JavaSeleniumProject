package actions;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.ss.formula.functions.Column;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionPerform {
	static WebDriver driver;
	static JavascriptExecutor js;
	static Actions action;

	public WebDriver openBrowser(String browserName) {
		
		switch (browserName.toLowerCase()) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			System.out.println(browserName+" is not setup.");
			break;
		}
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		return driver;
	}
	
	public void clickOnVisiblityOfElementByXpath(String xpath) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		driver.findElement(By.xpath(xpath)).click();

	}
	public void normalClick(String xpath) {
		
		driver.findElement(By.xpath(xpath)).click();
		
	}

	public void contextClickOnVisiblityOfElementByXpath(String xpath) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		WebElement element = driver.findElement(By.xpath(xpath));
		action.contextClick(element).perform();
	}

	public void scrollOnPresenceOfElementByXpath(String xpath) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(xpath)));
		WebElement element = driver.findElement(By.xpath(xpath));
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	public void enterValueVisiblityOfElementByXpath(String xpath, String value) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		WebElement element = driver.findElement(By.xpath(xpath));
		element.sendKeys(value);

	}

	public void VisiblityOfElementByXpath(String xpath) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));

	}

	public void hoverElementVisiblityOfElementByXpath(String xpath) {
		action = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		WebElement element = driver.findElement(By.xpath(xpath));
		action.moveToElement(element).build().perform();
	}

	public void switchToWindowByName(String windowHandle) {

		driver.switchTo().window(windowHandle);

	}

	public static String getWindowCurrentHandle(String windowHandle) {

		String currentWindow = driver.getWindowHandle();
		return currentWindow;

	}

	public void switchToDefaultContent() {

		driver.switchTo().defaultContent();

	}

	public void switchToFrameIndex(int frameIndex) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameIndex));

	}

	public void switchToFrameId(int frameId) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameId));

	}

	public void openUrl(String url) {

		driver.get(url);
	}
	public void closeBrowser() {
		
		driver.close();
	}

	public String getTextOfTheElementByXpath(String xpath) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		WebElement element = driver.findElement(By.xpath(xpath));
		String elementText = element.getText();
		return elementText;
	}

	public static String getValueOfTheElementByXpath(String xpath, String attributeName) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xpath)));
		WebElement element = driver.findElement(By.xpath(xpath));
		String attributeValue = element.getAttribute(attributeName);
		return attributeValue;
	}

}
