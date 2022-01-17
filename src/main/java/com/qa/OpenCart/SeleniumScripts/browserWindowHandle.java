package com.qa.OpenCart.SeleniumScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class browserWindowHandle {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://opensource-demo.orangehrmlive.com/");
        By linkedin = By.xpath("//img[@alt='LinkedIn OrangeHRM group']");
        By fb = By.xpath("//img[@alt='OrangeHRM on Facebook']");
        By twitter = By.xpath("//img[@alt='OrangeHRM on twitter']");
        By youtube = By.xpath("//img[@alt='OrangeHRM on youtube']");
        driver.findElement(linkedin).click();
        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String parent = it.next();
        String child = it.next();
        driver.switchTo().window(child);
        System.out.println(driver.getTitle());
        driver.switchTo().window(parent);
        System.out.println(driver.getTitle());
//        driver.switchTo().window(it.next());
//        System.out.println(driver.getTitle());
//        driver.switchTo().defaultContent();
//        System.out.println(driver.getTitle());
//        driver.switchTo().defaultContent();
//        System.out.println(driver.getTitle());
//        Set<String> windowHandles = driver.getWindowHandles();
//        Iterator<String> it = windowHandles.iterator();
//        String parent = it.next();
//        System.out.println(parent);
//        String child = it.next();
//        System.out.println(child);

    }
}
