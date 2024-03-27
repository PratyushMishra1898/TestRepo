package com.TestNGdemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class D14Amazon_POM_Clientcode {
	
	WebDriver driver;
	D14Amazon_POM_MainCode m1;
	String acturl = "https://www.amazon.in/ap/signin";
	
	@Test
	public void login() throws InterruptedException {
		m1.addMobileNumber("9453930432");
		m1.clickoncontinue();
		
		//currenturl = driver.getCurrentUrl();
		
		Thread.sleep(3000);
		if(driver.getCurrentUrl().equals(acturl)) 
		{
			 m1.showMessage();
			 driver.close();
		}
		else
		{
		 
		  m1.addPassword("Password123");
		  m1.clickLogin();
		}
	}

	@AfterMethod
	public void logout() {
		m1.logout();
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		
		m1 = new D14Amazon_POM_MainCode(driver);
		
		m1.findloginwindow();
		
		
	}

	@AfterTest
	public void afterTest() {
		driver.close();
	}
}
