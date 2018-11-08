package com.wam.PageIntranetSoaCmc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.wam.SuperClase.SuperClaseIntranetSoa;

public class ActividadCMC extends SuperClaseIntranetSoa{
	@FindBy (name="ID_USUARIO") private WebElement boxIdUserName;
	@FindBy (name="ID_CLAVE")private WebElement boxIdClave;
	@FindBy (name="IMG2")private WebElement btnLoginImg2;
	@FindBy (xpath="//img")private WebElement imgCMC;
	
	public ActividadCMC(WebDriver d) {
		PageFactory.initElements(d, this);
	}
	
	public void getIdUsuario(String strIdUsuario) {
		boxIdUserName.sendKeys(strIdUsuario);
	}
	public void getIdClave(String strIdClave) {
		boxIdClave.sendKeys(strIdClave);
	}
	public void clicBtnLogin() {
		btnLoginImg2.click();
	}
	public void clicImgCMC(){
		imgCMC.click();
	}
	
	public void LoginActividades(String strIdUsuario, String strIdClave) {
		this.getIdUsuario(strIdUsuario);
		this.getIdClave(strIdClave);
		this.clicBtnLogin();
	}

}
