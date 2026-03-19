package org.example.windowHandle;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class windowHOne extends CommonToAll {

    @Test
    public void windowHOne_Iframe(){

        // iframe = website within website
        WebDriver driver = new FirefoxDriver();
        openBrowser(driver, "https://codepen.io/AbdullahSajjad/full/LYGVRgK");


        driver.switchTo().frame("result");
        driver.findElement(By.id("username")).sendKeys("Manav");

        driver.switchTo().parentFrame();


        // all way back to main page
//        driver.switchTo().defaultContent();



        closeBrowser(driver);





    }
}
