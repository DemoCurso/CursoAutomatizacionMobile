package definitions.contactos;

import com.cucumber.listener.Reporter;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.contacts.AddContactPage;
import pageobjects.contacts.SavedContactsPage;
import pageobjects.init.InitPage;
import pageobjects.menu.MenuFooterPage;
import utils.DriverFactory;
import utils.ReporterUtil;

import java.io.IOException;

public class AddContactSteps {

    private static final Logger logger = LogManager.getLogger(AddContactSteps.class);
    private AppiumDriver driver;
    private MenuFooterPage menuFooterPage;
    private SavedContactsPage savedContactsPage;
    private AddContactPage addContactPage;
    private InitPage initPage;

    private void initializePages(){
        menuFooterPage = new MenuFooterPage(driver);
        savedContactsPage = new SavedContactsPage(driver);
        addContactPage = new AddContactPage(driver);
        initPage = new InitPage(driver);
    }

    @Before
    public void setup() throws IOException {
        abrirAppMobile();
        initializePages();
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
        initPage.clickButton();
    }

    @Given("^un usuario se encuentra en contactos$")
    public void unUsuarioSeEncuentraEnContactos() {
        menuFooterPage.clickMenuContactos();
    }

    @When("^el usuario agrega el contacto ([^\\\"]*) con el telefono ([^\\\"]*)$")
    public void elUsuarioAgregaUnContacto(String nombreContacto, String telefono) {
        savedContactsPage.clickAddContactButton();
        addContactPage.ingresarNombre(nombreContacto);
        driver.navigate().back();
        addContactPage.clickLabelTelefono();
        addContactPage.ingresarTelefono(telefono);
        ReporterUtil.addScreenshot(driver, "Datos_contacto_");
        addContactPage.clickBotonGuardar();
    }

    @Then("^el contacto se visualiza con el nombre ([^\\\"]*) en la lista de contactos$")
    public void elContactoSeVisualizaEnLaListaDeContactos(String nombreContacto) {
        boolean actualResult = savedContactsPage.buscarContacto(nombreContacto);
        ReporterUtil.addScreenshot(driver, "Validacion_Contacto_Agregado_");
        Assert.assertTrue(actualResult);
        driver.closeApp();
    }

}
