package com.test;

import org.testng.Assert;
import org.testng.annotations.Test;

public class demotest_2 {
  @Test(priority=1, enabled = true)
  public void Register () {
	  
	 System.out.println("Register here first");
  }
 
  @Test(priority =2)
  public void Login()
  {
	  System.out.println("Login here");
	  Assert.assertEquals(100, 100);
	  Assert.assertTrue(10>5);
	  Assert.assertFalse(5>10);
	  Assert.assertTrue("aravid".contains("aravind"));
  }
  @Test(priority=3)
  public void Logout()
  {
	  System.out.println("Logout");
  }
}
