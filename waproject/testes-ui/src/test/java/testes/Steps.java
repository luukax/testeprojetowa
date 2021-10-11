package testes;

import elemento.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import metodo.Metodo;

public class Steps {
	
	Metodo met = new Metodo();
	Elementos el = new Elementos();
	
	@Given("que esteja no {string}")
	public void que_esteja_no(String site) {
	   met.abrirBrowser(site);
	}

	@Given("preencho o formulario de login")
	public void preencho_o_formulario_de_login() {
	   met.digitar(el.getEmail(), "admin");
	   met.digitar(el.getSenha(), "senha@1233");
	   met.clicar(el.getEntrar());
	    met.espera();

	}

	@Given("acesse Conferirmeus registros de horas")
	public void acesse_conferirmeus_registros_de_horas() throws InterruptedException {
		Thread.sleep(2000);
		met.clicar(el.getRegistros());
		Thread.sleep(2000);

	}

	@When("valido insercao no registro de atividade")
	public void valido_insercao_no_registro_de_atividade() {
		met.clicar(el.getEdit());
		met.screenShot("registro de atividade");
	   met.fecharBrowser();
	}
}
