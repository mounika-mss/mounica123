package com.base.generic;

import org.junit.AfterClass;

import org.junit.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass2 
{
	@BeforeSuite
	public void configureBeforeSuite()
	{
		System.out.println("connect to the database");
		
	}
	@BeforeTest
	public void configureBeforeTest()
	{
		System.out.println("execute the script in the parallel mode");
	}
	@BeforeClass
	public void configureBeforeClass()
	{
		System.out.println("lauching the browser");
	}
	@BeforeMethod
	public  void configureBeforeMethod()
	{
		System.out.println("login to the application");
	}
	@AfterMethod
	public void configureAfterMethod()
	{
		System.out.println("logout to the application");
	}
	@AfterClass
	public void configureAfterClass()
	{
		System.out.println("close the browser");
	}
	@AfterTest
	public void configureAfterTest()
	{
		System.out.println("close the parallel mode");
	}
	@AfterSuite
	public void configureAfterSuite()
	{
		System.out.println("close database connection");
	}


	
}
