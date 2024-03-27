package com.WebDriverdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class D06LocateByName {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailId = driver.findElement(By.name("email"));
		//Read/Find the control whose name is "email" and store it in emailId object
		emailId.sendKeys("ankushvankore@gmail.com");
		WebElement password = driver.findElement(By.name("pass"));
		password.sendKeys("12345678");
		WebElement loginBtn = driver.findElement(By.name("login"));
		loginBtn.click();

	}

}
