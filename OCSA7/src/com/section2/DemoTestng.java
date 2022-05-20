package com.section2;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class DemoTestng {
	@Test
	public void createCustomer()
	{
		System.out.println("customer created");
	}
	@Test
	public void modifyCustomer()
	{
		System.out.println("customer modified");
	}
	@Test
	public void deleteCustomer()
	{
		System.out.println("customer deleted");
	}
}
