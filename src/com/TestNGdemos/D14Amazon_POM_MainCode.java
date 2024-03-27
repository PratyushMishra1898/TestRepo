package com.TestNGdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class D14Amazon_POM_MainCode {
	
	WebDriver main;
	
	public D14Amazon_POM_MainCode(WebDriver driver) {
		this.main = driver;
	}
	
	public void findloginwindow()
	{
        Actions act = new Actions(main);
		
		WebElement Loginmenu = main.findElement(By.partialLinkText("Hello,"));
		act.moveToElement(Loginmenu).perform();
		main.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']//span[@class='nav-action-inner'][normalize-space()='Sign in']")).click();
	}
	public void clickoncontinue()
	{
		main.findElement(By.xpath("//*[@id=\"continue\"]")).click();
	}
	public void addMobileNumber(String un)
	{
		main.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys(un);
	}
	public void addPassword(String ps)
	{
		main.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
	}
	public void clickLogin()
	{
		main.findElement(By.xpath("//button[@id='submit']")).click();
	}
	
	public void showMessage()
	{
		System.out.println(main.findElement(By.xpath("//h4[normalize-space()='Incorrect phone number']")).getText());
	}
	
	public void logout()
	{
		main.findElement(By.partialLinkText("Log")).click();
	}

}
