package wam.PageFactoy.Utilidades;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Captura {
	public static void CapturaPantalla(WebDriver d, String nombreCaptura) {
		try {
			TakesScreenshot cp = (TakesScreenshot) d;
			File source = cp.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Captura_PF/"+nombreCaptura+".png"));
			System.out.println(FormatodeTiempo.Datos()+" Captura Exitosa,  ./Captura_PF/"+nombreCaptura+".png");
}catch(Exception e) {
	System.out.println(FormatodeTiempo.Datos()+" Excepción al intentar Capturar: "+e.getMessage());
}
}
}