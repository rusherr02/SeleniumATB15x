package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Sel003 {
    public static void main(String[] args) {

        WebDriver driver = new FirefoxDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.manage().window().minimize();


        driver.quit();


    }
}
