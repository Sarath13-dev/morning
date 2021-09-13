package org.login;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Baseclass {

	 public LoginPage() {
	 
		 PageFactory.initElements(driver, this);
	 }
	
	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy(id="password")
	private WebElement txtPassword;
	
	
	@FindBy(id="login")
	private WebElement btnLogin;


	public WebElement getTxtUserName() {
		return txtUserName;
	}


	public WebElement getTxtPassword() {
		return txtPassword;
	}


	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	
	
	
	
//	public void browserLaunch(String url) {
//		launchDriver(url);
//	}
//	
//	public void enterLogin(String text) {
//		enterText(getTxtUserName(), text);
//	}
//	
//	
//	public void enterPass(String text) {
//		enterText(getTxtPassword(), text);
//	}
//	
//	private void btn() {
//		btnclick(getBtnLogin());
//	}
	
}
