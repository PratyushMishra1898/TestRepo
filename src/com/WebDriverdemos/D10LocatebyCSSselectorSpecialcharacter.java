package com.WebDriverdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D10LocatebyCSSselectorSpecialcharacter {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		// * => Contains
		WebElement emailId = driver.findElement(By.cssSelector("input[data-testid*=\"al_em\"]"));
		emailId.sendKeys("test@gmail.com");
		// $ => Ends With
		WebElement password =driver.findElement(By.cssSelector("input[placeholder$=\"word\"]"));
		password.sendKeys("12345678");
		// ^ => Starts with
		WebElement loginBtn = driver.findElement(By.cssSelector("button[id^=\"u_0_5_\"]"));
		loginBtn.click();

	}

}
