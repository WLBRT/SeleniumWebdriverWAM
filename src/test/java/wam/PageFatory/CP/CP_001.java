package wam.PageFatory.CP;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.testng.annotations.Test;

import wam.PageFactory.Paginas.IniciarSesionPag;
import wam.PageFactory.ReadProperties.ReadFileData;
import wam.PageFactory.pageFactory.SuperClasePF;

public class CP_001 extends SuperClasePF {
	
	@Test
	public void CP() {
		BasicConfigurator.configure();
		Logger log = Logger.getLogger(CP_001.class);
		PropertyConfigurator.configure("log4j.properties");
		
		IniciarSesionPag login = new IniciarSesionPag(d);
		log.info("Test de Log WAM 2 ");
//		login.loginTo("mgr123", "mgr");
		login.loginTo(ReadFileData.Leer("username"), ReadFileData.Leer("password"));
		login.cerrarSesion();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}

}