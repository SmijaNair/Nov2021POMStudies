package com.qa.OpenCart.Base;

import com.qa.OpenCart.Utils.ElementUtil;
import com.qa.OpenCart.factory.driverFactory;
import com.qa.OpenCart.pages.*;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.Properties;

public class BaseTest {
    driverFactory df;
    public WebDriver driver;
    public LoginPage lp;
    public Properties prop;
    public AccountsPage ap;
    public searchResultPage sp;
    public ProductInfoPage pp;
    public RegistrationPage rp;

    @BeforeTest
    public void setUp(){
        df=new driverFactory();
        prop=df.init_prop();
        driver = df.init_driver(prop);
        lp = new LoginPage(driver);
        pp= new ProductInfoPage(driver);
       rp = new RegistrationPage(driver);

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }

}
