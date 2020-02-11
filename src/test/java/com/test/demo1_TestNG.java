package com.test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class demo1_TestNG {

@Test
public void g()
{
	System.out.println("this is test2");
}
	
@Test
public void f()
{
	System.out.println("this is test");
}
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("this is before method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("this is after method");
  }



  @BeforeClass
  public void beforeClass() {
	 System.out.println(" this is before class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("this is after class");
  }

  @BeforeTest
  public void beforeTest() {
  System.out.println("this is before test");
  }
  

  @AfterTest
  public void afterTest() {
	  System.out.println("this is after test");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("this is before suite");
  }
  

  @AfterSuite
  public void afterSuite() {
	  System.out.println("this is after suite");
  }

}
