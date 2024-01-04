package com.qa.selection04;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testFormSanity {
	@BeforeSuite
	public void BeforeTestTeraDow() {
		System.out.println("Before Test TeraDow");
	}
	@AfterSuite
	public void AfterTestTeraDow() {
		System.out.println("After Test TeraDow");
	}
	@BeforeTest
	public void BegoreTestSetup() {
		System.out.println("Before Test Executed");
	}
	@AfterTest
	public void AfterTestTeardown() {
		System.out.println("After Test Executed");
	}
	@BeforeClass
	public void BeforeClassSetup() {
		System.out.println("Before Class Executed");
	}
	@AfterClass
	public void AfterClassSetup() {
		System.out.println("After class Excecuted");
	}
	@BeforeMethod
	public void setup() {
		System.out.println("Before Method Excuted");
	}
	@AfterMethod
	public void tearDown() {
		System.out.println("After Method Excuted");
	}
	@Test
	public void test1() {
		System.out.println("Test1 Excuted");
	}
	@Test 
	public void test2() {
		System.out.println("Test2 Excuted");
	}
	@Test
	public void test3() {
		System.out.println("Test3 Excuted");
	}
}


