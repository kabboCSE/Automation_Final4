package com.it.web3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LocatorsExample extends BaseDriver {

	@Test
	public void testLocators() throws InterruptedException {

		driver.manage().window().maximize();
		driver.get("https://www.shohoz.com/launch/");
		Thread.sleep(1000);

		// webElement is datatype

//		WebElement bus = driver.findElement(By.id("purpose"));
//		bus.click();
//		Thread.sleep(5000);

		// By Name
//		WebElement bus = driver.findElement(By.name("purpose"));
//		bus.click();
//		Thread.sleep(5000);
//		

		// By LinkText
//		WebElement train = driver.findElement(By.linkText("Train"));
//		train.click();
//		Thread.sleep(3000);

		// By Partial LinkText
//		WebElement train = driver.findElement(By.partialLinkText("Trai"));
//		train.click();
//		Thread.sleep(3000);

		// By Button
//		WebElement send = driver.findElement(By.className("btn"));
//		send.click();
//		Thread.sleep(3000);

		// Custom
		// tagname[@attribute='value']

		/*
		 * tagname[contains(text(),'text']
		 */
//		WebElement msg = driver.findElement(By.xpath("//input[@type='text']"));
//		msg.sendKeys("Shahriar Kabbo");
//		Thread.sleep(3000);

//		WebElement msg = driver.findElement(By.xpath("//body/div[@id='main_wrapper']/section[@id='content']/div[@id='search_sec']/div[2]/div[1]/form[1]/ul[1]/div[6]/div[1]/button[1]"));
//		msg.click();
//		Thread.sleep(3000);

		// css -> elementName[attributeName='attributeValue']
		WebElement name = driver.findElement(By.cssSelector("input[id='dest_to']"));
		name.sendKeys("Mamun");
		Thread.sleep(1000);

	}
}
