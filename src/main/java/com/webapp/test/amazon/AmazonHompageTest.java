package com.webapp.test.amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonHompageTest {
	
	public static void main(String[] args) {
		// step1: formulate a test url & driver path
		String siteUrl = "https://www.amazon.in/";
		String driverPath = "drivers/chromedriver";

		// step2: set selenium system properties
		System.setProperty("webdriver.chrome.driver", driverPath);

		// step3: instantiate selenium web-driver
		WebDriver driver = new ChromeDriver();

		// step4: launch browser
		driver.get(siteUrl);

		// step5: evaluate test
		String expectedTitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		String actualTitle = driver.getTitle();
		if (expectedTitle.equals(actualTitle)) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}
		System.out.println("Expected Title : " + expectedTitle);
		System.out.println("Actual Title : " + actualTitle);

		// step6: close driver
		driver.close();
	}
}
