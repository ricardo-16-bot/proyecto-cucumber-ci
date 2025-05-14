package com.example.steps;

import com.example.pages.LoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        loginPage = new LoginPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("El usuario navega a la página de login")
    public void elUsuarioNavegaALaPaginaDeLogin() {
        loginPage.open();
    }

    @When("Ingresa el nombre de usuario {string}")
    public void ingresaElNombreDeUsuario(String username) {
        loginPage.enterUsername(username);
    }

    @When("Ingresa la contraseña {string}")
    public void ingresaLaContrasena(String password) {
        loginPage.enterPassword(password);
    }

    @When("Hace clic en el botón de login")
    public void haceClicEnElBotonDeLogin() {
        loginPage.clickLogin();
    }

    @Then("El sistema debe mostrar el mensaje {string}")
    public void elSistemaDebeMostrarElMensaje(String mensajeEsperado) {
        String mensajeActual = loginPage.getSuccessMessage();
        Assert.assertTrue("Mensaje incorrecto: " + mensajeActual, mensajeActual.contains(mensajeEsperado));
    }
}
