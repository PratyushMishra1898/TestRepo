package com.WebDriverdemos;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class D29MouseClicks {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		
		Actions act = new Actions(driver);
		Alert alt;
		
		WebElement dblClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/button"));
		act.moveToElement(dblClick).doubleClick().perform();
		//act.doubleClick(dblClick).perform();
		
		alt = driver.switchTo().alert();
		System.out.println(alt.getText());
		Thread.sleep(2000);
		alt.accept();
		
		WebElement rhtClick = driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		//act.moveToElement(rhtClick).contextClick().perform();
		act.contextClick(rhtClick).perform();
		List<WebElement>rows = driver.findElements(By.xpath("//*[@id=\"authentication\"]/ul/li"));
		
		for(WebElement r : rows)
			System.out.println(r.getText());
		
		//act.moveToElement(rhtClick).click().perform();  //Left Click
		
		driver.close();
		

	}

}
