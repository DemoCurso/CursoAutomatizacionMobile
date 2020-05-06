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
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.DriverFactory;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

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
    public void un_usuario_se_encuentra_loggeado() throws IOException {

        driver = DriverFactory.createMobileDriver();

        wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.truecaller:id/nextButton")));
        driver.findElementById("com.truecaller:id/nextButton").click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
        driver.findElementById("android:id/button1").click();
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.truecaller:id/button_skip")));
        driver.findElementById("com.truecaller:id/button_skip").click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//android.widget.TextView[@resource-id='com.truecaller:id/title' and contains(@text,'Premium')]")));
        System.out.println("Texto: ["+ driver.findElementByXPath("//android.widget.TextView[@resource-id='com.truecaller:id/title' and contains(@text,'Premium')]").getText() +"]");
        driver.navigate().back();
    }

    @Given("^un usuario se encuentra en contactos$")
    public void un_usuario_se_encuentra_en_contactos(){
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.FrameLayout[@content-desc=\"Contactos\"]/android.view.ViewGroup")));
        //Click en boton Contactos
        driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Contactos\"]/android.view.ViewGroup").click();
    }

    @When("^el usuario agrega un contacto$")
    public void el_usuario_agrega_un_contacto(){
        wait.until(ExpectedConditions.elementToBeClickable(By.id("com.truecaller:id/fab_icon")));
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
    public void elContactoEsCreadoCorrectamente() {
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
