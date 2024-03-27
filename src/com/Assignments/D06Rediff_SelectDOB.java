package com.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class D06Rediff_SelectDOB {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		WebElement drplist1 = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		Select Date = new Select(drplist1);
		
		//when we want to perform single operation on the dropdown list
		//new Select(driver.findElement(By.xpath("//*[@id=\\\"tblcrtac\\\"]/tbody/tr[22]/td[3]/select[1]"))).selectByVisibleText("26");
		
		WebElement drplist2 = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		Select Month = new Select(drplist2);
		
		WebElement drplist3 = driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		Select Year = new Select(drplist3);
		
		
		Date.selectByVisibleText("26");
		Month.selectByVisibleText("JAN");
		Year.selectByVisibleText("2002");
		
		
		System.out.println("Selected DOB is: " + Date.getFirstSelectedOption().getText() + "/" + Month.getFirstSelectedOption().getText() + "/" + Year.getFirstSelectedOption().getText());
		
		driver.close();

	}

}
