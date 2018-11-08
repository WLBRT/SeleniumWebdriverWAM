package com.wam.Flujos;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

import com.wam.PageIntranetSoaCmc.ActividadCMC;
import com.wam.PageIntranetSoaCmc.PagePleaseLogin;
import com.wam.SuperClase.SuperClaseIntranetSoa;

public class Flujo_01 extends SuperClaseIntranetSoa {
	
	@Test
	public void PorFavorLogin() {
		BasicConfigurator.configure();
		Logger log = Logger.getLogger(Flujo_01.class);
		PropertyConfigurator.configure("log4j.properties");
		 
		PagePleaseLogin login = new PagePleaseLogin(d);
		log.debug("opening webiste");
		log.info("Abrir Navegador");
		login.loginToPlease("-", "-");
		log.info("Se ingresan las credenciales para iniciar seccion");
		WebDriverWait wait = new WebDriverWait(d, 10);
		
		WebElement aboutMe;
		WebElement aboutMe2;
		aboutMe= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/section/div/div/div[1]/div/button/div/span")));
		log.info("Se espera aque este visible el elemento "+aboutMe+" Para hcaer un clic");
		login.clicIntranet();
//		aboutMe2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/center/a/img")));
//		ActividadCMC login2 = new ActividadCMC(d);
//		login2.clicImgCMC();
//		d.findElement(By.xpath("//img[contains(@src,'images/cab_off_01.jpg')]")).click();
//		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
//		login2.LoginActividades("-", "-");
//		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	
//	@Test
//	public void ActSOA() {
//		ActividadCMC login = new ActividadCMC(d);
//		login.LoginActividades("wilbert.alejandro", "ieo0Pk84");
//		d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//	}
}
