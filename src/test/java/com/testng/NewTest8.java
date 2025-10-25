package com.testng;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest8 {
  @Test
  public void f() {
	  
	  String s = new String("Jaga");
	  String s1 = new String("Jaga");
	  
	  String s2 = "Jaga";
	  String s3 = "Jaga";
	  System.out.println(s==s1);
	  System.out.println(s2==s3);
	  
	  SoftAssert softassert = new SoftAssert();
	  softassert.assertEquals("jagapathi", "Jagapathi");
	  

	  

  }
}
