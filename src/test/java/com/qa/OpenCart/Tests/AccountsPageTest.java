package com.qa.OpenCart.Tests;

import com.qa.OpenCart.Base.BaseTest;
import com.qa.OpenCart.Utils.Constants;
import com.qa.OpenCart.Utils.Error;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Collections;
import java.util.List;

public class AccountsPageTest extends BaseTest {

    //Create the AccountsPageTest object in BaseTest instead of in the respective page class
    @BeforeClass
    public void accountPageSetUp(){
       // this.driver=driver;
        ap = lp.Login(prop.getProperty("username"),prop.getProperty("password"));

       // ap=new AccountsPage(driver);
    }
    @Test
    public void accPageTitleTest(){
    String title = ap.getAccPageTitle();
    System.out.println("Account page title is "+title);
        Assert.assertEquals(title, Constants.ACCOUNT_PAGE_TITLE,Error.ACC_PAGE_TITLE_ERROR);
    }

    @Test
    public void accPageHeaderTest(){
        String header = ap.getAccountPageHeader();
        System.out.println(header);
        Assert.assertEquals(header,Constants.ACCOUNT_PAGE_HEADER,Error.ACC_PAGE_URL_ERROR);

    }
    @Test
    public void accSectionListTest(){
        List<String> sectionList =ap.getAccountSectionsList();
        sectionList.stream().forEach(e -> System.out.println(e));
        //how will you verify list in TestNG
        Collections.sort(Constants.EXP_ACC_SECTION_LIST);
        Assert.assertEquals(sectionList,Constants.EXP_ACC_SECTION_LIST,"not matchin");
    }


}
