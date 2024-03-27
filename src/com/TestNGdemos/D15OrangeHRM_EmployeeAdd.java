package com.TestNGdemos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class D15OrangeHRM_EmployeeAdd {
	
	
	String fPath = "F:\\Agile Pratyush Java Demos\\PratyushSeleniumDemos\\Excelfiles\\OHRM Assignment_Data.xlsx";
	File file;
	FileInputStream fis;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	
	
	WebDriver driver;
	int i,j;
	
  @Test(dataProvider = "getlogindata")
  public void f(String fn, String Mn, String ln, String un, String ps) throws InterruptedException {
	  driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(fn);
	  driver.findElement(By.xpath("//input[@placeholder='Middle Name']")).sendKeys(Mn);
	  driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(ln); 
	  
	  driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys(un);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys(ps);
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys(ps);
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  Thread.sleep(5000);
	  
	  driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	  driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	  
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(un);
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(ps);
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  Thread.sleep(2000);
	     	
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[3]/a/span")).click();
	  
	  Thread.sleep(5000);
	  
	  String EMPId = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[2]/div[1]/div[1]/div/div[2]/input")).getAttribute("value");
	  System.out.println(EMPId);
	  
	  String EMPname = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).getText();
	  System.out.println(EMPname);
	  
	  driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	  driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	  
	  
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
	  
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")).sendKeys(fn);
	  
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//i[@class='oxd-icon bi-trash']")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Yes, Delete']")).click();
	  
	  Thread.sleep(2000);
	  
	  driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
	  driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	  
	  
  }

  /*
  @AfterMethod
  public void afterMethod() {
	  
	  
	  
  }
*/

  @DataProvider
  public Object[][] getlogindata() {
     // return new Object[][] {
      //new Object[] { "ankurhs", "Ramdas" , "Vankor", "ankurhkds5656", "ankuhkds@5656"},
      //new Object[] { 2, "b" },
      
	    int rows = sheet.getPhysicalNumberOfRows();
		String[][] loginData = new String[rows-1][5];
		
		for(i = 0; i < rows-1; i++)
		{
			row = sheet.getRow(i + 1);
			for(j = 0; j < 5; j++)
			{
				cell = row.getCell(j+1);
				loginData[i][j] = cell.getStringCellValue();
			}
		}
		
		return loginData;
      
      
    //};
  }
 
@BeforeTest
  public void beforeTest() throws IOException {
	
	
	  
	  file = new File(fPath);
	  fis = new FileInputStream(file);
	  wb = new XSSFWorkbook(fis);
	  sheet = wb.getSheet("data");
	  //fos = new FileOutputStream(file);	
	 
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  
	  driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
	  driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
	  driver.findElement(By.xpath("//button[@type='submit']")).click();
	  
	  driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
	  
	  driver.findElement(By.xpath("//button[normalize-space()='Add']")).click();
	  
	  
	  
  }

  @AfterTest
  public void afterTest() throws IOException {
	  
	  wb.close();
	  //driver.close();
  }

}
