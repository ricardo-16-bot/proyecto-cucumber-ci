package com.example.steps;

import com.example.pages.AddRemoveElementsPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddRemoveElementsSteps {

    private WebDriver driver;
    private AddRemoveElementsPage page;

    @Before
    public void setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        page = new AddRemoveElementsPage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Given("El usuario está en la página de Add/Remove Elements")
    public void usuarioEnPaginaAddRemove() {
        page.open();
    }

    @When("Hace clic en el botón {string}")
    public void haceClicEnBoton(String boton) {
        if (boton.equals("Add Element")) {
            page.clickAddElement();
        } else if (boton.equals("Delete")) {
            page.clickDelete();
        }
    }

    @Then("Se debe mostrar un botón {string}")
    public void seDebeMostrarBoton(String boton) {
        Assert.assertTrue("El botón Delete no es visible", page.isDeleteButtonVisible());
    }

    @Then("El botón {string} ya no debe estar visible")
    public void botonYaNoDebeEstarVisible(String boton) {
        Assert.assertFalse("El botón Delete aún está visible", page.isDeleteButtonVisible());
    }
}
