package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {
  @Test
  public void LoginValid() {
	  String ER="Tested";
	  String AR="Tested";
	  
	  Assert.assertEquals(ER, AR);
	 
  }
  
  @Test
  public void LoginInvalid() {
	  String ER="Tested";
	  String AR="Tested123";
	  
	  Assert.assertEquals(ER, AR);
  }
}
