package com.it.web3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseHoverHandling extends BaseDriver {

	String url = "https://www.daraz.com.bd/";

	@Test
	public void mouseHoverTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);

		Actions action = new Actions(driver);

		WebElement homeAndLifestyle = driver.findElement(By.xpath("//span[contains(text(),'Home & Lifestyle')]"));
		action.moveToElement(homeAndLifestyle).perform();
		Thread.sleep(3000);

		WebElement cleaning = driver.findElement(By.xpath(
				"//body/div[@id='J_7459419030']/div[@id='J_LzdSiteNav']/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/ul[10]/li[4]/a[1]/span[1]"));
		action.moveToElement(cleaning).perform();
		Thread.sleep(3000);

		WebElement gloves = driver.findElement(By.xpath("//span[contains(text(),'Cleaning Gloves')]"));
		gloves.click();
		Thread.sleep(3000);

		// 01.24.40

	}
}
