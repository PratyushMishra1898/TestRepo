package com.TestNGdemos;

import org.testng.annotations.Test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D06DatadrivenTesting {
	
  WebDriver driver;
  String expurl = "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index", acturl;
  
  @Test(dataProvider = "getlogindata")
  public void logintoOHRM(String usern, String pass) {
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(usern);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(pass);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  acturl = driver.getCurrentUrl();
	  
	  //Assert.assertEquals(acturl, expurl);
	  //Assert.assertTrue(acturl.equals(expurl));
	  Assert.assertTrue(acturl.contains("dashboard"));
  }

  @DataProvider
  public Object[][] getlogindata() {
    return new Object[][] {
      new Object[] { "admin", "admin123" },
      new Object[] { "pratyush", "pratyush123" },
      new Object[] { "Admin", "admin123" },
      new Object[] { "Nilesh", "nilesh123" },
    };
    /*
    String[][]data = {{ "admin", "admin123" },{ "pratyush", "pratyush123" },{ "Admin", "admin123" }};
    return data;
    */
    
  }
  @AfterMethod
  public void afterMethod() {
	  if(acturl.equals(expurl))
	  {
	    driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	    driver.findElement(By.linkText("Logout")).click();
	  }
	  else
	  {
		  System.out.println(driver.findElement(By.xpath("//p[@class='oxd-text oxd-text--p oxd-alert-content-text']")).getText());
	  }
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
