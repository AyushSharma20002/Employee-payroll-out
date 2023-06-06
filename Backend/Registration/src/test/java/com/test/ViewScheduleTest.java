package com.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class ViewScheduleTest {
	WebDriver wd;
	@BeforeMethod
	  public void beforeMethod() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sharm\\Downloads\\chromedriver_win32\\chromedriver.exe");
	     wd=new ChromeDriver();
	  }
  @Test
  public void ViewScheduleTest() {
	  WebDriver driver = new ChromeDriver(); 
	  driver.get("http://localhost:4200/userHome");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("ue2")).click();
	  driver.findElement(By.id("sc1")).sendKeys("1");
	  driver.findElement(By.id("sc2")).click();
  }
  
  

  @AfterMethod
  public void afterMethod() {
  }

}
