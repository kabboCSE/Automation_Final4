package com.it.web3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class BrowserCommandsExample extends BaseDriver {

	String url = "https://www.daraz.com.bd/";

	@Test
	public void browserCommandTest() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get(url);

		System.out.println(driver.getTitle());

		WebElement signup = driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]"));
		signup.click();
		Thread.sleep(1000);

		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
