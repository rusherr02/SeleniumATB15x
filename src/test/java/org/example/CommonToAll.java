package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CommonToAll extends waitHelpers{

//    open Browser, close Browser, click

    public ChromeDriver driver;

    public void openBrowser(WebDriver driver, String url) {
        driver.navigate().to(url);
        driver.manage().window().maximize();
    }

    public void closeBrowser(WebDriver driver) {
        driver.quit();
    }



    public void clickElement(WebDriver driver, String xpath) {
        WebElement ele = driver.findElement(By.xpath(xpath));
        ele.click();
    }







}
