package com.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomepageSourceUrlTest {

	public static void main(String[] args) {
		// step1: formulate a test url & driver path
		String siteUrl = "https://www.google.com/";
		String driverPath = "drivers/chromedriver";

		// step2: set selenium system properties
		System.setProperty("webdriver.chrome.driver", driverPath);

		// step3: instantiate selenium web-driver
		WebDriver driver = new ChromeDriver();

		// step4: launch browser
		driver.get(siteUrl);

		if(siteUrl.equals(driver.getCurrentUrl())) {
			System.out.println("Test is Passed !");
		} else {
			System.out.println("Test is Failed !");
		}
		System.out.println("Expected Url : " + siteUrl);
		System.out.println("Actual Url : " + driver.getCurrentUrl());
		
		// step6: close driver
		driver.close();
	}

}
