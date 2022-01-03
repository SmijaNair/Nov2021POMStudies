//package com.qa.OpenCart.Tests;
//
//import com.qa.OpenCart.Base.BaseTest;
//import org.testng.annotations.BeforeClass;
//import org.testng.annotations.Test;
//
//public class searchResultPageTest extends BaseTest {
//
//    @BeforeClass
//    public void beforesearchPage()  {
//        ap=lp.Login(prop.getProperty("username"),prop.getProperty("password"));
//        sp=ap.searchResult("imac");
//    }
//
//    @Test
//    public void checkonSearchedProductsize()  {
//        int productcount=sp.getProductResultCount("imac");
//        System.out.println("The product count is "+productcount);
//
//    }
//
//    @Test
//    public void clickonSearchedProduct()  {
//        sp.selectProductFromResults("imac");
//    }
//}
