package com.qa.OpenCart.Tests;

import com.qa.OpenCart.Base.BaseTest;
import com.qa.OpenCart.Utils.Constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Example extends BaseTest {
    @Test(priority=1)
    public void loginPageTitleTest(){
        String title = lp.getLoginPageTitle();
        System.out.println("The title is "+title);
        Assert.assertEquals(title, "Account Login","actual and expected do not match");
    }

    @Test(priority=2)
    public void loginPageUrlTest(){
        String url = lp.getLoginPageUrl();
        System.out.println("The url is "+url);
        Assert.assertTrue(url.contains(Constants.LOGIN_PAGE_URL));
    }
}
