package com.testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationsJava
{
	@BeforeSuite
	public void test1() 
	{
	System.out.println("code of BeforeSuite");
	}
	@BeforeTest
	public void test2()
	{
	System.out.println("code of BeforeTest");
	}
	@BeforeClass
	public void test3() 
	{
	System.out.println("code of BeforeClass");
	}
	@BeforeMethod
	public void test4() 
	{
	System.out.println("code of BeforeMethod");
	}
	
	
	@Test()
	public void sample() 
	{
	System.out.println("code of Test");
	}
	
	@Test()
	public void sample1() 
	{
	System.out.println("code of Test");
	}
	
	@AfterSuite
	public void test6() 
	{
	System.out.println("code of AfterSuite");
	}
	@AfterTest
	public void test7() 
	{
	System.out.println("code of AfterTest");
	}
	@AfterClass
	public void test8() 
	{
	System.out.println("code of AfterClass");
	}
	@AfterMethod
	public void test9() 
	{
	System.out.println("code of AfterMethod");
	}
}