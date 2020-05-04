package definitions.contacts;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.*;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait;
import pageobjects.contactos.AddContactPage;
import pageobjects.contactos.SavedContactPage;
import pageobjects.init.InitPage;
import pageobjects.menu.MenuFooterPage;
import utils.DriverFactory;

import java.io.IOException;

public class AddContactSteps {

    private AppiumDriver driver;
    private MenuFooterPage menuFooterPage;
    private SavedContactPage savedContactPage;
    private AddContactPage addContactPage;
    private InitPage initPage;

    private void inicializarPages() {
        menuFooterPage = new MenuFooterPage(driver);
        savedContactPage = new SavedContactPage(driver);
        addContactPage = new AddContactPage(driver);
        initPage = new InitPage(driver);
    }

    @Before
    public void setup() throws IOException {
        abrirAppMobile();
        inicializarPages();
    }

    private void abrirAppMobile() throws IOException {
        System.out.println("Open app on mobile device");
        driver = DriverFactory.createMobileDriver();
        driver.launchApp();
    }

    @Given("^un usuario se encuentra loggeado$")
    public void unUsuarioSeEncuentraLoggeado() {

        initPage.clickNextButton();
        initPage.clickContinueButton();
        initPage.clickSkipButton();
        String premiumTitle = initPage.getPremiumTitle();
        System.out.println("Texto: ["+ premiumTitle +"]");
        driver.navigate().back();
    }


    @Given("^un usuario se encuentra en contactos$")
    public void unUsuarioSeEncuentraEnContactos() {
        menuFooterPage.clickMenuContactos();
    }

    @When("^el usuario agrega un contacto$")
    public void elUsuarioAgregaUnContacto() {

        savedContactPage.clickBotonAgregarContacto();

        addContactPage.ingresarNombreContacto("AutomatizacionMobile");
        driver.navigate().back();
        addContactPage.clickLabelTelefono();
        addContactPage.ingresarTelefonoContacto("+56961499611");
        addContactPage.clickBotonGuardar();
    }

    @Then("^el contacto es creado correctamente$")
    public void elContactoEsCreadoCorrectamente() {
        boolean searchResult = savedContactPage.buscarContacto("AutomatizacionMobile");
        Assert.assertTrue(searchResult);
        driver.closeApp();
    }
}
