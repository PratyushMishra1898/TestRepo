package com.WebDriverdemos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class D20Synchronisation_Implicitwait {

	public static void main(String[] args) {
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver(op);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.redbus.in/");
		
		//Source
		driver.findElement(By.id("src")).sendKeys("Kolh");
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[1]/div/div[1]/ul/li[1]/div/text")).click();
		
		//Target
		driver.findElement(By.id("dest")).sendKeys("Ban");
		driver.findElement(By.xpath("//*[@id=\"autoSuggestContainer\"]/div/div[3]/div[1]/ul/li[1]/div/text")).click();
		
		//Calender
		driver.findElement(By.xpath("//*[@id=\"onwardCal\"]/div/i")).click();
		//Date
		driver.findElement(By.xpath("/html[1]/body[1]/section[1]/div[2]/main[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/div[2]/div[1]/div[1]/div[3]/div[6]/span[1]/div[7]/span[1]")).click();
		
		//Search Bus
		driver.findElement(By.id("search_button")).click();
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"8331995\"]/div/div[1]/div[1]/div[1]/div[1]")).getText());
		
		driver.close();

	}

}
