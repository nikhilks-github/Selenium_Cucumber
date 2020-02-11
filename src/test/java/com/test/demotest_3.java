package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class demotest_3 {

WebDriver driver =  null;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\a07208trng_b4b.04.25\\Desktop\\cucumber_training_nikhil\\chromedriver_win32 (3)\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://demowebshop.tricentis.com/");
	  driver.manage().window().maximize();
	  driver.findElement(By.linkText("Log in")).click(); 
	  driver.findElement(By.id("Email")).sendKeys("aravind.guggilla57@gmail.com");
	  driver.findElement(By.id("Password")).sendKeys("aravind");
	  driver.findElement(By.xpath("//input[@value=\"Log in\"]")).click();
  }
}
