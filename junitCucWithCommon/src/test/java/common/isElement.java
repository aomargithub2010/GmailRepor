package common;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class isElement extends SharedMethod {
	public  isElement() {
	}
	
	@Override
	public void elementPresent (WebElement element ) throws InterruptedException, IOException 
	 {   
	  //To wait for element visible
	  WebDriverWait wait = new WebDriverWait(driver, 15);
	  wait.until(ExpectedConditions.visibilityOf(element));
	     
	 }
	@Override
	public void elementClickable (WebElement element ) throws InterruptedException, IOException 
	 {   
	  //To wait for element visible
	  WebDriverWait wait = new WebDriverWait(driver, 15);
	  wait.until(ExpectedConditions.elementToBeClickable(element));
	  }

}
