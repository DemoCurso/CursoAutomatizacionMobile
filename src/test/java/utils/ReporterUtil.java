package utils;

import com.cucumber.listener.Reporter;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ReporterUtil {

    public static final String PATH_SCREENSHOTS = "/src/test/resources/reportes/screenshots/";

    public static void addScreenshot(WebDriver driver, String fileName){
        try {
            String current_dateTime = new SimpleDateFormat("dd-MM-YYYY_hh-mm-ss").format(new Date());
            String fullFileName = System.getProperty("user.dir") + PATH_SCREENSHOTS + fileName + "_" + current_dateTime + ".jpg";
            Thread.sleep(2000);
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File path = new File(fullFileName);
            FileUtils.copyFile(screenshot, path);
            Reporter.addScreenCaptureFromPath(path.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
