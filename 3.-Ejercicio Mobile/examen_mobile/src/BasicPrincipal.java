import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import java.util.concurrent.TimeUnit;
//import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;

public class BasicPrincipal extends Base {

	public static void login(String usuario,String clave,AndroidDriver<AndroidElement>driver) throws InterruptedException {

		//------------LOGIN
		driver.findElementByXPath("//android.widget.TextView[@text='Login']").click();//dando click al icono


		//---dando un pequeño tiempo de espera
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );

		//-------correo y contraseña
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='input-email']")).sendKeys(usuario);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='input-password']")).sendKeys(clave);

		//boton login
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='button-LOGIN']")).click();

		long miliseg = (new Double(4 * 1000)).longValue();
		Thread.sleep(miliseg);
		if(driver.switchTo().alert().getText().contains("Success")) {
			driver.switchTo().alert().accept();
			System.out.println("paso correctamente");
		}
	}

	public static  void signup(String usuario,String clave,AndroidDriver<AndroidElement>driver) throws InterruptedException {
		//------------LOGIN
		driver.findElementByXPath("//android.widget.TextView[@text='Login']").click();//dando click al icono

		//dando click a la pestaña de signup
		driver.findElementByXPath("//android.widget.TextView[@text='Sign up']").click();


		//---dando un pequeño tiempo de espera
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );

		//-------correo y contraseña
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='input-email']")).sendKeys(usuario);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='input-password']")).sendKeys(clave);
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='input-repeat-password']")).sendKeys(clave);


		//boton login
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='button-SIGN UP']")).click();

		long miliseg = (new Double(4 * 1000)).longValue();
		Thread.sleep(miliseg);
		if(driver.switchTo().alert().getText().contains("Signed")) {
			driver.switchTo().alert().accept();
			System.out.println("paso correctamente");
		}
	}

	public static void  forms(String texto,AndroidDriver<AndroidElement>driver) throws InterruptedException {
		driver.findElementByXPath("//android.widget.TextView[@text='Forms']").click();

		//input field
		driver.findElement(By.xpath("//android.widget.EditText[@content-desc='text-input']")).sendKeys(texto);

		//switch probando si funka
		driver.findElement(By.xpath("//android.widget.Switch[@content-desc='switch']")).click();

		//combobox
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='select-Dropdown']")).click();
		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Appium is awesome']")).click();


		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS );

		String uiSelector = "new UiSelector().textMatches(\"Active\")";

		String command = "new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView("
				+ uiSelector + ");";

		driver.findElementByAndroidUIAutomator(command);
		//boton login
		driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='button-Active']")).click();

		long miliseg = (new Double(4 * 1000)).longValue();
		Thread.sleep(miliseg);
		if(driver.switchTo().alert().getText().contains("active")) {
			driver.switchTo().alert().accept();
			System.out.println("paso correctamente");
		}
	}

	public static void webView(AndroidDriver<AndroidElement>driver) throws InterruptedException {
		//clic en boton webview
		driver.findElementByXPath("//android.widget.TextView[@text='WebView']").click();

		long miliseg = (new Double(7 * 1000)).longValue();
		Thread.sleep(miliseg);
		//click en el icono de busqueda
		driver.findElement(By.xpath("//android.widget.Button[@text='Search']")).click();

		// escribir la palabra a buscar
		driver.findElement(By.xpath("//android.widget.EditText[@resource-id='docsearch-input']")).sendKeys("browser");;

		System.out.println("paso correctamente");
	}

	public static void tabs(AndroidDriver<AndroidElement>driver) throws InterruptedException {
		long miliseg = (new Double(6 * 1000)).longValue();
		Thread.sleep(miliseg);
		//clic en boton webview
		//driver.findElementByXPath("//android.widget.TextView[@text='WebView']").click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='WebView']")).click();

		Thread.sleep(miliseg);

		//click en el menu
		driver.findElement(By.xpath("//android.widget.Button[@text='Navigation bar toggle']")).click();

		//Tab Doc
		driver.findElement(By.xpath("//android.view.View[@text='Docs']")).click();
		miliseg = (new Double(4 * 1000)).longValue();
		Thread.sleep(miliseg);

		//click en el menu
		driver.findElement(By.xpath("//android.widget.Button[@text='Navigation bar toggle']")).click();

		//Tab API
		driver.findElement(By.xpath("//android.widget.Button[@text='Navigation bar toggle']")).click();

		driver.findElement(By.xpath("//android.view.View[@text='API']")).click();
		miliseg = (new Double(4 * 1000)).longValue();
		Thread.sleep(miliseg);

		//Tab Blog
		driver.findElement(By.xpath("//android.widget.Button[@text='Navigation bar toggle']")).click();

		driver.findElement(By.xpath("//android.view.View[@text='Blog']")).click();
		miliseg = (new Double(4 * 1000)).longValue();
		Thread.sleep(miliseg);

		//Tab Contribute
		driver.findElement(By.xpath("//android.widget.Button[@text='Navigation bar toggle']")).click();

		driver.findElement(By.xpath("//android.view.View[@text='Contribute']")).click();
		miliseg = (new Double(2 * 1000)).longValue();
		Thread.sleep(miliseg);

		//Tab Community
		driver.findElement(By.xpath("//android.widget.Button[@text='Navigation bar toggle']")).click();

		driver.findElement(By.xpath("//android.view.View[@text='Community']")).click();
		miliseg = (new Double(4 * 1000)).longValue();
		Thread.sleep(miliseg);

		//Tab v7
		driver.findElement(By.xpath("//android.widget.Button[@text='Navigation bar toggle']")).click();

		driver.findElement(By.xpath("//android.view.View[@text='v7']")).click();
		miliseg = (new Double(4 * 1000)).longValue();
		Thread.sleep(miliseg);

		System.out.println("paso correctamente");
	}

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement>driver=Capabilities();

		driver.manage().timeouts().implicitlyWait(5L, TimeUnit.SECONDS );
		signup("juanitaperez19@gmail.com", "12345678", driver);
		login("juanitaperez19@gmail.com", "12345678", driver);
		forms("juanitaperez19@gmail.com", driver);
		webView(driver);
		tabs(driver);
	}

}
