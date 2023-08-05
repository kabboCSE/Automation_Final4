package com.it.web3;

import org.openqa.selenium.WindowType;

import org.testng.annotations.Test;

public class TabHandling extends BaseDriver {

	String url1 = "https://demoqa.com/frames";
//	String url2 = "https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html";
	String url2 = "https://www.youtube.com/";

	@Test
	public void TabTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url1);
		String orginalTab = driver.getWindowHandle();
		Thread.sleep(3000);

		// driver.switchTo().newWindow (WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.WINDOW);
		String secondWindow = driver.getWindowHandle();
		driver.get(url2);
		Thread.sleep(3000);

		driver.switchTo().window(orginalTab);
		Thread.sleep(3000);

		driver.switchTo().window(secondWindow);
		Thread.sleep(3000);
		Thread.sleep(3000);

	}
}
