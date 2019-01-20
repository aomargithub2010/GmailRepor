package common;

import org.openqa.selenium.WebElement;

import PageObjects.PomGmailHomePage;

public class commonSearchEmails extends SharedMethod{

	@Override
	public WebElement searchEmail() {
		String Searchby;
		PomGmailHomePage homepage = new PomGmailHomePage(driver);

		System.out.println("Saerch for email with Subject " + "zqyyog");
			for(int i=0;i<homepage.getEmailsBySubject().size();i++) {
				System.out.println(homepage.getEmailsBySubject().get(i).getText());
             if (homepage.getEmailsBySubject().get(i).getText().contains("zqyyog")) {
				//
				row = homepage.getEmailsBySubject().get(i);
				System.out.println("Saerch for email with Subject " + "zqyyog");
				i = homepage.getEmailsBySubject().size();

			}

			else {
				System.out.println("-------- Email is not found ");
			}
		}
		

	
		return row;
	}
	@Override
	public void OpenEmail() {
		searchEmail();
		row.click();
		

	}
	}
