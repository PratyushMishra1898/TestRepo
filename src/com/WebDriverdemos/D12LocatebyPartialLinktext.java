package com.WebDriverdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D12LocatebyPartialLinktext {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.co.in/");	
		
		//WebElement adLink = driver.findElement(By.partialLinkText("Ad"));
		WebElement adLink = driver.findElement(By.partialLinkText("ert"));
		adLink.click();

	}

}
