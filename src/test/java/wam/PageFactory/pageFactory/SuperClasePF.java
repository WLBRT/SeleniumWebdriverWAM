package wam.PageFactory.pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import wam.PageFactory.ReadProperties.ReadFileData;
import wam.PageFactoy.Utilidades.Captura;
import wam.PageFactoy.Utilidades.FormatodeTiempo;

public class SuperClasePF{
	public static WebDriver d;
	
	 @BeforeClass
	 public static void preCondiciones(){
		 /* Descarga GeockDriver para utilizar la version resientes de FireFox, https://github.com/mozilla/geckodriver/releases
		  * Si prefieres utilizar version anterior de FireForx(V 33) tienes que comentar esta linea 24 y bajar las versiones de Selenium.
		  * Pero yo te recomiento utilizarlo con el controlador GeckoDriver
		  * Copia el controladro en C:/geckodriver/
		  * */
		 System.setProperty("webdriver.gecko.driver", "C:/geckodriver/geckodriver.exe"); 
		 d = new FirefoxDriver();
		 d.get(ReadFileData.Leer("url"));
//		 d.get("http://demo.guru99.com/V4/");
		 d.manage().window().maximize();
		 d.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 System.out.println(FormatodeTiempo.Datos()+" PreCondiciones, acceder a pagina de Inicio");
		 Captura.CapturaPantalla(d, "Pantalla Inicio 01");
	 }

	 @AfterClass
	 public void postCondiciones() {
		 System.out.println(FormatodeTiempo.Datos()+" PostCondiciones, salir de la prueba");
		 Captura.CapturaPantalla(d, " Terminar Prueba");
		 d.quit();
	 }
	 
	 
}
