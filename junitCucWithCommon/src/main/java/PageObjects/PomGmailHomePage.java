package PageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import resources.TestBase;

public class PomGmailHomePage extends TestBase {

	public PomGmailHomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// find compose button
	@FindBy(how = How.XPATH, using = "//*[@gh='cm']")
	private WebElement compose;

	// find user Menu logout
	@FindBy(how = How.XPATH, using = "//*[@class='gb_9a gbii']")
	private WebElement userMenulogout;

	// find user logout
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Sign out')]")
	private WebElement logout;
	// find user EMail subject in Emaillist
	@FindBy(how = How.XPATH, using = "//table[@class='F cf zt']/tbody/tr/td[6]")
	private List<WebElement> subject;

	// find List of emails
	private List<WebElement> listEmails;

	public List<WebElement> getEmailsBySubject() {
		this.listEmails = subject;
		return this.listEmails;
	}

	// right click Archive  
	@FindBy(how = How.XPATH, using = "//*[contains(text(), 'Archive')]")
	private WebElement archive;

	// left part of the page
	@FindBy(how = How.XPATH, using = "//*[@class='byl']")
	public WebElement lefttab;

	// right click delete
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Delete')]")
	private WebElement delete;

	// right click make as unread
	@FindBy(how = How.XPATH, using = "//*[contains(text(),'Mark as unread')]")
	private WebElement MakeAsUnread;

	// Mouse Hover delete
	@FindBy(how = How.XPATH, using = "//*[@data-tooltip='Delete']")
	private WebElement mouseHoverDelete;
	
	// Mouse Hover Archive
	@FindBy(how = How.XPATH, using = "//*[@class='bq4 xY']//*[@class='bqY']//li[@data-tooltip='Archive']")
	public WebElement mouseHoverArchive;
	
	// Mouse Hover Make as read
	@FindBy(how = How.XPATH, using = "//*[@data-tooltip='Mark as unread']")
	private WebElement mouseHoverMakeAsRead;

	// Drag to
	@FindBy(how = How.XPATH, using = "//*[@title='DragDrop']")
	public WebElement dragTo;
	
	// the div of folders 
	@FindBy(how = How.XPATH, using = "//*[@class='TK']")
	public WebElement folderDiv;
	
	// Mesg to check the folder is already exist
	@FindBy(how = How.XPATH, using = "*//[contains(text(),'The label name you have chosen already exists')]")
	public WebElement folderexist;

	// mouse hover
	@FindBy(how = How.XPATH, using = "//*[@class='xW xY']")
	public WebElement hover;

	// Get Compose
	public void getCompose() {
		this.compose.click();

	}

	// Get Archive
	public void getArchive() {
		this.archive.click();

	}

	// Get Delete
	public void getDelete() {
		this.delete.click();

	}

	// Get righ click Make as unread
	public void getMakeAsUnread() {
		this.MakeAsUnread.click();
	}

	// Get Mouse hover Delete
	public void getMouseHoverDelete() {
		this.mouseHoverDelete.click();
	}

	// Get user Menu logout
	public void getUserLogout() {
		this.userMenulogout.click();
	}

	// Get logout
	public void getLogout() {
		this.logout.click();

	}

	// Get Mouse hover Archive
	public void getMouseHoverArchive() {
		this.mouseHoverArchive.click();
	}

	// get hover mouse
	public void getMouseHover() {
		Actions action = new Actions(driver);
		action.moveToElement(mouseHoverArchive).build().perform();
		this.mouseHoverArchive.click();
	}

}
