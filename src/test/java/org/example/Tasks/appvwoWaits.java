package org.example.Tasks;

import io.qameta.allure.internal.shadowed.jackson.annotation.JsonTypeInfo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class appvwoWaits {

    @Test
    public void TestAppWwoWaits() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://app.vwo.com/#/login");


        WebElement email = driver.findElement(By.id("login-username"));
        email.sendKeys("admin@admin.com");

        WebElement password = driver.findElement(By.id("login-password"));
        password.sendKeys("admin");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"js-login-btn\"]"))
        );

        WebElement login = driver.findElement(By.xpath("//button[@id=\"js-login-btn\"]"));
        login.click();

        wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.id("js-notification-box-msg"))
        );;
        String notification = driver.findElement(By.id("js-notification-box-msg")).getText();

        Assert.assertEquals(notification, "Your email, password, IP address or location did not match");

        driver.quit();



    }
}
