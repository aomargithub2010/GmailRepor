package common;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import PageObjects.PomGmailHomePage;
import PageObjects.PomMailbody;
import resources.TestBase;
import resources.propertiesFile;

public class SharedMethod extends TestBase {

	public static String subject = "qmbvnsbhithxtqaukzbe";// RandomStringUtils.randomAlphabetic(20).toLowerCase();
	public static String body = RandomStringUtils.randomAlphabetic(20).toLowerCase();
	public static String filename = "test.txt";
	public static WebElement row;
	public static propertiesFile config = new propertiesFile();
	public static commonGmailLogin login = new commonGmailLogin();
	public static commonSearchEmails search = new commonSearchEmails();
	public static commonComposeEmail compose = new commonComposeEmail();
	public static PomGmailHomePage homepage = new PomGmailHomePage(driver);
	public static commonEmailContent content = new commonEmailContent();
	public static commonActionBuilder action = new commonActionBuilder();

	@Override
	public void logMeOut() throws InterruptedException {

		homepage.getUserLogout();
		homepage.getLogout();
		Thread.sleep(2000);
		driver.manage().deleteAllCookies();
		driver.navigate().to("http://gmail.com");
	}



	

	public void getScreenshot(String result) throws IOException {
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C://test//" + result + "screenshot.png"));

	}

}
