package com.TestNGdemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D04Before_Aftermethod {
  WebDriver driver;
	
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("\tBeforeMethod");
  }

  @AfterMethod
  public void printtitle() {
	  System.out.println("\t\tTitle: " + driver.getTitle());
	  System.out.println("\tAfterMethod");
  }
  
	
  @BeforeTest
  public void openbrowser() {
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }
  @AfterTest
  public void closebrowser() {
	  driver.close();
  }
  @Test(priority = 3)
  public void openMyntra() {
		
		driver.get("https://www.myntra.com/");
		
	}
	@Test(priority = 2)
	public void openBewakoof() {
		
		driver.get("https://www.bewakoof.com/");
		
	}
	@Test (priority = 1)
	public void openZepto() {
		
		driver.get("https://www.zeptonow.com/");
	
	}
	@Test(priority = 4)
	public void openMeesho() {
		
		driver.get("https://www.meesho.com/");

	}

}
