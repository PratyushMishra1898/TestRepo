package com.TestNGdemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PracticeTestLogin {

	WebDriver dr;

	public PracticeTestLogin(WebDriver driver) {
		this.dr = driver;
	}
	
	public void addUserName(String un)
	{
		dr.findElement(By.xpath("//input[@id='username']")).sendKeys(un);
	}
	public void addPassword(String ps)
	{
		dr.findElement(By.xpath("//input[@id='password']")).sendKeys(ps);
	}
	public void clickLogin()
	{
		dr.findElement(By.xpath("//button[@id='submit']")).click();
	}
	public void showMessage()
	{
		System.out.println(dr.findElement(By.xpath("//h1[@class='post-title']")).getText());
	}
	public void logout()
	{
		dr.findElement(By.partialLinkText("Log")).click();
	}

}
