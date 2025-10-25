package com.testng;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest2 {
	
	
	@Parameters("username")
	@Test(priority = 0,dependsOnMethods= {"atest"},groups= {"smoke1"},alwaysRun = true,invocationCount = 3)
	  public void ctest(String name) {
		  System.out.println("ctest");
		  System.out.println(name);
	  }
  @Test(priority=2)
  public void atest() {
	  System.out.println("atest");
  }
  
  @Test(priority=-1,dependsOnMethods= {"btest"})
  public void dtest() {
	  System.out.println("dtest");
  }
  @Test(priority=1,dependsOnGroups= {"smoke1"})
  public void btest() {
	  System.out.println("btest");
  }
}
