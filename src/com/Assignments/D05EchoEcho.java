package com.Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D05EchoEcho {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://echoecho.com/");
		
		//driver.findElement(By.xpath("/html/body/div[2]/table[7]/tbody/tr/td[4]/table/tbody/tr/td[1]/table[2]/tbody/tr[1]/td[2]/big/a")).click();
		driver.findElement(By.linkText("Tutorials")).click();
		
		//driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[6]/table/tbody/tr/td/div[2]/table/tbody/tr[6]/td/a")).click();
		driver.findElement(By.linkText("HTML")).click();
		
		//driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[6]/table/tbody/tr/td/div[1]/table/tbody/tr[9]/td/a")).click();
		driver.findElement(By.linkText("HTML FORMS")).click();
		
		//driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[6]/table/tbody/tr/td/div[1]/table/tbody/tr[10]/td/a")).click();
		driver.findElement(By.linkText("���CHECK BOX")).click();
		
		WebElement Milk = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[1]"));
		
		WebElement Butter = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[2]"));
		
		WebElement Cheese = driver.findElement(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input[3]"));
		
		
		//if(Milk.isSelected() == false)
			Milk.click();
		
		//if(Butter.isSelected() == false)
		//	Butter.click();
		
		//if(Cheese.isSelected() == false)
			Cheese.click();
			
		List<WebElement>products = driver.findElements(By.xpath("/html/body/div[2]/table[9]/tbody/tr/td[4]/table/tbody/tr/td/div/span/form/table[3]/tbody/tr/td/table/tbody/tr/td/input"));
		
		for(WebElement p : products)
		{
			System.out.println(p.getAttribute("value") + "selected: " + p.isSelected());
			System.out.println(p.getAttribute("value") + "Visisble: " + p.isDisplayed());
			System.out.println(p.getAttribute("value") +"Enabled: " + p.isEnabled());
			
			if(!p.isSelected())
				p.click();
			
			System.out.println(p.getAttribute("value") + "selected: " + p.isSelected());
			System.out.println(p.getAttribute("value") + "Visisble: " + p.isDisplayed());
			System.out.println(p.getAttribute("value") +"Enabled: " + p.isEnabled());
		}

	}

}
