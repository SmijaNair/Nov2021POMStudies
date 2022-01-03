package com.qa.OpenCart.Tests;

import com.qa.OpenCart.Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Map;

public class ProductInfoPageTest extends BaseTest {

    @BeforeClass
    public void setUpProductInfo(){
        ap=lp.Login(prop.getProperty("username"),prop.getProperty("password"));

    }

    @Test
    public void productCountTest() throws InterruptedException {
        sp=ap.doSearch("iMac");
        int count = sp.getProductResultCount();
        System.out.println(count +"count is ");
        Assert.assertTrue(count==3);
        Thread.sleep(30000);


    }

    @Test
    public void selectProduct() throws InterruptedException {
        sp=ap.doSearch("iMac");
        pp=sp.selectProductFromResults("iMac");
//        Assert.assertEquals(pp.getProductHeaderText(),"iMac");
        Thread.sleep(5000);
       String header = pp.getProductHeaderText();
       System.out.println(header+" herader is ");
    }

    @Test
    public void selectImages() throws InterruptedException {
        sp=ap.doSearch("Macbook");
        pp=sp.selectProductFromResults("MacBook");
        Map<String,String> actProductMetaData = pp.getProductInformation();
        actProductMetaData.forEach((k,v)-> System.out.println(k+":"+v ));
    }
}
