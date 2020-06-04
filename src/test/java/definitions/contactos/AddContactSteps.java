package definitions.contactos;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class AddContactSteps {

    private AppiumDriver driver;
    private Wait wait;

    @Before
    public void setup() throws IOException {
        abrirAppMobile();
    }

    private void abrirAppMobile() throws IOException {
        System.out.println("Open app on mobile device");
        driver = DriverFactory.createMobileDriver();
        driver.launchApp();
    }

    @Given("^un usuario se encuentra loggeado$")
    public void unUsuarioSeEncuentraLoggeado() {

        wait = new WebDriverWait(driver, 30);

        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.truecaller:id/nextButton")));
        MobileElement el1 = (MobileElement) driver.findElementById("com.truecaller:id/nextButton");
        el1.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
        MobileElement el2 = (MobileElement) driver.findElementById("android:id/button1");
        el2.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.truecaller:id/button_skip")));
        MobileElement el3 = (MobileElement) driver.findElementById("com.truecaller:id/button_skip");
        el3.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton")));
        MobileElement el4 = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton");
        el4.click();

    }

    @Given("^un usuario se encuentra en contactos$")
    public void unUsuarioSeEncuentraEnContactos() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("Contactos")));
        MobileElement el30 = (MobileElement) driver.findElementByAccessibilityId("Contactos");
        el30.click();
    }


    @When("^el usuario agrega un contacto$")
    public void elUsuarioAgregaUnContacto() {
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.truecaller:id/fab_icon")));
        MobileElement el40 = (MobileElement) driver.findElementById("com.truecaller:id/fab_icon");
        el40.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.samsung.android.contacts:id/nameEdit")));
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
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@resource-id='com.truecaller:id/title']")));
        while(getContact("AutomatizacionMobile").size() == 0) {
            scrollDown();
        }
        if(getContact("AutomatizacionMobile").size() > 0){
            System.out.println("Contacto encontrado: ["+ getContact("AutomatizacionMobile").get(0).getText() +"]");
            Assert.assertEquals("AutomatizacionMobile", getContact("AutomatizacionMobile").get(0).getText());
        }else
            System.out.println("No se encontro el contacto que debio haber sido creado.");
        driver.closeApp();
    }

    private List<WebElement> getContact(String nombreContacto){
        return driver.findElementsByXPath("//android.widget.TextView[@text='"+ nombreContacto +"']");
    }

    private void scrollDown(){
        System.out.println("Scroll Down");
        Dimension dimension = driver.manage().window().getSize();
        Double scrollHeightStart = dimension.getHeight() * 0.5;
        int scrollStart = scrollHeightStart.intValue();
        Double scrollHeightEnd = dimension.getHeight() * 0.2;
        int scrollEnd = scrollHeightEnd.intValue();
        new TouchAction<>((PerformsTouchActions) driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
    }
}
