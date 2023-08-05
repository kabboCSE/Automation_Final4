package com.it.web3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class IFrameHandling extends BaseDriver {

	String url = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";

	@Test
	public void testiframe() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);

		// Counting IFrame
		int iframeNumber = driver.findElements(By.tagName("iframe")).size();
		System.out.println("The no. of iframe is : " + iframeNumber);

		// driver.switchTo().frame("here contains framename where is located in webpage
		// frame section");
		driver.switchTo().frame("packageListFrame");

		WebElement selenium = driver.findElement(By.xpath("//body/main[1]/ul[1]/li[1]/a[1]"));
		selenium.click();
		Thread.sleep(2000);

		// For Switching one frame to another
		driver.switchTo().defaultContent();

		driver.switchTo().frame("packageFrame");
		WebElement selenium2 = driver.findElement(By.xpath("//span[contains(text(),'HasAuthentication')]"));
		selenium2.click();
		Thread.sleep(4000);

		driver.switchTo().defaultContent();
		driver.switchTo().frame("classFrame");
		WebElement selenium3 = driver
				.findElement(By.xpath("//body[1]/main[1]/div[2]/div[1]/ul[1]/li[1]/dl[2]/dd[1]/a[1]/code[1]"));
		selenium3.click();
		Thread.sleep(2000);

		driver.switchTo().defaultContent();

	}
}
