package com.qa.OpenCart.SeleniumScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class imagecount {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://naukri.com");
        List<WebElement> imageCount = driver.findElements(By.tagName("a"));
        System.out.println(imageCount.size());
        for(WebElement e : imageCount){
            String imageLink = e.getText();
            if(!imageLink.isEmpty()){
            System.out.println(imageLink);}
        }
            driver.quit();
    }
}
