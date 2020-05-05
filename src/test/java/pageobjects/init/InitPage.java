package pageobjects.init;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.annotation.Nullable;
import java.util.function.Predicate;

public class InitPage {

    private AppiumDriver driver;
    private Wait wait;

    @FindBy(id = "com.truecaller:id/nextButton")
    private AndroidElement nextButton;

    @FindBy(id = "android:id/button1")
    private AndroidElement continueButton;

    @FindBy(id = "com.truecaller:id/button_skip")
    private AndroidElement skipButton;

    @FindBy(xpath = "//android.widget.TextView[@resource-id='com.truecaller:id/title' and contains(@text,'Premium')]")
    private AndroidElement premiunTitle;

    public InitPage(AppiumDriver driver){
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
        wait = new WebDriverWait(this.driver, 30).ignoring(StaleElementReferenceException.class);
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

    public String getPremiumTitle(){
        wait.until(ExpectedConditions.visibilityOf(premiunTitle));
        return premiunTitle.getText();
    }
}
