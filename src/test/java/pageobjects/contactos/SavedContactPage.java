package pageobjects.contactos;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class SavedContactPage {

    private AppiumDriver driver;
    private Wait wait;

    @AndroidFindBy(id = "com.truecaller:id/fab_icon")
    private AndroidElement addContactButton;

    public SavedContactPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(this.driver, 30);
    }

    public void clickBotonAgregarContacto(){
        addContactButton.click();
    }

    public boolean buscarContacto(String nombreContacto){
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//android.widget.TextView[@resource-id='com.truecaller:id/title']")));
        while(getContact(nombreContacto).size() == 0) {
            scrollDown();
        }
        if(getContact(nombreContacto).size() > 0){
            System.out.println("Contacto encontrado: ["+ getContact(nombreContacto).get(0).getText() +"]");
            Assert.assertEquals(nombreContacto, getContact(nombreContacto).get(0).getText());
        }else
            System.out.println("No se encontro el contacto que debio haber sido creado.");
        return true;
    }

    private void scrollDown(){
        System.out.println("Scroll Down");
        Dimension dimension = driver.manage().window().getSize();

        Double scrollHeightStart = dimension.getHeight() * 0.5;
        int scrollStart = scrollHeightStart.intValue();

        Double scrollHeightEnd = dimension.getHeight() * 0.2;
        int scrollEnd = scrollHeightEnd.intValue();

        new TouchAction((PerformsTouchActions) driver)
                .press(PointOption.point(0, scrollStart))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(1)))
                .moveTo(PointOption.point(0, scrollEnd))
                .release().perform();
    }

    private List<WebElement> getContact(String nombreContacto){
        return driver.findElementsByXPath("//android.widget.TextView[@text='"+ nombreContacto +"']");
    }
}
