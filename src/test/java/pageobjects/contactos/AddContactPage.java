package pageobjects.contactos;

import definitions.contactos.AddContactSteps;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class AddContactPage {

    private static final Logger logger = LogManager.getLogger(AddContactPage.class);
    private AppiumDriver driver;

    @AndroidFindBy(id = "com.samsung.android.contacts:id/nameEdit")
    private AndroidElement campoNombre;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout[1]/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement labelNombre;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView")
    private AndroidElement labelTelefono;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText")
    private AndroidElement campoTelefono;

    @AndroidFindBy(accessibility = "Guardar")
    private AndroidElement botonGuardar;

    @AndroidFindBy(id = "com.samsung.android.contacts:id/alertTitle")
    private AndroidElement tituloMensajeConfirmacion;


    public AddContactPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void ingresarNombreContacto(String nombreContacto){
        logger.debug("Ingresa Nombre: " + nombreContacto);
        campoNombre.sendKeys(nombreContacto);
    }

    public void ingresarTelefonoContacto(String telefonoContacto){
        logger.debug("Ingresa Telefono: " + telefonoContacto);
        campoTelefono.sendKeys(telefonoContacto);
    }

    public void clickLabelNombre(){
        logger.debug("Click en label nombre");
        labelNombre.click();
    }

    public void clickLabelTelefono(){
        logger.debug("Click en label telefono");
        labelTelefono.click();
    }

    public void clickBotonGuardar(){
        logger.debug("Click en boton guardar");
        botonGuardar.click();
    }
}
