package stepDefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.*;

public class LoginStep {
    WebDriver driver;
    loginPage loginPage;
    homePage homePage;
    String Url = "http://sdettraining.com/trguitransactions/AccountManagement.aspx";
    @Before
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new loginPage(driver);
        homePage = new homePage(driver);
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("el usuario esta en la pagina de login")
    public void usuarioEstaEnLogin(){
        driver.get(Url);

    }
    @When("^el usuario ingrese credenciales validas \"(.*)\"$")
    public void usuarioIngresaCorreo(String email){
        loginPage.setUser(email);
    }
    @And("^y el password \"(.*)\"$")
    public void usuarioIngresaContrasenia(String password){
        loginPage.setPassword(password);
        loginPage.clickLoginButton();
    }
    @Then("^el usuario puede ver el panel de administracion \"(.*)\"$")
    public void usuarioEnElHome(String mensajeExitoso){
        homePage.loggedSuccesfully();
    }
}
