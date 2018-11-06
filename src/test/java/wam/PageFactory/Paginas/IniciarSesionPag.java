package wam.PageFactory.Paginas;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import wam.PageFactory.pageFactory.SuperClasePF;
import wam.PageFactoy.Utilidades.Captura;
import wam.PageFactoy.Utilidades.FormatodeTiempo;

public class IniciarSesionPag extends SuperClasePF{
//	@FindBy (name="uid")
	@FindBy (xpath= "/html/body/form/table/tbody/tr[1]/td[2]/input")
	private WebElement cajaUsuerName;
	@FindBy (name="password")
	private WebElement cajaPassword;
	@FindBy (name="btnLogin")
	private WebElement botonLogin;
	@FindBy (xpath="")
	private WebElement botonHome;
	@FindBy (xpath= "/html/body/div[3]/div/ul/li[15]/a")
	private WebElement logout;
	
		public IniciarSesionPag(WebDriver d) {
			PageFactory.initElements(d, this);
		}
		public void obtenerName(String strUserName) {
			cajaUsuerName.sendKeys(strUserName);
		}
		public void obtenerPass(String strPassword) {
			cajaPassword.sendKeys(strPassword);
			
		}
		public void clicLoginBtn() {
			botonLogin.click();
		}
		public void irHome() {
			botonHome.click();
		}
		public void cerrarSesion() {
			logout.click();
		}
		
		public void loginTo(String strUserName, String strPassword) {
			this.obtenerName(strUserName);
			this.obtenerPass(strPassword);
			Captura.CapturaPantalla(d, "Insercion_UserName&Password");
			System.out.println(FormatodeTiempo.Datos()+" Se ingreso el nombre de usuario y contraseña");
			this.clicLoginBtn();
		}
}
