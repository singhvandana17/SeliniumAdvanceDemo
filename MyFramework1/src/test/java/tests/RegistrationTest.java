package tests;

import org.testng.annotations.Test;

import Utilities.ExcelUtility1;
import pages.HomePage;
import pages.Registration;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;

public class RegistrationTest {
  WebDriver d;
  HomePage h;
  Registration r;
  ExcelUtility1 e;
  
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "Resources\\chromedriver.exe");
		 d = new ChromeDriver();
		 d.get("http://demowebshop.tricentis.com/");
		 
		 //h=new HomePage();
		h=PageFactory.initElements(d, HomePage.class) ;
		r=PageFactory.initElements(d, Registration.class);
		e=new ExcelUtility1();
}
	  
  
  
  
  @Test
  public void TestRegistration() throws IOException {
	  h.clickRegistration();
	  e.getTestdata();
	  
  }

}
