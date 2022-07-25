package pompackage;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import basepackage.BaseMPMclass;

public class PomLogin extends BaseMPMclass {
	// create object repository
	@FindBy(id="\"frmLogin\"")
       WebElement username;
	@FindBy(id="txtPassword")
	WebElement password;
	@FindBy(id="btnLogin")
	WebElement login;
	
	// initiate page elements
	public PomLogin() {
		PageFactory.initElements(driver, this);
		
	}
	public void typeusername (String name){
		username.sendKeys(name);
	}
		public void typepassword(String pass) {
			password.sendKeys(pass);
		}
			public void clickbtn() {
			login.click();
		}
			public  String verify() {
				return driver.getTitle();
			}
	}


