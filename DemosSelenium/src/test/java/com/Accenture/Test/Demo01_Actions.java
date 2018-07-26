package com.Accenture.Test;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class Demo01_Actions {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException, AWTException {
	  Actions a = new Actions(driver);
	  setClipboardData("C:\\Users\\pdc4-training.pdc4\\Pictures\\Screenshots\\attendance.txt");
	  
	  
	  
	  
	  
	  WebElement email= driver.findElement(By.id("emailAdd"));
	  a.moveToElement(email).keyDown(email,Keys.SHIFT).sendKeys("newuser").build().perform();
	  driver.findElement(By.name("resumeFile_basic")).click();
	  Thread.sleep(3000);
	   
	  Robot r = new Robot();
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  
	  r.keyPress(KeyEvent.VK_CONTROL);
	 // r.keyRelease(KeyEvent.VK_CONTROL);
	  
	  r.keyPress(KeyEvent.VK_V);
	  r.keyRelease(KeyEvent.VK_V);
	  
	  r.keyRelease(KeyEvent.VK_CONTROL);
	  
	  r.keyPress(KeyEvent.VK_ENTER);
	  r.keyRelease(KeyEvent.VK_ENTER);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	
	  
	  driver = new ChromeDriver();
	
	  
	  
	  
	  driver.get("https://www.timesjobs.com/candidate/register.html");
  }
	  
	  public static void setClipboardData(String string)
	  {
		  StringSelection stringSelection = new StringSelection(string);
		  Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
	  }
	  
	  
	  
  }


