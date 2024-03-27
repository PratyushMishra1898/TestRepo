package com.TestNGdemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D05AmazonTest {
	 WebDriver driver;
	
	  @BeforeMethod(alwaysRun = true)
	  public void openamazon() {
		  driver.get("https://www.amazon.in/");
		  System.out.println("Title is: " + driver.getTitle());
	  }

	  @AfterMethod(alwaysRun = true)
	  public void printtitle() {
		  System.out.println("Title is: " + driver.getTitle());
	  }
	  
		
	  @BeforeTest(alwaysRun = true)
	  public void openbrowser() {
		  driver = new ChromeDriver();
	      driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  }
	  @AfterTest(alwaysRun = true)
	  public void closebrowser() {
		  driver.close();
	  }
	    @Test(priority = 1, groups = "FirstGroup") //(priority = 1, enabled = false)
	    public void clickbestsellers() {
			
			driver.findElement(By.xpath("//a[contains(@href,'/gp/bestsellers/?ref_=nav_cs_bestsellers')]")).click();
			
		}
		@Test(priority = 2, groups = "Gadgets")
		public void clickmobiles() {
			
			driver.findElement(By.xpath("//a[normalize-space()='Mobiles']")).click();
			
		}
		@Test (priority = 3, groups = "Gadgets")
		public void clickTodaysdeals() {
			
			driver.findElement(By.xpath("//a[@href='/deals?ref_=nav_cs_gb']")).click();
		
		}
		@Test(priority = 4, groups = "Gadgets")
		public void clickelectronics() {
			
			driver.findElement(By.xpath("//a[normalize-space()='Electronics']")).click();

		}
}
