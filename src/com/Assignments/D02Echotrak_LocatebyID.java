package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D02Echotrak_LocatebyID {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement emailid = driver.findElement(By.id("txtCustomerID"));
		emailid.sendKeys("Pratyush@gmail.com");
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("Test1234");
		WebElement loginbtn = driver.findElement(By.name("Butsub"));
		loginbtn.click();

	}

}
