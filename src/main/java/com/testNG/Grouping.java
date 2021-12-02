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

public class Grouping 
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
	@Test(groups="college")
	public void test15() 
	{
	System.out.println("Sai college");
	}
	@Test(groups="college")
	public void test5() 
	{
	System.out.println("ABC college");
	}
	@Test(groups="school")
	public void test10() 
	{
	System.out.println("ABD school");
	}
	@Test(groups="school")
	public void test20() 
	{
	System.out.println("ABDE school");
	}
	@Test(groups={"school", "college"})
	public void test22() 
	{
	System.out.println("ABDE school and college");
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