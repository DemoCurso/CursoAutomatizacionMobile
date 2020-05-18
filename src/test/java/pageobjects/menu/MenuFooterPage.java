package pageobjects.menu;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;

public class MenuFooterPage {

    private static final Logger logger = LogManager.getLogger(MenuFooterPage.class);
    private AppiumDriver driver;

    @AndroidFindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Contactos\"]/android.view.ViewGroup")
    private AndroidElement menuContactos;

    public MenuFooterPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public void clickMenuContactos(){
        logger.debug("Click en menu contactos");
        menuContactos.click();
    }

}
