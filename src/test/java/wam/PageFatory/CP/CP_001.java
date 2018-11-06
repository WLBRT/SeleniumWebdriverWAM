package wam.PageFatory.CP;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import wam.PageFactory.Paginas.IniciarSesionPag;
import wam.PageFactory.ReadProperties.ReadFileData;
import wam.PageFactory.pageFactory.SuperClasePF;

public class CP_001 extends SuperClasePF {

	@Test
	public void CP() {
		IniciarSesionPag login = new IniciarSesionPag(d);
//		login.loginTo("mgr123", "mgr");
		login.loginTo(ReadFileData.Leer("username"), ReadFileData.Leer("password"));
		login.cerrarSesion();
		d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	}

}