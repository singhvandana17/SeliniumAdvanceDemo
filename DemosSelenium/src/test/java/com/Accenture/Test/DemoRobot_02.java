package com.Accenture.Test;

import org.testng.annotations.Test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DemoRobot_02 {
	WebDriver driver;
  @Test
  public void f() throws AWTException {
	  Robot r = new Robot();
	 
	  
	  
	  r.keyPress(KeyEvent.VK_WINDOWS);
	  r.keyRelease(KeyEvent.VK_WINDOWS);
	  
	  
	  //this will press the caps Lock
	  r.keyPress(KeyEvent.VK_CAPS_LOCK);
	  
	  
	  //this will release the caps Lock
	  r.keyRelease(KeyEvent.VK_CAPS_LOCK);
  }
  @BeforeTest
  public void beforeTest() {
 System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	
	  
	 // driver = new ChromeDriver();
	
	  
	  
	  
	 // driver.get("https://www.timesjobs.com/candidate/register.html");
	  
	  
  }

}
