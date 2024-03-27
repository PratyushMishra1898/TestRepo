package com.WebDriverdemos;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class D05GetPageSource {

	public static void main(String[] args) {
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		String source = driver.getPageSource();
		System.out.println(source);
		
		driver.close();

	}

}
