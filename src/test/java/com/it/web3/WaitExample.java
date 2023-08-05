package com.it.web3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WaitExample extends BaseDriver {

	String url = "https://www.selenium.dev/";

	@Test
	public void testWaits() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);
		// Implicit wait
//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// explicit wait
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
//		WebElement blog =  (WebElement) wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//header/nav[1]/div[1]/ul[1]/li[8]/div[1]/a[1]")));
//		blog.click();
//		Thread.sleep(2000);
//		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		WebElement blog = (WebElement) wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("//h2[contains(text(),'Getting Started')]")));
		blog.click();
		Thread.sleep(2000);

	}
}
