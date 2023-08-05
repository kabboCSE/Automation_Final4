package com.it.web3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SelectMethodHandling extends BaseDriver {

	String url = "https://www.amazon.com/";

	@Test
	public void SelectTest() throws InterruptedException {
		driver.manage().window().maximize();
		driver.get(url);

		WebElement menuoption = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));

		// selectByIndex -- Dropdown
		Select select = new Select(menuoption);
		select.selectByIndex(4);
		Thread.sleep(2000);

		// selectByValue
		select.selectByValue("search-alias=computers-intl-ship");
		Thread.sleep(2000);

		//
		select.selectByVisibleText("Luggage");
		Thread.sleep(2000);

	}
}
