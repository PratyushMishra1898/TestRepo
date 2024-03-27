package com.WebDriverdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D17HandlingRadiobutton {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement GenderF = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[24]/td[3]/input[2]"));
		
		System.out.println("Selected: " + GenderF.isSelected());
		
		GenderF.click();
		
		System.out.println("Selected: " + GenderF.isSelected());
		

	}

}
