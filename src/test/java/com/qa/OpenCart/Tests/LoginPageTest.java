package com.qa.OpenCart.Tests;

import com.qa.OpenCart.Base.BaseTest;
import com.qa.OpenCart.Utils.Constants;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {


    @Test(priority=1)
    public void loginPageTitleTest(){
        String title = lp.getLoginPageTitle();
        System.out.println("The title is "+title);
        Assert.assertEquals(title,Constants.LOGIN_PAGE_TITLE);
    }

    @Test(priority=2)
    public void loginPageUrlTest(){
        String url = lp.getLoginPageUrl();
        System.out.println("The url is "+url);
        Assert.assertTrue(url.contains(Constants.LOGIN_PAGE_URL));
        }

//        @Test(priority=3)
//        public void forgotPwdLinkTest(){
//        Boolean forgotPresent=lp.isForgotPwdLinkExist();
//        Assert.assertTrue(forgotPresent);
//        }

        @Test(priority=4)
        public void loginTest(){
        lp.Login(prop.getProperty("username"),prop.getProperty("password"));
        }

}
