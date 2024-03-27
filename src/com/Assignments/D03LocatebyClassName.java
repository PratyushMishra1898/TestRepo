package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D03LocatebyClassName {

	public static void main(String[] args) {
		
		String expectedmessage = "Invalid Username/Password";
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echotrak.com/Login.aspx?ReturnUrl=%2f");
		
		//WebElement emailid = driver.findElement(By.className("form-control"));
		//emailid.sendKeys("Pratyush@gmail.com");
		driver.findElement(By.className("form-control")).sendKeys("Pratyush@gmail.com"); // This shortcut will only work where we want to perform single operation on the webelement
		
		//WebElement password = driver.findElement(By.className("form-control"));//This will not work
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("Test1234");
		WebElement loginbtn = driver.findElement(By.className("btn"));
		loginbtn.click();
		
		//System.out.println(driver.findElement(By.id("lblMsg")).getText());
		
		WebElement errormessage = driver.findElement(By.id("lblMsg"));
		String msg = errormessage.getText();  // Return the text on the webelement/control
		
		System.out.println("Error Message is: " + msg);
		
		if(msg.equals(expectedmessage))
			System.out.println("Correct Message\nTest Case pass");
		else
			System.out.println("Wrong message\nTest case fails");
		
		driver.close();
	}

}
