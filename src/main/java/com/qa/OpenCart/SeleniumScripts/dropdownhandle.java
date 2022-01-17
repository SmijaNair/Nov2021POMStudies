package com.qa.OpenCart.SeleniumScripts;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class dropdownhandle {
    public static WebDriver driver;
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
        By country= By.id("Form_submitForm_Country");
        Select sel = new Select(driver.findElement(country));
        System.out.println(driver.findElement(country).isDisplayed());
//        sel.selectByIndex(3);
//        sel.selectByVisibleText("Andorra");
//        sel.selectByValue("Angola");
        List<WebElement> allOptions = sel.getOptions();
        System.out.println(allOptions);
        for(WebElement e : allOptions){
            System.out.println(e.getText());
            String text = e.getText();
            if(text.equals("Chile")){
                e.click();
            }
        }

    }
}
