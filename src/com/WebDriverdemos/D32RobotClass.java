package com.WebDriverdemos;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D32RobotClass {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://sampleapp.tricentis.com/101/index.php");
		
		driver.findElement(By.partialLinkText("Auto")).click();
		driver.findElement(By.partialLinkText("Enter Insurant Data")).click();
		
		driver.findElement(By.name("Open")).click();
		
		Robot rbt = new Robot();
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		rbt.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(2000);
		
	}

}
