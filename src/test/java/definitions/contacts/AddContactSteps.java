package definitions.contacts;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utils.DriverFactory;

import java.io.IOException;
import java.util.Properties;

public class AddContactSteps {


    @Given("^un usuario se encuentra loggeado$")
    public void unUsuarioSeEncuentraLoggeado() throws IOException {
        DriverFactory.createDriverMobile();
        /*
        Properties properties = new Properties();
        properties.put("platformName", "android");
        properties.put("deviceName", "S8");
        properties.put("appPackage", "com.truecaller");
        properties.put("appActivity","com.truecaller.ui.TruecallerInit");
        String urlAppium = "http://0.0.0.0:4723/wd/hub";
        DriverFactory.createDriverMobile(urlAppium, properties);
         */
    }

    @Given("^un usuario se encuentra en contactos$")
    public void un_usuario_se_encuentra_en_contactos() {
    }

    @When("^el usuario agrega un contacto$")
    public void elUsuarioAgregaUnContacto() {
        
    }

    @Then("^el contacto es creado correctamente$")
    public void elContactoEsCreadoCorrectamente() {
    }

}
