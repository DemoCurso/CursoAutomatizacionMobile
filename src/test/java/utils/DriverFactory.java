package utils;

import io.appium.java_client.AppiumDriver;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class DriverFactory {

    private static AppiumDriver driverMobile;
    private static final Logger logger = LogManager.getLogger(DriverFactory.class);

    private static DesiredCapabilities readCapabilitiesFromProperties(Properties properties){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        for(Object key : properties.keySet())
            capabilities.setCapability(key.toString(), properties.getProperty(key.toString()));
        return capabilities;
    }

    private static AppiumDriver initializeMobileDriver(String urlAppium, Properties properties) throws MalformedURLException {
        DesiredCapabilities capsMobile = readCapabilitiesFromProperties(properties);
        logger.debug("Inicializa el appium driver apuntando a la URL de appium: ["+ urlAppium +"]");
        driverMobile = new AppiumDriver(new URL(urlAppium), capsMobile);
        //driverMobile.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driverMobile;
    }

    /**
     * Recibe la URL de Appium y el archivo properties con las capabilities a usar desde parametros pasados al metodo
     */
    public static AppiumDriver createMobileDriver(String urlAppium, Properties capabilities) throws MalformedURLException {
        return initializeMobileDriver(urlAppium, capabilities);
    }

    /**
     * Obtiene la URL de Appium y el nombre del archivo properties con las capabilities a usar desde parametros pasados
     * en la linea de comandos como se ve en el siguiente ejemplo:
     * mvn clean test -DurlAppium="http://0.0.0.0:4725/wd/hub" -DpropertiesFileName="SAMSUNG_S8_QA_1"
     */
    public static AppiumDriver createMobileDriver() throws IOException {
        HashMap params = getParamsFromCommandLine();
        Properties properties = readPropertiesFromFile(params.get("propertiesFileName").toString());
        return initializeMobileDriver(params.get("urlAppium").toString(), properties);
    }

    private static HashMap getParamsFromCommandLine(){ //inline condition
        String urlAppium           = (System.getProperty("urlAppium") == null)? "http://0.0.0.0:4723/wd/hub" : System.getProperty("urlAppium");
        String propertiesFileName  = (System.getProperty("propertiesFileName") == null)? "default" : System.getProperty("propertiesFileName");
        HashMap params = new HashMap<>();
        params.put("urlAppium", urlAppium);
        params.put("propertiesFileName", propertiesFileName);
        return params;
    }

    private static Properties readPropertiesFromFile(String propertiesFileName) throws IOException {
        logger.debug("Read Capabilities From Properties File: " + propertiesFileName + ".properties");
        File propFileName = new File("src/test/resources/properties/"+ propertiesFileName +".properties").getAbsoluteFile();
        FileInputStream inputStream = new FileInputStream(propFileName);
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties;
    }














}
