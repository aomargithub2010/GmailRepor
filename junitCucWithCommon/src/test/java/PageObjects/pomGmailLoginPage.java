
/* in this class we create the page object for sign in page   */

package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class pomGmailLoginPage {

	WebDriver driver;

	public pomGmailLoginPage(WebDriver driver) {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Sign in')]")
	private WebElement signIn;
	
	@FindBy(how = How.XPATH, using = "//*[@id='identifierId']")
	public  WebElement userName;

	@FindBy(how = How.XPATH, using = "//*[@id='identifierNext']/content/span")
	private WebElement next;

	@FindBy(how = How.XPATH, using = "//*[@id='password']/div[1]/div/div[1]/input")
	private WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id='passwordNext']/content/span")
	private WebElement nextPassword;

	@FindBy(how = How.XPATH, using = "//*[@jsname='B34EJ'][@class='dEOOab RxsGPe'][1]")
	private WebElement wrongPassword;

	
	// click sign in
	public void clickSignIn() {
		this.signIn.click();

	}
	// get username
	public void typeUsername(String userName) {
		this.userName.sendKeys(userName);
	}

	// return Next
	public void clickNext() {
		this.next.click();

	}

	// return password
	public void typePassword(String password) {

		this.password.sendKeys(password);
	}

	// return next button after password
	public void clickNextPassword() {

		this.nextPassword.click();
	}

	// wrong password

	// get username
	public boolean getWrongPassword() {
		boolean crd = this.wrongPassword.isDisplayed();
		return this.wrongPassword.isDisplayed();
	}

	// return Worng Password
	public void setWrongPassword() {
		this.wrongPassword.isDisplayed();

	}

}
