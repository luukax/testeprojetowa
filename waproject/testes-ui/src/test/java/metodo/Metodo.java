package metodo;



import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Metodo {

	
	WebDriver driver;

	/**
	 * Lucas
	 */
	public void abrirBrowser(String site) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\driver\\94\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(site);
			driver.manage().window().maximize();
		} catch (Exception e) {
			System.err.println("*******erro ao abrir browser********");
		}

	}

	/**
	 * Lucas
	 */
	public void digitar(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("*********erro ao digitar*********");
		}
	}

	/**
	 * Lucas
	 */
	public void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("********erro ao clicar********");
		}
	}

	/**
	 * Lucas
	 */
	public void espera() {
		try {
			driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		} catch (Exception e) {
			System.out.println("**********erro no espera de carregamento**********");
		}
	}

	/**
	 * Lucas
	 */
	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void screenShot(String nomeEvidencia) {
		try {
			TakesScreenshot scrShot = ((TakesScreenshot) driver);
			File scrFile = scrShot.getScreenshotAs(OutputType.FILE);
			File destFile = new File("./Evidencias/" + nomeEvidencia + ".png");
			FileUtils.copyFile(scrFile, destFile);
		} catch (Exception e) {
			System.err.println("------erro no screnshot--------");
		}
	}
	/**
	 * Lucas
	 * 
	 */
	public void fecharBrowser() {
		try {
			driver.quit();
		} catch (Exception e) {
			System.out.println("******erro ao fechar******");
		}
		
	}
}