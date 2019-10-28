package stepDefinitionRegister;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.RegisterPage;

public class RegisterStep {
    WebDriver driver;
    RegisterPage registerPage;
    String Url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        registerPage = new RegisterPage(driver);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("el usuario esta en la pagina principal")
    public void usuarioEstaEnRegistro(){ driver.get(Url);
    }
    @And("le da clic en el boton crear cuenta")
        public  void  usuarioClickBotonCrearCuenta(){ registerPage.clicBotonCrearCuenta();
    }
    @When("^el usuario ingrese credenciales validas \"(.*)\"$")
    public void usuarioIngresaNombre(String name){ registerPage.setName(name);
    }
    @And("^el email \"(.*)\"$")
    public void usuarioIngresaEmail(String email){ registerPage.setEmail(email);
    }

    @And("^el phone \"(.*)\"$")
    public void usuarioIngresaTelefono(String phone){ registerPage.setPhone(phone);
    }
    @And("selecciona el genero Male")
    public void usuarioSeleccionaGeneroMale() { registerPage.clickLoginButtonMale();
    }

    @And("^el password \"(.*)\"$")
    public void usuarioIngresaContrasenia(String password) { registerPage.setPassword(password);
    }

    @And("^verifique el password \"(.*)\"$")
    public void usuarioVerificaContrasenia(String Password) { registerPage.verifyPassword(Password);
    }

    @And ("hace clic en el listado de paises")
    public  void  clicMenuDePaises(){ registerPage.clicMenuDePises();
    }

    @And("selecciona un pais")
    public void seleccionaElPais(){
        registerPage.seleccionDePais();
    }

    @And("selecciona un tipo de subcripcion")
    public void seleccioneElTipoSubcricion(){
        registerPage.clickWeeklyEmail();
    }

    @And("selecciona hace clic en el boton submit")
    public void clicBotoSubmit(){
        registerPage.clickBotonSubmit();
    }

    @Then("el usuario puede ver el panel de administracion \"(.*)\"$")
    public void usuarioEnElHome(String mensajeExitoso){
        registerPage.registerSuccesfully();
    }
}
