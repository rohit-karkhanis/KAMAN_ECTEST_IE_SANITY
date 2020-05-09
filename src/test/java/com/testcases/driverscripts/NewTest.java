package com.testcases.driverscripts;

import org.testng.annotations.Test;

import com.operations.Master_data;
import com.operations.Common.FireClass;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class NewTest {

	@Test
	public void f() {

		System.out.println("This is Test1 ....");
	}

	@Test
	public void f1() {


		System.out.println("This is Test2 ...." );

	}

	@Test
	public void f2() {

		System.out.println("This is Test3 ....");
	}


	@BeforeMethod
	public void beforeMethod() {

		System.out.println("This is beforeMethod ....");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is afterMethod ....");
	}

	@BeforeClass
	public void beforeClass() {

		System.out.println("This is beforeClass ....");
	}

	@AfterClass
	public void afterClass() {

		System.out.println("This is afterClass ....");
	}

	@BeforeTest
	public void beforeTest() {

		System.out.println("This is beforeTest ....");
	}

	@AfterTest
	public void afterTest() {

		System.out.println("This is afterTest ....");
	}


	@BeforeSuite
	public void beforeSuite() {

		System.out.println("This is beforeSuite ....");
	}

	@AfterSuite
	public void afterSuite() {

		System.out.println("This is afterSuite ....");
	}

}