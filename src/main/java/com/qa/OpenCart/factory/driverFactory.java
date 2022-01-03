package com.qa.OpenCart.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Locale;
import java.util.Properties;

/**
 * browserName
 * @returnn This method will return WebDriver
 */
public class driverFactory {

    WebDriver driver;
    Properties prop;
    public static  String highlight = null;
    public static ThreadLocal<WebDriver> tlDriver = new ThreadLocal<WebDriver>();

    public WebDriver init_driver(Properties prop){
        String browserName = prop.getProperty("browser");
        System.out.println("The browser is "+browserName);
        if(browserName.equals("chrome")){
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else  if(browserName.equals("firefox")){
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else   if(browserName.equals("safari")){
            driver = new SafariDriver();
        }
        else
            System.out.println("Please pass the correct browser");
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        //driver.get("https://demo.opencart.com/index.php?route=account/login");
        driver.get(prop.getProperty("url"));

        return driver;
    }

    public synchronized WebDriver getDriver() {
        return tlDriver.get();
    }
    /*
    This method will return Properties object.
    It does not take any input parameter
     */

    public Properties init_prop()  {
        FileInputStream ip =null;
        String env=System.getProperty("env");
        System.out.println("environment is "+env);

        if(env==null){
            try {
                 ip = new FileInputStream("./src/test/resources/config/config.properties");
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("environment is "+env);

            try {
                switch (env){
                case "stg":
                     ip = new FileInputStream("./src/test/resources/config/config_stg.properties");
                    break;
                    case "prod":
                         ip = new FileInputStream("./src/test/resources/config/config_prod.properties");
                         break;
                    case "dev":
                        ip = new FileInputStream("./src/test/resources/config/config.properties");
                        break;


                }}
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }

        prop=new Properties();
        try {
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {

        }
        return prop;
    }

   
    public String getScreenshot() {
        File srcFile = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
        String path = System.getProperty("user.dir") + "/screenshot/" + System.currentTimeMillis() + ".png";
        File destination = new File(path);
        try {
            FileUtils.copyFile(srcFile, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return path;
    }


}
