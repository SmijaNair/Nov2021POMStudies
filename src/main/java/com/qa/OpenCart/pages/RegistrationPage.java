package com.qa.OpenCart.pages;

import com.qa.OpenCart.Utils.Constants;
import com.qa.OpenCart.Utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class RegistrationPage {
    //private By locators
    private WebDriver driver;
    private ElementUtil el;
    private By firstName = By.name("firstname");
    private By lastName = By.name("lastname");
    private By email=By.name("email");
    private By telephone = By.name("telephone");
    private By password = By.name("password");
    private By confirm = By.name("confirm");
    private By radioButtonYes = By.xpath("(//label[@class='radio-inline'])[1]");
    private By radioButtonNo = By.xpath("(//label[@class='radio-inline'])[2]");
    private By checkBox = By.xpath("//input[@type='checkbox']");
    private By submitBtn = By.xpath("//input[@type='submit']");
    private By successMsg = By.xpath("//div[@id='content']/h1");
    private By logOutLink = By.linkText("Logout");
    private By registrationLink = By.linkText("Register");

    public RegistrationPage(WebDriver driver){
        el = new ElementUtil(driver);
        this.driver=driver;
    }
    public Boolean accountRegistration(String fname,String lname,String emailid,String phone,String pwd,String radioButtonValue){
    el.doSendKeys(firstName,fname);
    el.doSendKeys(lastName,lname);
    el.doSendKeys(email,emailid);
    el.doSendKeys(telephone,phone);
    el.doSendKeys(password,pwd);
    el.doSendKeys(confirm,pwd);
    if(radioButtonValue.equals("Yes")){
        el.doClick(radioButtonYes);
    }else{
        el.doClick(radioButtonNo);
    }
    el.doClick(checkBox);
    el.doClick(submitBtn);
    String mesg = el.waitForVisibilityOfElement(successMsg,5000).getText();
    System.out.println("Success mesage is "+mesg);

    if(mesg.contains(Constants.REGISTRATIONSUCCESSMESSAGE)){
        el.doClick(logOutLink);
        el.doClick(registrationLink);
        //return should be the last statement
        return true;
    }
    return false;
    }
}
