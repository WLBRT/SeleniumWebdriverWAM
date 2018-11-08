package com.wam.SuperClase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import wam.PageFactoy.Utilidades.FormatodeTiempo;

public class SuperClaseIntranetSoa {
	public static WebDriver d;
	
	@BeforeClass
	public static void preCondiciones() {
		DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);
		 System.setProperty("webdriver.gecko.driver", "C:/geckodriver/geckodriver.exe"); 
//		 System.setProperty("webdriver.firefox.marionetter", "C:/geckodriver/geckodriver.exe");
		 d = new FirefoxDriver();
		 d.get("https://intranet.grupocmc.es/remote/login?lang=en");
//		 d.get("https://intranet.grupocmc.es/proxy/0599800d/http/172.26.0.11/scripts/isafcgi.dll/NSSPCORP/PROY.ACTFR");
		 d.manage().window().maximize();
		 d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 System.out.println(FormatodeTiempo.Datos()+" PreCondiciones, acceder a pagina de Inicio");
	}
	
	@AfterClass
	public void postCondiciones() {
		d.quit();
		System.out.println("PostCondiciones ha terminado");
	}

}
