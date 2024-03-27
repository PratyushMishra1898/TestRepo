package com.WebDriverdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D08LocatebyClassName {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");
		
		WebElement searchbox = driver.findElement(By.className("gLFyf"));
		searchbox.sendKeys("Ebullient Securities");
		searchbox.sendKeys(Keys.ENTER);
		

	}

}
