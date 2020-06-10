package pageobjects.menu;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class MenuFooterPage {

    private AppiumDriver driver;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Contactos\"]")
    private AndroidElement menuContactos;

    public MenuFooterPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickMenuContactos(){
        System.out.println("Click en menu contactos");
        menuContactos.click();
    }
}
