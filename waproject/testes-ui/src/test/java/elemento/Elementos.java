package elemento;

import org.openqa.selenium.By;

public class Elementos {

	private By email = By.name("email");
	private By senha = By.name("password");
	private By registros = By.xpath("//h3[contains(text() ,'Conferir meus registros de horas')]");
	private By textoObservasao = By.xpath("//*[@id=\"__next\"]/main/section/div/div[3]/table/tbody/tr[1]/td[5]");
	private By entrar = By.xpath("//*[text()='Entrar']");
    private By registro = By.xpath("//*[text()='teste de inclusão']");
    private By edit = By.xpath("//*[@id=\"__next\"]/main/section/div/div[3]/table/tbody/tr[1]/td[6]/div/button[1]");
    
    
	public By getEmail() {
		return email;
	}
	public By getSenha() {
		return senha;
	
	}
	public By getTextoObservasao() {
		return textoObservasao;
	}
	public By getEntrar() {
		return entrar;
	}
	public void setEntrar(By entrar) {
		this.entrar = entrar;
	
	}
	public By getRegistros() {
		return registros;
	}
	public void setRegistros(By registros) {
		this.registros = registros;
	}
	public By getRegistro() {
		return registro;
	}
	public void setRegistro(By registro) {
		this.registro = registro;
	}
	public By getEdit() {
		return edit;
	}
	public void setEdit(By edit) {
		this.edit = edit;
	}
	
}
