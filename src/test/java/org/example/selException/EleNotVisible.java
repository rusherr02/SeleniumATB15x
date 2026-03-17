package org.example.selException;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class EleNotVisible extends CommonToAll {


    @Test
    public void one_stale_element_exception() {
        try {
            WebDriver driver = new ChromeDriver();
            openBrowser(driver, "https://google.com");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("APjFQb")));

//            WebElement searchInputBox = driver.findElement(By.id("APjFqb"));


        } catch (ElementNotInteractableException e) {
            System.out.println("TimeOut"+ e.getMessage());
        }

    }
}
