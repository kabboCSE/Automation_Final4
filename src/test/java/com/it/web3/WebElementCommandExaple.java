package com.it.web3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WebElementCommandExaple extends BaseDriver {

	String url = "https://demoqa.com/automation-practice-form";

	@Test
	public void webElementsTest() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get(url);

		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys("shahriar");
		Thread.sleep(1000);

		WebElement lastname = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastname.sendKeys("kabbo");
		Thread.sleep(1000);

		WebElement email = driver.findElement(By.xpath("//input[@id='userEmail']"));
		System.out.println("Attribute value :" + email.getAttribute("placeholder"));
		Thread.sleep(1000);

		WebElement text = driver.findElement(By.xpath("//div[contains(text(),'Practice Form')]"));
		String formvalue = text.getText();
		System.out.println("Attribute value :" + formvalue);
		Thread.sleep(1000);

		// color:
		System.out.println("Text Color is : " + text.getCssValue("color"));

		if (email.isDisplayed()) {

			email.sendKeys("shahriarkabbo100@gmail.com");
			Thread.sleep(1000);
		} else {
			System.out.println("Not Found");
		}

		WebElement button = driver.findElement(By.xpath("//label[contains(text(),'Sports')]"));
		button.click();
		Thread.sleep(1000);

		WebElement musicbtn = driver.findElement(By.xpath("//label[contains(text(),'Music')]"));
		if (!musicbtn.isSelected()) {
			musicbtn.click();
			Thread.sleep(1000);
		} else {
			System.out.println("Music is already Selected");
		}

	}

}
