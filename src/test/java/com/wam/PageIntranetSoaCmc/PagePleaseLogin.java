package com.wam.PageIntranetSoaCmc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wam.SuperClase.SuperClaseIntranetSoa;

public class PagePleaseLogin extends SuperClaseIntranetSoa {
	@FindBy (name="username") private WebElement usernameBox;
	@FindBy (name="credential") private WebElement credentialBox;
	@FindBy (name="login_button") private WebElement loginBtn;
	@FindBy (xpath="/html/body/section/div/div/div[2]/div[2]/div[2]/button[1]")
	private WebElement intranet;
	
	public PagePleaseLogin(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	public void getUsername(String strUserName) {
		usernameBox.sendKeys(strUserName);
	}
	public void getPass(String strPass) {
		credentialBox.sendKeys(strPass);
	}
	public void clicLoginBtn() {
		loginBtn.click();
	}
	
	public void clicIntranet() {
		intranet.click();
	}
	
	public void loginToPlease(String strUserName, String strPass) {
		this.getUsername(strUserName);
		this.getPass(strPass);
		this.clicLoginBtn();
	}
	

}
