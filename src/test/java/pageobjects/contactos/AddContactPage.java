package pageobjects.contactos;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.PageFactory;

public class AddContactPage {
    
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
        System.out.println("Ingresa Nombre: " + nombreContacto);
        campoNombre.sendKeys(nombreContacto);
    }


    public void ingresarTelefonoContacto(String telefonoContacto){
        System.out.println("Ingresa Telefono: " + telefonoContacto);
        campoTelefono.sendKeys(telefonoContacto);
    }


    public void clickLabelNombre(){
        System.out.println("Click en label nombre");
        labelNombre.click();
    }


    public void clickLabelTelefono(){
        System.out.println("Click en label telefono");
        labelTelefono.click();
    }


    public void clickBotonGuardar(){
        System.out.println("Click en boton guardar");
        botonGuardar.click();
    }


    public boolean isDisplayedMensajeConfirmacion(){
        boolean result = false;
        try{
            System.out.println("Aparece mensaje de confirmacion: " + tituloMensajeConfirmacion.isDisplayed());
            result = tituloMensajeConfirmacion.isDisplayed();
        }catch(NoSuchElementException e){
            System.err.println("Mensaje de confirmacion no encontrado. Error: " + e.getMessage());
        }catch(Exception e){
            System.err.println("Excepcion general: " + e.getMessage());
        }finally {
            return result;
        }
    }


    public String getTituloMensajeConfirmacion(){
        System.out.println("Titulo mensaje de confirmacion: " + tituloMensajeConfirmacion.getText().trim());
        return tituloMensajeConfirmacion.getText().trim();
    }

}
