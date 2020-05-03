package definitions.contactos;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AddContactSteps {

    private AppiumDriver driver;

    @Given("^un usuario se encuentra loggeado$")
    public void un_usuario_se_encuentra_loggeado() throws MalformedURLException {

        // Esto es un comentario de una linea
        DesiredCapabilities capsMobile = new DesiredCapabilities();
        capsMobile.setCapability("platformName", "android");
        capsMobile.setCapability("deviceName", "S8");
        capsMobile.setCapability("appPackage", "com.truecaller");
        capsMobile.setCapability("appActivity", "com.truecaller.ui.TruecallerInit");
        driver = new AppiumDriver(new URL("http://0.0.0.0:4724/wd/hub"), capsMobile);

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        MobileElement el1 = (MobileElement) driver.findElementById("com.truecaller:id/nextButton");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("android:id/button1");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.truecaller:id/button_skip");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton");
        el4.click();
    }

    @Given("^un usuario se encuentra en contactos$")
    public void un_usuario_se_encuentra_en_contactos(){
        //Click en boton Contactos
        MobileElement el20 = (MobileElement) driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Contactos\"]/android.view.ViewGroup");
        el20.click();
    }

    @When("^el usuario agrega un contacto$")
    public void el_usuario_agrega_un_contacto(){
        //Click en agregar contacto
        MobileElement el30 = (MobileElement) driver.findElementById("com.truecaller:id/fab_icon");
        el30.click();
        MobileElement el40 = (MobileElement) driver.findElementById("com.samsung.android.contacts:id/nameEdit");
        el40.sendKeys("AutomatizacionMobile");
        driver.navigate().back();
        MobileElement el5 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText");
        el6.sendKeys("+56961499611");
        MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Guardar");
        el7.click();
    }

    @Then("^el contacto es creado correctamente$")
    public void el_contacto_es_creado_correctamente(){

    }
}
