package POM3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM2
	{
	//Decleration
		@FindBy(xpath="//input[@id='email']")
		private WebElement emailtxt;
		@FindBy(xpath="//input[@id='pass']")
		private WebElement pwdtxt;
		@FindBy(xpath="//button[@name='login']")
		private WebElement login;
		//initialization
		POM2(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		// utilization
		void enterEmail(String s)
		{
			emailtxt.sendKeys(s);
		}
		void enterPass(String s)
		{
			pwdtxt.sendKeys(s);
		}
		void Login()
		{
			login.click();
		}
}
