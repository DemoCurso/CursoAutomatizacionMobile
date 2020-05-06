package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Properties;

public class DriverFactory {

    private static AppiumDriver driverMobile;

    /**
     * Obtiene las capabilities desde las properties
     */
    private static DesiredCapabilities readCapabilitiesFromProperties(Properties properties){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        for(Object key : properties.keySet())
            capabilities.setCapability(key.toString(), properties.getProperty(key.toString()));
        return capabilities;
    }

    /**
     * Inicializa el driver mobile pasandole las properties y la url de appium
     */
    private static AppiumDriver initializeMobileDriver(String urlAppium, Properties properties) throws MalformedURLException {
        DesiredCapabilities capsMobile = readCapabilitiesFromProperties(properties);
        System.out.println("Inicializa el appium driver apuntando a la URL de appium: ["+ urlAppium +"]");
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

    /**
     * Obtiene los parametros desde la linea de comandos.
     * Lee desde la linea de comandos solo los parametros que hagan match con las instrucciones System.getProperty("nombre_parametro_cli");
     */
    private static HashMap getParamsFromCommandLine(){

        String urlAppium = (System.getProperty("urlAppium") == null)? "http://0.0.0.0:4723/wd/hub" : System.getProperty("urlAppium");
        String propertiesFileName  = (System.getProperty("propertiesFileName") == null)? "default" : System.getProperty("propertiesFileName");

        HashMap params = new HashMap();
        params.put("urlAppium", urlAppium);
        params.put("propertiesFileName", propertiesFileName);
        return params;
    }

    /**
     * Lee las properties desde un archivo en el disco
     */
    private static Properties readPropertiesFromFile(String propertiesFileName) throws IOException {
        System.out.println("Read Capabilities From Properties File: " + propertiesFileName + ".properties");
        File propFileName = new File("src/test/resources/properties/"+ propertiesFileName +".properties").getAbsoluteFile();
        FileInputStream inputStream = new FileInputStream(propFileName);
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties;
    }

}
