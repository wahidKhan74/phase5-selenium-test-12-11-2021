package com.webapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

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
		
		//find search box
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium documentations");
		searchBox.submit();
		
		// step5: evaluate test
		String expectedTitle = "selenium documentations - Google Search";
		String actualTitle= driver.getTitle();
		if(expectedTitle.equals(actualTitle)) {
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
