package com.it.web3;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGExample {

	@AfterSuite
	public void aftersuit() {
		System.out.println("This is after suite");
	}

	@BeforeSuite
	public void beforesuit() {
		System.out.println("This is beofre suite");
	}

	@Test(priority = 1)
	public void secondTest() {
		System.out.println("This is Second Test");
	}

	@Test(priority = 0)
	public void firstTest() {
		System.out.println("This is First Test");
	}

	@BeforeTest
	public void beforetest() {
		System.out.println("This is beofre test");
	}

	@AfterTest
	public void aftertest() {
		System.out.println("This is after test");

	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("This is before class");
	}

	@AfterClass
	public void afterclass() {
		System.out.println("This is after class");
	}

	@BeforeMethod
	public void beforeMethodTest() {
		System.out.println("This is before method");
	}

	@AfterMethod
	public void afterMethodTest() {
		System.out.println("This is after method");
	}

}
