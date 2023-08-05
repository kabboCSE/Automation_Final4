package com.it.web3;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ScrollHandling extends BaseDriver {

	String url = "https://www.amazon.com/";

	@Test
	public void scrollTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);

		// Scroll Down - Bottom
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);

		// Scroll Up- Top
		js.executeScript("window.scrollTo(0,0)");
		Thread.sleep(2000);

		// Scroll Specific Location
		WebElement location1 = driver.findElement(By.xpath("//h2[contains(text(),'Deals Under $25')]"));
		js.executeScript("arguments[0].scrollIntoView()", location1);
		Thread.sleep(3000);

	}
}
