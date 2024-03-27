package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D01Echotrak_LocatebyName {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		WebElement username = driver.findElement(By.name("txtCustomerID"));
		//Read/Find the control whose name is "email" and store it in emailId object
		username.sendKeys("Pratyush@gmail.com");
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("56789");
		WebElement loginBtn = driver.findElement(By.name("Butsub"));
		loginBtn.click();

	}

}
