package com.WebDriverdemos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D24HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://demoqa.com/alerts");
		
		Alert alt;
		JavascriptExecutor js = (JavascriptExecutor) driver;

		//driver.findElement(By.id("alertButton")).click();
		js.executeScript("arguments[0].click()", driver.findElement(By.id("alertButton")));
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		js.executeScript("arguments[0].click()",  driver.findElement(By.id("timerAlertButton")));
		Thread.sleep(6000);
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.accept();
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("confirmButton")));
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		alt.dismiss();   //It will click on cancel
		System.out.println(driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[2]/div[3]/div[1]/span[2]")).getText());
		
		js.executeScript("arguments[0].click()", driver.findElement(By.id("promtButton")));
		alt = driver.switchTo().alert();
		alt.sendKeys("Pratyush Mishra");
		alt.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		
		driver.close();
		

	}

}
