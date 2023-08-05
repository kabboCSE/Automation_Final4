package com.it.web3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CopyAndPasteHandling extends BaseDriver {
	String url = "https://demoqa.com/automation-practice-form";

	@Test
	public void webElementsTest() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get(url);

		Actions action = new Actions(driver);

		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("shahriar");
		Thread.sleep(1000);

		// All Select
		action.keyDown(Keys.CONTROL);
		action.sendKeys("a");
		action.keyUp(Keys.CONTROL);
		action.build().perform();

		// Copy
		action.keyDown(Keys.CONTROL);
		action.sendKeys("c");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);

		WebElement sub = driver.findElement(By.xpath(
				"//body/div[@id='app']/div[1]/div[1]/div[2]/div[2]/div[2]/form[1]/div[6]/div[2]/div[1]/div[1]/div[1]"));
		sub.click();
		Thread.sleep(1000);
		// Tab
//		action.keyDown(Keys.TAB);
//		action.build().perform();

		// Paste
		action.keyDown(Keys.CONTROL);
		action.sendKeys("v");
		action.keyUp(Keys.CONTROL);
		action.build().perform();
		Thread.sleep(3000);

	}
}
