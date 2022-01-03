package com.qa.OpenCart.pages;

import com.qa.OpenCart.Utils.ElementUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class searchResultPage {
    private WebDriver driver;
        private ElementUtil el;
    private By searchItemResult= By.xpath("//div[@class='product-thumb']");
    private By resultItems=By.xpath("//div[@class='product-thumb']//h4//a");

    public searchResultPage(WebDriver driver){
        this.driver = driver;
        el=new ElementUtil(driver);
    }

    public int getProductResultCount(){
        return el.getElements(searchItemResult).size();
    }
    public ProductInfoPage selectProductFromResults(String productName){
        List<WebElement> resultItemList = el.getElements(resultItems);
        System.out.println("Total no. of items is "+resultItemList.size()+" and the product searched is "+productName);
        for(WebElement e : resultItemList){
            if(e.getText().equals(productName)){
                e.click();
                break;
            }
        }
        return new ProductInfoPage(driver);
    }
}
