package com.WebDriverdemos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D25HandlingMultipleWindows {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.online.citibank.co.in/");
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/div[1]/a[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"loginId\"]/img")).click();
		
		System.out.println(driver.getTitle());
		
		//driver.switchTo().window();
		
		Set<String>windows = driver.getWindowHandles();
		
		System.out.println(windows);
		
		Iterator<String>itr = windows.iterator();
		String win1 = itr.next();
		String win2 = itr.next();
		
		driver.switchTo().window(win2);
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("User_Id")).sendKeys("1234567");
		Thread.sleep(3000);
		driver.switchTo().window(win1);
		driver.findElement(By.xpath("//*[@id=\"applylist\"]/span")).click();
		Thread.sleep(3000);
		
		//driver.close(); It will only close the current window
		driver.quit(); //It will close all the windows opened by selenium
		
		

	}

}
