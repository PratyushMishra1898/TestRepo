package com.WebDriverdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D09LocatebyCSSselector {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		WebElement emailId = driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']"));
		emailId.sendKeys("test@gmail.com");
		WebElement password =driver.findElement(By.cssSelector("input[data-testid=\"royal_pass\"]"));
		password.sendKeys("12345678");
		WebElement loginBtn = driver.findElement(By.cssSelector("button[class=\"_42ft _4jy0 _6lth _4jy6 _4jy1 selected _51sy\"]"));
		loginBtn.click();

	}

}
