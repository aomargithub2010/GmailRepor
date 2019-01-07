package common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Sleeper;

import common.commonSearchEmails;
import PageObjects.PomGmailHomePage;

public class commonActionBuilder extends SharedMethod {

	@Override
	public void dragDrop() throws InterruptedException {
		PomGmailHomePage homePage = new PomGmailHomePage(driver);

		Actions action = new Actions(driver);
		action.moveToElement(homePage.lefttab);

		Thread.sleep(2000);

		//// scroll
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", homePage.dragTo);

		action.dragAndDrop(row, homePage.dragTo).build().perform();
		// System.out.println("done");

	}

	@Override
	public void rightMenu(perform right) {
		PomGmailHomePage homepage = new PomGmailHomePage(driver);

		Actions action = new Actions(driver);
		action.contextClick(search.searchEmail()).perform();
		switch (right) {
		case Archive:
			homepage.getArchive();
			break;

		case Delete:
			homepage.getDelete();
			break;
		case MakeAsUnread:
			homepage.getMakeAsUnread();
			break;

		}

	}

	@Override
	public void mouseHover(perform mouseHover) throws InterruptedException {
		Actions action = new Actions(driver);
		action.moveToElement(search.searchEmail()).build().perform();
		PomGmailHomePage homepage = new PomGmailHomePage(driver);
		Thread.sleep(3000);
		String reqaction = "archive";
		switch (mouseHover) {
		case Archive:
			System.out.print("archive");
			homepage.getMouseHover();
			System.out.print("archiveHover");

			homepage.getMouseHoverArchive();
			break;
	
		case Delete:

			homepage.getMouseHoverDelete();
			break;
		case MakeAsUnread:
			homepage.getMakeAsUnread();
			break;
		case Snooze:
			// not define yet
			break;

		}

	}
}
