package com.qa.OpenCart.pages;

import com.qa.OpenCart.Utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.text.Element;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AccountsPage {

    private ElementUtil el;
    //private By locator
    private WebDriver driver;
    private By accHeaders = By.xpath("//div[@id='content']/h2");
    private By header = By.cssSelector("div#logo a");
    private By logoutLink = By.linkText("Logout");
    private By searchBox = By.xpath("//input[@name='search' and @placeholder='Search']");
    private By searchIcon = By.xpath("//span[@class='input-group-btn']//button");



    public AccountsPage(WebDriver driver){
        //ElementUtil will be activated for this page
        this.driver=driver;
        el=new ElementUtil(driver);

    }
    public String getAccPageTitle(){
       // el.waitfortitle();
        return el.getTitle();
    }

    public String getAccPageUrl(){
        return el.getUrl();
    }

    public String getAccountPageHeader(){
       return el.doGetText(header);
    }

    public List<String> getAccountSectionsList(){
        List<String> accSectionValueList=new ArrayList<String>();
        List<WebElement> accSectionsList= el.waitForVisibilityOfElements(accHeaders,50);

        for(WebElement e : accSectionsList){
            accSectionValueList.add(e.getText());
        }
        Collections.sort(accSectionValueList);
        return accSectionValueList;
    }

    public Boolean isLogoutExist(){
        return el.doIsDisplayed(logoutLink);
    }

    public searchResultPage doSearch(String productName) throws InterruptedException {
        System.out.println("Searcing the product ..."+productName);
        el.doSendKeys(searchBox,productName);
        System.out.println("waiting after product nameis entered ");
        Thread.sleep(5000);
            driver.findElement(searchIcon).click();
            Thread.sleep(5000);
       // el.doClick(searchIcon);
        System.out.println("clicked ");
        return new searchResultPage(driver);
    }
}
