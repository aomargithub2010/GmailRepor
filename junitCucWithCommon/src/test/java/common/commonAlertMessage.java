package common;

import org.openqa.selenium.Alert;

public class commonAlertMessage extends SharedMethod {
	public static Alert alert = driver.switchTo().alert();

	public commonAlertMessage() {

	}

	@Override
	public void alertAccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

	@Override
	public void alertDissmis() {
		alert.dismiss();

	}
	@Override
	public String alertGetText() {
		return alert.getText();

	}

}
