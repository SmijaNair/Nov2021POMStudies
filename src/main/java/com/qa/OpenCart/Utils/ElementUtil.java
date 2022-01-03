package com.qa.OpenCart.Utils;

import com.qa.OpenCart.factory.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ElementUtil {
    //Never create ur driver as static inside the utility
    private WebDriver driver;
    public ElementUtil(WebDriver driver) {
        this.driver=driver;

    }


    public WebElement getElement(By locator) {
        WebElement ele=driver.findElement(locator);
        if(Boolean.parseBoolean(driverFactory.highlight)){

        }
        return ele;

    }
    public List<WebElement> getElements(By locator) {
        return driver.findElements(locator);
    }
    //parallel testing is not possible if we use static for these methods.
    public  void doSendKeys(By locator,String value) {
        WebElement ele = getElement(locator);
        ele.clear();
        ele.sendKeys(value);

    }
    public void doClick(By locator) {
        getElement(locator).click();
    }
    public String doGetText(By locator) {
        return getElement(locator).getText();
    }

    public Boolean doIsDisplayed(By locator) {
        return getElement(locator).isDisplayed();
    }

    public void waitfortitle(){

    }


    public List<WebElement> waitForVisibilityOfElements(By locator, int timeOut){
        WebDriverWait wait = new WebDriverWait(driver,timeOut);
        return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
    }

    public WebElement waitForVisibilityOfElement(By locator, int timeOut){
        WebDriverWait wait = new WebDriverWait(driver,timeOut);
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public List<String> getElementsTextList(By locator) {
        List <WebElement> eleList = getElements(locator);
        List<String> eleTextList= new ArrayList<String>();
        for(WebElement e : eleList) {
            if(!e.getText().isEmpty()) {
                eleTextList.add(e.getText());

            }

        }
        return eleTextList;
    }

    public void doSelectDropDownValueByIndex(By locator, int index) {
        Select sel = new Select(getElement(locator));
        sel.selectByIndex(index);
    }

    public void doSelectDropDownValueByVisibleText(By locator, String text) {
        Select sel = new Select(getElement(locator));
        sel.selectByVisibleText(text);
    }
    public void doSelectDropDownValueByValue(By locator, String value) {
        Select sel = new Select(getElement(locator));
        sel.selectByVisibleText(value);
    }

    public void doSelectDropDownValue(By locator, String value) {
        Select select = new Select(getElement(locator));
        List<WebElement> optionsList = select.getOptions();
        for(WebElement e:optionsList) {
            if(e.getText().equals(value)) {
                e.click();
                break;
            }
            System.out.println(e.getText());
        }
    }

    public void doSelectDropDownValueWithoutSelect(By locator,String value) {
        //List<WebElement> list = driver.findElements(By.xpath("//select[@id='Form_submitForm_Country']/option"));
        List<WebElement> list = getElements(locator);
        for(WebElement e:list) {
            if(e.getText().equals(value)) {
                e.click();
                break;
            }
        }
    }


    public  String switchToWindowAndGetTitle(String windowId) {
        driver.switchTo().window(windowId);
        String title = driver.getTitle();
        return title;
    }

    public  String switchToWindowAndGetUrl(String windowId) {
        driver.switchTo().window(windowId);
        String title = driver.getCurrentUrl();
        return title;
    }
    public  String getTitle(){
        return driver.getTitle();
    }

    public String getUrl(){
        return driver.getCurrentUrl();
    }
//    public static void rightClickoptions(By locator,String value) {
//        List<WebElement> options = driver.findElements(locator);
//        for(WebElement e:options) {
//            String option = e.getText();
//            if(option.equals(value)) {
//                e.click();
//                break;
//            }
//        }
//    }

    public  void doActionSendKeys(By locator,String value) {
        Actions act = new Actions(driver);
        act.sendKeys(getElement(locator),value).perform();
    }
    public  void doActionClick(By locator) {
        Actions act = new Actions(driver);
        act.click(getElement(locator)).perform();
    }
}
