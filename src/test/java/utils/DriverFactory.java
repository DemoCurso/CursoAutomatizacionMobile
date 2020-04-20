package utils;

import io.appium.java_client.*;
import org.openqa.selenium.remote.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class DriverFactory {

    private static AppiumDriver         driverMobile;
    private static DesiredCapabilities  capsMobile;
    private static String               urlAppium;
    private static String               propertiesFileName;
    private static Properties           properties;


    /**
     * Obtiene la URL de Appium y el nombre del archivo properties con las capabilities a usar
     * desde parametros pasados en la linea de comandos con las opciones:
     * -DurlAppium=http://0.0.0.0:4723/wd/hub
     * -DpropertiesFileName=SAMSUNG_S8
     * Usa estos parametros para crear el driver de appium
     * @return AppiumDriver
     * @throws IOException
     */
    public static AppiumDriver createDriverMobile() throws IOException {
        System.out.println("Create Driver Mobile");
        getParamsFromCommandLine();
        properties = readPropertiesFromFile(propertiesFileName);
        capsMobile = readCapabilitiesFromProperties(properties);
        driverMobile = new AppiumDriver(new URL(urlAppium), capsMobile);
        driverMobile.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driverMobile;
    }


    /**
     * Recibe la URL de Appium y el archivo properties con las capabilities a usar
     * desde parametros pasados al metodo
     * Usa estos parametros para crear el driver de appium que retorna
     * @param urlAppium
     * @param capabilities
     * @return AppiumDriver
     * @throws MalformedURLException
     */
    public static AppiumDriver createDriverMobile(String urlAppium, Properties capabilities) throws MalformedURLException {
        System.out.println("Create Driver Mobile with properties");
        DriverFactory.urlAppium = urlAppium;
        capsMobile = readCapabilitiesFromProperties(capabilities);
        driverMobile = new AppiumDriver(new URL(urlAppium), capsMobile);
        driverMobile.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        return driverMobile;
    }


    public static AppiumDriver getDriverMobile(){
        return driverMobile;
    }


    private static void getParamsFromCommandLine(){
        urlAppium           = (System.getProperty("urlAppium") == null)? "http://0.0.0.0:4723/wd/hub" : System.getProperty("urlAppium");
        propertiesFileName  = (System.getProperty("propertiesFileName") == null)? "default" : System.getProperty("propertiesFileName");
    }

    private static DesiredCapabilities readCapabilitiesFromProperties(Properties properties){
        DesiredCapabilities capabilities = new DesiredCapabilities();
        for(Object key : properties.keySet())
            capabilities.setCapability(key.toString(), properties.getProperty(key.toString()));
        return capabilities;
    }

    private static Properties readPropertiesFromFile(String propertiesFileName) throws IOException {
        System.out.println("Read Capabilities From Properties File: " + propertiesFileName + ".properties");
        File propFileName = new File("src/test/resources/properties/"+ propertiesFileName +".properties").getAbsoluteFile();
        FileInputStream inputStream = new FileInputStream(propFileName);
        Properties properties = new Properties();
        properties.load(inputStream);
        return properties;
    }

}
