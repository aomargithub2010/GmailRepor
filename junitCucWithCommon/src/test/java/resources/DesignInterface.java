package resources;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import common.perform;

public interface DesignInterface {

	public default void logMeIn(String username, String password) {

	}

	public default void composeEmail(String emailto) {

	}

	public default void logMeOut() throws InterruptedException {

	}

	public default WebElement searchEmail() {
		return null;

	}

	public default void emailContent() {

	}

	public default void mouseHover(perform mouseHover ) throws InterruptedException {

	}

	public default void rightMenu(perform right) {
	}

	public default void searchForEmailInGrid() {
	}
	public default void dragDrop() throws InterruptedException {
	}

	public default	void gmailLogin(String username, String password) throws InterruptedException, IOException {
	}

	public default void OpenEmail() {}

	public default void  elementPresent(WebElement element) throws InterruptedException, IOException{}
	public default void  elementClickable(WebElement element) throws InterruptedException, IOException{}

	public default void  alertAccept() {};
	public default void  alertDissmis() {};
	public default String  alertGetText() {return null;}

}
