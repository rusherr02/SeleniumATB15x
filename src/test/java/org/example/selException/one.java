package org.example.selException;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class one extends CommonToAll {


    @Test
    public void one_exception() {
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://app.vwo.com");

        try {
            driver.findElement(By.id("abc"));
        } catch (NoSuchElementException e) {
            System.out.println("************* : " + e.getMessage());


        }

        closeBrowser(driver);
    }
}
