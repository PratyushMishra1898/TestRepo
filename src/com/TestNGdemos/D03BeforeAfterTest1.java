package com.TestNGdemos;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03BeforeAfterTest1 {
	
  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }
  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
  }
	
  @Test
  public void test1() {
	  System.out.println("\tTest 1"); 
  }
  @Test
  public void test2() {
	  System.out.println("\tTest 2"); 
  }
  @Test
  public void test3() {
	  System.out.println("\tTest 3"); 
  }
  @Test
  public void test4() {
	  System.out.println("\tTest 4"); 
  }
}
