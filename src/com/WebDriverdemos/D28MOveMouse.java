package com.WebDriverdemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D28MOveMouse {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://istqb.in/");
		
		Actions act = new Actions(driver);
		
		WebElement spmenu = driver.findElement(By.linkText("SPECIALIST"));
		act.moveToElement(spmenu).perform();
		
		//act.moveToElement(driver.findElement(By.linkText("SPECIALIST"))).perform();
		
		//Assignment - To print all menus of specialist
		List<WebElement>menus = driver.findElements(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[6]/div/div/ul/li"));
		
		for(WebElement m : menus)
			System.out.println(m.getText());

	}

}
