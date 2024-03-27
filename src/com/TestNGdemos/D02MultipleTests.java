package com.TestNGdemos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class D02MultipleTests {
        
		public void openMyntra() {
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.myntra.com/");
			
			System.out.println("Title: " + driver.getTitle());
			
			driver.close();
		}
		@Test(priority = 2)
		public void openBewakoof() {
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.bewakoof.com/");
			
			System.out.println("Title: " + driver.getTitle());
			
			driver.close();
		}
		@Test (priority = 1)
		public void openZepto() {
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.zeptonow.com/");
			
			System.out.println("Title: " + driver.getTitle());
			
			driver.close();
		}
		@Test(priority = 4)
		public void openMeesho() {
			WebDriver driver = new ChromeDriver();
			//driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			
			driver.get("https://www.meesho.com/");
			
			System.out.println("Title: " + driver.getTitle());
			
			driver.close();  
	  
  }
}
