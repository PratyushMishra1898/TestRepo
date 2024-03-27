package com.WebDriverdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D1301LocatebyAbsoluteXpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		//Absolute X Path
		WebElement mail = driver.findElement(By.xpath("html/body/div/div/div/div/div/div/div[2]/div/div/form/div/div/input"));
		mail.sendKeys("Pratyush@gmail.com");
		//Relative X Path
		WebElement pass = driver.findElement(By.xpath("//form[@class=\"_9vtf\"]/div/div[2]/div/input"));
		pass.sendKeys("123");
		
		WebElement loginbtn = driver.findElement(By.xpath("//button[@name=\"login\"]"));
		loginbtn.click();
		
		//driver.close();
			

	}

}
