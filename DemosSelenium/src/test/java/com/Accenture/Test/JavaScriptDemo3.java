package com.Accenture.Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptDemo3 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException {
	  //driver.manage().window().maximize();
	  JavascriptExecutor j= (JavascriptExecutor)driver;
	 // j.executeScript("alert('hello')");
	  j.executeScript("window.scroll(0,1000)");
	  Thread.sleep(5000);
	  j.executeScript("window.scroll(0,30)");
		
		

  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
	
	  
	  driver = new ChromeDriver();
	
	  
	  
	  
	  driver.get("https://www.timesjobs.com/candidate/register.html");
  }
}
