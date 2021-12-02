package com.testNG;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class Parameterization {
@Test
@Parameters("Company")
public void parameterTest(String Company) 
{
	System.out.println("your company name is:  " + Company);
}

}
