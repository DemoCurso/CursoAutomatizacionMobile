package utils;


import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "definitions",
        plugin = {
                "pretty",
                "com.cucumber.listener.ExtentCucumberFormatter:"
        }
)
public class RunnerTest {

    @BeforeClass
    public static void setupPath(){
        String reportPath = "src/test/resources/reportes/html/";
        String reportName = "Reporte_Automatizacion_" + new SimpleDateFormat("dd-MM-YYYY_hh-mm-ss").format(new Date()) + ".html";
        ExtentProperties extentProperties = ExtentProperties.INSTANCE;
        extentProperties.setReportPath(reportPath + reportName);
    }

    @AfterClass
    public static void setup(){
        Reporter.loadXMLConfig(new File("src/test/resources/reportes/config/extent-config.xml"));
        Reporter.setSystemInfo("Nombre Proyecto","Curso Automatizacion");
        Reporter.setSystemInfo("Zona Horaria", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Ubicacion Usuario", System.getProperty("user.country"));
        Reporter.setSystemInfo("Nombre SO", System.getProperty("os.name"));
    }

}
