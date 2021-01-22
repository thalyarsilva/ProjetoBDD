import static org.junit.Assert.assertTrue;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CadastarSteps {

	private CadastrarUsuarioPage cadastro;

	@Given("^que abro o site advantage$")
	public void que_abro_o_site_advantage() {
		cadastro.getDriver();

	}

	@When("^Clico no icone MenuUser$")
	public void Clic__no_icone_MenuUser() {
		cadastro.IconeInicial();

	}

	@When("^Clico em criar nova conta$")
	public void Clico_e_criar_nova_conta() {
		cadastro.CriarConta();

	}

	@When("^Digito Detalhes da Conta$")
	public void Digito_Detalhes_da_Conta() {
		cadastro.EscreverNome();
		cadastro.EscreverEmail();
		cadastro.EscreverSenha();
		cadastro.DigitarSenha();

	}

	@When("^Digito Detalhes Pessoais$")
	public void Digito_Detalhes_Pessoais() {
		cadastro.DigitarNome();
		cadastro.Sobrenome();
		cadastro.Telefone();

	}

	@When("^Digito endereco$")
	public void Digito_endereco() {
		cadastro.Pais();
		cadastro.Cidade();
		cadastro.Endereco();
		cadastro.Estado();
		cadastro.Postal();

	}

	@Then("^Clico registro$")
	public void Clico_registro() {
		cadastro.Aceitar();
		cadastro.Registrar();
		// assertTrue(null, false);

	}
}