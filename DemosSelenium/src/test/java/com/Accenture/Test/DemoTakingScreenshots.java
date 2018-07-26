package com.Accenture.Test;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class DemoTakingScreenshots {
	static WebDriver driver;
	static int counter=1;
  @Test
  public void file() throws IOException  {
	  takescreenshot();
	  takescreenshot();
  }
 
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.timesjobs.com/candidate/register.html");
  }
      public static void takescreenshot() throws IOException
      {
    	  TakesScreenshot t = (TakesScreenshot)driver;
    File f=  t.getScreenshotAs(OutputType.FILE);
    	//  File file = t.getScreenshotAs(OutputType.FILE);
    	 FileUtils.copyFile(f, new File("C:\\akshit\\screenshot\\123" +counter+ ".jpg"));
    	  counter = counter + 1;
    	
      }
}
