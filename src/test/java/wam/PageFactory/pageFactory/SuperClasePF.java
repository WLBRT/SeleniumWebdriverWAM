package wam.PageFactory.pageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import wam.PageFactory.ReadProperties.ReadFileData;
import wam.PageFactoy.Utilidades.Captura;
import wam.PageFactoy.Utilidades.FormatodeTiempo;

public class SuperClasePF{
	public static WebDriver d;
	
	 @BeforeClass
	 public static void preCondiciones(){
		 
		 DesiredCapabilities capabilities = DesiredCapabilities.firefox();
		 capabilities.setCapability("marionette", true);
//		 System.setProperty("webdriver.gecko.driver", "C:/geckodriver/geckodriver.exe"); 
//		 System.setProperty("webdriver.firefox.marionetter", "C:/geckodriver/geckodriver.exe");
		 d = new FirefoxDriver();
//		 d = new ChromeDriver();
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
