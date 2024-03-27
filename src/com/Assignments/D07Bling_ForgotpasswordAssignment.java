package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D07Bling_ForgotpasswordAssignment {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://dash.bling-center.com/platform/signIn.html");
		
		driver.findElement(By.className("forget-password-btn")).click();
		
		driver.findElement(By.id("email1")).sendKeys("pratyush@gmail.com");
		
		driver.findElement(By.className("reset-pwd")).click();
		//After this line, we need to wait for extra time to get the required text visible
		Thread.sleep(8000);
		WebElement title = driver.findElement(By.cssSelector("p[id='resetsuccess']"));
		
		System.out.println("Text is: " + title.getText());
	
		driver.close();
		


	}

}
