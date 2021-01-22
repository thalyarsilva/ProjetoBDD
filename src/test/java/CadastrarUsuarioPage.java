import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CadastrarUsuarioPage {

	public static WebDriver driver;

	public WebDriver getDriver() {

		driver.get("https://www.advantageonlineshopping.com");
		driver.manage().window().maximize();
		return driver;
	}

	@FindBy(how = How.ID, using = "menuUser")
	private WebElement IconeMenuser;

	@FindBy(how = How.XPATH, using = "/html/body/login-modal/div/div/div[3]/a[2]")
	private WebElement CriarConta;

	@FindBy(how = How.NAME, using = "usernameRegisterPage")
	private WebElement DigitarNome;

	@FindBy(how = How.NAME, using = "emailRegisterPage")
	private WebElement DigitarEmail;

	@FindBy(how = How.NAME, using = "passwordRegisterPage")
	private WebElement DigitarSenha;

	@FindBy(how = How.NAME, using = "confirm_passwordRegisterPage")
	private WebElement ConfirmarSenha;

	@FindBy(how = How.XPATH, using = "//*[@id=\"formCover\"]/div[2]/div[1]/sec-view[1]/div/input")
	private WebElement EscreverNome;

	@FindBy(how = How.NAME, using = "last_nameRegisterPage")
	private WebElement EscreveSobrenome;

	@FindBy(how = How.NAME, using = "phone_numberRegisterPage")
	private WebElement EscreveTelefone;

	@FindBy(how = How.NAME, using = "countryListboxRegisterPage")
	private WebElement DigiteSeuPais;

	@FindBy(how = How.NAME, using = "cityRegisterPage")
	private WebElement DigiteSuaCidade;

	@FindBy(how = How.NAME, using = "addressRegisterPage")
	private WebElement DigiteSeuEndereco;

	@FindBy(how = How.XPATH, using = "//*[@id=\"formCover\"]/div[3]/div[2]/sec-view[2]/div/label")
	private WebElement DigiteSeuEstado;

	@FindBy(how = How.NAME, using = "postal_codeRegisterPage")
	private WebElement DigiteSeuPostal;

	@FindBy(how = How.NAME, using = "i_agree")
	private WebElement Aceite;

	@FindBy(how = How.ID, using = "register_btnundefined")
	private WebElement Registre;

	public void IconeInicial() {
		IconeMenuser.click();
	}

	public void CriarConta() {
		CriarConta.click();
	}

	public void EscreverNome() {
		DigitarNome.sendKeys("Talia");
	}

	public void EscreverEmail() {
		DigitarEmail.sendKeys("thalya.rsilva@hotmail.com");

	}

	public void EscreverSenha() {
		DigitarSenha.sendKeys("552866");

	}

	public void DigitarSenha() {
		ConfirmarSenha.sendKeys("552866");

	}

	public void DigitarNome() {
		DigitarNome.sendKeys("talia");

	}

	public void Sobrenome() {
		EscreveSobrenome.sendKeys("Rocha");
	}

	public void Telefone() {
		EscreveTelefone.sendKeys("958086098");
	}

	public void Pais() {
		DigiteSeuPais.sendKeys("Brasil");
	}

	public void Cidade() {
		DigiteSuaCidade.sendKeys();

	}

	public void Endereco() {
		DigiteSeuEndereco.sendKeys();

	}

	public void Estado() {
		DigiteSeuEstado.click();

	}

	public void Postal() {
		DigiteSeuPostal.sendKeys("123344");
	}

	public void Aceitar() {
		Aceite.click();
	}

	public void Registrar() {
		Registre.click();
	}
}