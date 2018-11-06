package wam.PageFactoy.Utilidades;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatodeTiempo {
	public static String Datos() {
		DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		return date.format(now);
	}
}
