package com.TestNGdemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D03BeforeAfterTest2 {
	WebDriver driver;
	
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
			System.out.println("Title: " + driver.getTitle());
			
		}
		@Test(priority = 2)
		public void openBewakoof() {
			
			driver.get("https://www.bewakoof.com/");
			System.out.println("Title: " + driver.getTitle());
			
		}
		@Test (priority = 1)
		public void openZepto() {
			
			driver.get("https://www.zeptonow.com/");
			System.out.println("Title: " + driver.getTitle());
		
		}
		@Test(priority = 4)
		public void openMeesho() {
			
			driver.get("https://www.meesho.com/");
			System.out.println("Title: " + driver.getTitle());
		}
}
