package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration {
	WebDriver d;
	@FindBy(id="gender-female")
	static
	WebElement ChkBox_Gender;

	@FindBy(id="FirstName")
	static
	WebElement TxtBox_FirstName;

	@FindBy(id="LastName")
	static
	WebElement TxtBox_LastName;

	@FindBy(id="Email")
	static
	WebElement TxtBox_Email;


	@FindBy(id="Password")
	static
	WebElement TxtBox_Password;

	@FindBy(id="ConfirmPassword")
	static
	WebElement TxtBox_ConfirmPassword;


	@FindBy(id="register-button")
	static
	WebElement Button_register;


	public static void enterreg(String F,String L,String E, String password, String confirmPassword){
		ChkBox_Gender.click();
		TxtBox_FirstName.sendKeys(F);
		TxtBox_LastName.sendKeys(L);
		TxtBox_Email.sendKeys(E);
		TxtBox_Password.sendKeys(password);
		TxtBox_ConfirmPassword.sendKeys(confirmPassword);
		Button_register.click();
		
	}
	
	public void Registeration(WebDriver driver){
		this.d=driver;
	}

	

}
