package com.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D04RedBusAssignment {

	public static void main(String[] args) throws InterruptedException {
		  
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("kolh");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();
		
		driver.findElement(By.id("dest")).sendKeys("ban");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text")).click();
		
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/span[1]/div[7]/span[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"search_button\"]")).click();
		Thread.sleep(5000);
		System.out.println(driver.findElement(By.xpath("//*[@id=\"8331995\"]/div/div[1]/div[1]/div[1]/div[1]")).getText());
		
		driver.close();

	}

}
