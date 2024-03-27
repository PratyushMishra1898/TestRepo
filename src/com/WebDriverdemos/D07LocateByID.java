package com.WebDriverdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07LocateByID {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailid = driver.findElement(By.id("email"));
		emailid.sendKeys("Pratyush@gmail.com");
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys("Test1234");
		//WebElement loginbtn = driver.findElement(By.id("u_0_5_Fs"));// This will throw exception as the id of login button has dynamic value
		WebElement loginbtn = driver.findElement(By.name("login"));
		loginbtn.click();
		
	}

}
