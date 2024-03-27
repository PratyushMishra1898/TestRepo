package com.Assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class D08OHRM_login_logout {
	
	WebDriver driver;
	
  @Test
  public void login() {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
  }
  @AfterMethod()
  public void aftermethod() {
	  driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	  driver.findElement(By.linkText("Logout")).click();
	  
  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
      driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
