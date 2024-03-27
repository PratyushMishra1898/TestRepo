package com.WebDriverdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class D16Handlingcheckbox {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement chkbox = driver.findElement(By.cssSelector("input[name^=\"chk_alte\"]"));
		
		System.out.println("Before Clicking:");
		
		System.out.println("Selected: " + chkbox.isSelected());
		System.out.println("Visible : " + chkbox.isDisplayed());
		System.out.println("Enabled : " + chkbox.isEnabled());
		
		if(chkbox.isSelected() == false)
			chkbox.click();
		
		System.out.println("After Clicking:");
		
		System.out.println("Selected: " + chkbox.isSelected());
		System.out.println("Visible : " + chkbox.isDisplayed());
		System.out.println("Enabled : " + chkbox.isEnabled());
		
		//driver.close();
		}

}
