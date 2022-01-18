package com.qa.OpenCart.SeleniumScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class hashmapconcept {
    public static WebDriver driver;
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://classic.freecrm.com/index.html?e=1");
        //naveenautomation
        //Test@123
        By unfield = By.name("username");
        By pwdfield = By.name("password");


        System.out.println(details().get("newbie"));
        String un=details().get("newbie").split(":")[0];
        String pwd = details().get("newbie").split(":")[1];

        driver.findElement(unfield).sendKeys(un);
        driver.findElement(pwdfield).sendKeys(pwd);
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//input[@value='Login']")).click();
//        Thread.sleep(3000);
//        driver.quit();
    }
    public static HashMap<String,String>  details(){
        HashMap<String,String> hm = new HashMap<String,String>();
        hm.put("customer","naveenautomation:Test@123");
        hm.put("newbie","newbie:Test@1233");
        hm.put("oldie","oldie:Test!223");

        return hm;
    }
}
