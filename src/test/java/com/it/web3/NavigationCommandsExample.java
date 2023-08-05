package com.it.web3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class NavigationCommandsExample extends BaseDriver {

	String url = "https://www.daraz.com.bd/";

	@Test
	public void navigateTest() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get(url);

		WebElement signup = driver.findElement(By.xpath("//a[contains(text(),'Signup / Login')]"));
		signup.click();
		Thread.sleep(1000);

		driver.navigate().back();
		Thread.sleep(1000);

		driver.navigate().forward();
		Thread.sleep(1000);

		driver.navigate().refresh();
		Thread.sleep(1000);
	}

}
