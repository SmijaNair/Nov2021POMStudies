package com.qa.OpenCart.pages;

import com.qa.OpenCart.Utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import javax.swing.text.Element;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductInfoPage {
    private WebDriver driver;
    private ElementUtil el;
    private By productHeader = By.cssSelector("div#content h1");
    private By productImages = By.cssSelector("ul.thumbnails li img");
    private By productMetaDeta = By.cssSelector("div#content ul.list-unstyled:nth-of-type(1) li");
    private By productPriceData = By.cssSelector("div#content ul.list-unstyled:nth-of-type(2) li");
    private By quantity = By.name("quantity");
    private By addToCartButton = By.id("button-cart");
    private By successMsg = By.cssSelector("div.alert.alert-success.alert-dismissible");


    public ProductInfoPage(WebDriver driver){
        this.driver = driver;
        el=new ElementUtil(driver);
    }

    public String getProductHeaderText(){
      return  el.doGetText(productHeader);
    }

    public int getProductImagesCount(){
        return el.getElements(productImages).size();
    }

    /*
    This method will collect the product meta data and pricing data information in the form of HashMap
    This will reutrn productInfoMap
     */

    public Map<String,String> getProductInformation(){
        Map<String,String> productInfoMap = new HashMap<String,String>();
        productInfoMap.put("name",getProductHeaderText());
        List<WebElement> metaDetaList = el.getElements(productMetaDeta);
        System.out.println("total product meta data is "+metaDetaList.size());

        //MetaData
        for(WebElement e : metaDetaList){
            String meta[] =e.getText().split(":");
            String metaKay =meta[0].trim();
            String metaValue =meta[1].trim();
            productInfoMap.put(metaKay,metaValue);
        }

        //pricing:
        List<WebElement> metaPriceList = el.getElements(productPriceData);
        System.out.println("total product size is "+metaPriceList.size());
        String actualPrice=metaPriceList.get(0).getText().trim();
        String Exprice = metaPriceList.get(1).getText().trim();

        productInfoMap.put("price",actualPrice);
        productInfoMap.put("ExTaxprice",Exprice);

        return productInfoMap;


    }

    public void selectQuantity(String qty){
        el.doSendKeys(quantity,qty);
    }

    public void addToCart(){
        el.doClick(addToCartButton);
    }

    public String getSuccessMessage(){
        return el.doGetText(successMsg);
    }
}
