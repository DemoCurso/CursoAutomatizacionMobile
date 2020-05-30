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
    public void unUsuarioSeEncuentraLoggeado() throws MalformedURLException {

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("automationName", "UiAutomator2");
        caps.setCapability("platformName", "android");
        caps.setCapability("deviceName", "SAMSUNG_S8_QA_1");
        caps.setCapability("appPackage", "com.truecaller");
        caps.setCapability("appActivity", "com.truecaller.ui.TruecallerInit");

        driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), caps);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        MobileElement el1 = (MobileElement) driver.findElementById("com.truecaller:id/nextButton");
        el1.click();

        MobileElement el2 = (MobileElement) driver.findElementById("android:id/button1");
        el2.click();

        MobileElement el3 = (MobileElement) driver.findElementById("com.truecaller:id/button_skip");
        el3.click();

        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton");
        el4.click();

    }

    @Given("^un usuario se encuentra en contactos$")
    public void unUsuarioSeEncuentraEnContactos() throws InterruptedException, MalformedURLException {
        MobileElement el30 = (MobileElement) driver.findElementByAccessibilityId("Contactos");
        el30.click();
    }


    @When("^el usuario agrega un contacto$")
    public void elUsuarioAgregaUnContacto() {
        MobileElement el40 = (MobileElement) driver.findElementById("com.truecaller:id/fab_icon");
        el40.click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.samsung.android.contacts:id/nameEdit");
        el5.sendKeys("AutomatizacionMobile");
        driver.navigate().back();
        MobileElement el6 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout/android.widget.RelativeLayout/android.widget.TextView");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout[1]/android.widget.ScrollView/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout[1]/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.LinearLayout[2]/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.EditText");
        el7.sendKeys("+56961499611");
        MobileElement el8 = (MobileElement) driver.findElementByAccessibilityId("Guardar");
        el8.click();
    }

    @Then("^el contacto se visualiza en la lista de contactos$")
    public void elContactoSeVisualizaEnLaListaDeContactos() {

    }
}
