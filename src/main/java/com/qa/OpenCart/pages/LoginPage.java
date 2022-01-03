package com.qa.OpenCart.pages;

import com.qa.OpenCart.Utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    private WebDriver driver;
    private ElementUtil el;
    /*
    First thing here is
    1. We have to maintain By locators
    2. We have to create public constructor of the Page class
    3. Page Actions
     */
    //private By locators
    private By username = By.id("input-email");
    private By password = By.id("input-password");
    private By loginButton = By.xpath("//input[@type='submit']");
    private By forgotPwdLink = By.xpath("//div[@class='form-group']//a[text()='Forgotten Password']");
    private By registerLink = By.linkText("Register");

    //public Constructors
    public LoginPage(WebDriver driver){
        this.driver = driver;
        el=new ElementUtil(driver);
    }

    //Page Actions
    public String getLoginPageTitle(){
        //return driver.getTitle();

       return el.getTitle();
    }

    public String getLoginPageUrl(){
        return el.getUrl();
    }

    public Boolean isForgotPwdLinkExist(){
        return driver.findElement(forgotPwdLink).isDisplayed();
    }

    public AccountsPage Login(String un, String pwd){
        driver.findElement(username).sendKeys(un);
        driver.findElement(password).sendKeys(pwd);
        driver.findElement(loginButton).click();
        return new AccountsPage(driver);
    }

    public RegistrationPage  navigateToRegsterPage(){
        el.doClick(registerLink);
        return new RegistrationPage(driver);
    }
}
