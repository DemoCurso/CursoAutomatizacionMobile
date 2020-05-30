package definitions.contactos;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import pageobjects.contactos.AddContactPage;
import pageobjects.contactos.SavedContactPage;
import pageobjects.init.InitPage;
import pageobjects.menu.MenuFooterPage;
import utils.DriverFactory;
import utils.ReporterUtil;

import java.io.IOException;

public class AddContactSteps {

    private static final Logger logger = LogManager.getLogger(AddContactSteps.class);
    private AppiumDriver driver;
    private MenuFooterPage menuFooterPage;
    private SavedContactPage savedContactPage;
    private AddContactPage addContactPage;
    private InitPage initPage;
    private String nombre;
    private String telefono;

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
        logger.debug("Open app on mobile device");
        driver = DriverFactory.createMobileDriver();
        driver.launchApp();
    }

    @Given("^un usuario se encuentra loggeado$")
    public void un_usuario_se_encuentra_loggeado() throws IOException {

        initPage.clickNextButton();
        initPage.clickContinueButton();
        initPage.clickSkipButton();
        String premiumTitle = initPage.getPremiumTitle();
        logger.debug("Texto: " + premiumTitle);
        driver.navigate().back();

    }

    @Given("^un usuario se encuentra en contactos$")
    public void un_usuario_se_encuentra_en_contactos(){
        menuFooterPage.clickMenuContactos();
    }

    @When("^el usuario agrega un contacto$")
    public void el_usuario_agrega_un_contacto(String nombre, String telefono){

        this.nombre   = nombre;
        this.telefono = telefono;

        savedContactPage.clickBotonAgregarContacto();
        addContactPage.ingresarNombreContacto(nombre);
        driver.navigate().back();
        addContactPage.clickLabelTelefono();
        addContactPage.ingresarTelefonoContacto(telefono);
        driver.navigate().back();
        ReporterUtil.addScreenshot(driver, "DatosParaCrearContacto");
        addContactPage.clickBotonGuardar();
    }

    @Then("^el contacto aparece en la lista de contactos guardados$")
    public void elContactoEsCreadoCorrectamente() {
        boolean searchResult = savedContactPage.buscarContacto(nombre);
        ReporterUtil.addScreenshot(driver, "ValidacionContactoAgregado");
        Assert.assertTrue(searchResult);
        driver.closeApp();
    }

    @After
    public void tearDown(){
        driver.closeApp();
    }

}
