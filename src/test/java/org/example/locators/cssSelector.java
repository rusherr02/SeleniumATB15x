package org.example.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.time.Duration;

public class cssSelector {
//    CSS Selectors are one of the **fastest and most versatile** ways to locate elements in Selenium.
//    They're faster than XPath and supported across all browsers. Why and How ?


//    driver.findElement(By.cssSelector("your_selector_here"));

//    ^= Starts with : [id^=btn-make-appointment]
//    $= Ends  with
//    *= Contains

// Ends with ( $= )
//     driver.findElement(By.cssSelector("input[id**$**='input']"));   // Matches: login-email-input



// Contains ( *= ) => driver.findElement(By.cssSelector("input[id*='email']")); // Matches: login-email-input
// Contains word in space-separated list ( ~= ) driver.findElement(By.cssSelector("input[class~='field_primary_active']"));
// Starts with value or value followed by hyphen ( |= )
//      driver.findElement(By.cssSelector("input[id|='login']")); // Matches: **login-**email-input

    @Test
    public void test_css_selector() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("http://localhost:8080/");
//        driver.wait();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath(""))
        );
//        WebElement closeModal = driver.findElement(By.cssSelector(".modal.modal-close"));
//        closeModal.click();

    }


}
