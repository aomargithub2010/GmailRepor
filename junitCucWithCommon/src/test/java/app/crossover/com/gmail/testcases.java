package app.crossover.com.gmail;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import common.SharedMethod;
import common.perform;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import resources.MyScreenRecorder;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)


public class testcases extends SharedMethod {



	/*
	 * Test case 1 , create new email 1. Login to Gmail - Sender user 2. create the
	 * Email with attached file 3. logout
	 */
	//@Ignore("Im Not Ready")
	@Test

	public void FirstComposeEmail() throws IOException, InterruptedException {
		try {
			MyScreenRecorder.startRecording("navigation_FeatureTest");
		} catch (Exception e) {
			e.printStackTrace();
		}

		log.info("login with the sender\n");
		// login to sender email then Tab Compose
		login.gmailLogin(config.getreciever(), config.getpasswotd());
		action.rightMenu(perform.Archive);
		try {
			MyScreenRecorder.stopRecording();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/*
	 * Test case 2 1. login to Gmail -- Receiver user2. search for the Email with
	 * specific title 3. logout
	 */
	 @Ignore("Im Not Ready")
	@Test
	public void SecondCheckReceiver() throws IOException, InterruptedException {
		log.info("login with the sender\n");
		// login with receiver
		logMeIn(config.getreciever(), config.getpasswotd());
		logMeOut();
		// Open the received email
		// searchEmail();
		log.info("verify the email \n");
		// emailContent();

	}

	@Before
	public void beforeMethod() throws IOException {
		System.out.println("New driver instantiated \n");

		driver = initializeDriver();
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(config.getimplicitlyWait()), TimeUnit.SECONDS);
		System.out.println("Type URL\n");
		driver.navigate().to(config.geturl());

	}

	// @After
	public void afterMethod() {
		driver.quit();
		driver = null;
	}


}
