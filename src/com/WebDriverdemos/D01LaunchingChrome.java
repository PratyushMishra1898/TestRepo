package com.WebDriverdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D01LaunchingChrome {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		//Open Blank browser
		driver.manage().window().maximize();
		//Maximize the browser
		driver.get("https://in.tradingview.com/");
		//Open the URL
		
		//String title = driver.getTitle();
		//System.out.println("Title is: " + title);
		
		driver.close();
		//Close the browser windows which is opened by the WebDriver object

	}

}
