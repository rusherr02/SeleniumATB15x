package org.example.selException;

import org.example.CommonToAll;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class one_stale_element_exce extends CommonToAll {


    @Test
    public void one_stale_element_exception() {
        try {
            WebDriver driver = new ChromeDriver();
            openBrowser(driver, "https://google.com");
            WebElement searchInputBox = driver.findElement(By.id("APjFqb"));
            driver.navigate().refresh(); // HTML page (DOM) is now refreshed,
            // Driver will think that, element may or may not be available now.
            // I have found the ele, before refresh
            //
//            searchInputBox.sendKeys("Samsung");

            searchInputBox = driver.findElement(By.id("APjFqb"));
            searchInputBox.sendKeys("Samsung");

            closeBrowser(driver);
        } catch (StaleElementReferenceException e) {
            System.out.println("StaleElementReferenceException"+ e.getMessage());
        }catch (NullPointerException e){
            System.out.println("NullPointerException"+ e.getMessage());
        }

        closeBrowser(driver);
    }
}
