package com.it.web3;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AlertHandle extends BaseDriver {

	String url = "https://demoqa.com/alerts";

	@Test
	public void alertTest() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get(url);

		//// button[@id='alertButton']

		WebElement alertButton = driver.findElement(By.xpath("//button[@id='confirmButton']"));
		alertButton.click();
		Thread.sleep(2000);

		// Alert Confirm
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);

		/*
		 * //Alert Dismiss Alert alert = driver.switchTo().alert(); alert.dismiss();
		 * Thread.sleep(2000);
		 * 
		 */

		//// span[@id='confirmResult']

		WebElement confirmResult = driver.findElement(By.xpath("//span[@id='confirmResult']"));
		System.out.println("The alert message is : " + confirmResult.getText());

	}
}
