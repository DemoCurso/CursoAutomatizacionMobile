package pageobjects.init;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InitPage {

    private AppiumDriver driver;
    private Wait wait;

    @AndroidFindBy(id = "com.truecaller:id/nextButton")
    private AndroidElement nextButton;

    @AndroidFindBy(id = "android:id/button1")
    private AndroidElement continueButton;

    @AndroidFindBy(id = "com.truecaller:id/button_skip")
    private AndroidElement skipButton;

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.ImageButton")
    private AndroidElement button;

    public InitPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(this.driver, 30);
    }

    public void clickNextButton(){
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
    }

    public void clickContinueButton(){
        wait.until(ExpectedConditions.elementToBeClickable(continueButton));
        continueButton.click();
    }

    public void clickSkipButton(){
        wait.until(ExpectedConditions.elementToBeClickable(skipButton));
        skipButton.click();
    }

    public void clickButton(){
        wait.until(ExpectedConditions.elementToBeClickable(button));
        button.click();
    }
}
