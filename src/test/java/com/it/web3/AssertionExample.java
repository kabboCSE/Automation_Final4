package com.it.web3;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionExample extends BaseDriver {

	String url = "https://www.selenium.dev/";

	@Test
	public void testAssertation() throws InterruptedException {
		driver.get(url);
		driver.manage().window().maximize();

		String expectedTitle = "Selenium1";
		String actualTitle = driver.getTitle();

		// Hard Assertion
//		Assert.assertEquals(actualTitle, expectedTitle);
//		System.out.println("passed");		
//		Thread.sleep(2000);

		// Soft Assertion
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(actualTitle, expectedTitle);
		System.out.println("passed");
		soft.assertAll();

	}
}
