package org.example.Tasks;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class katalan_ {

    @Owner("Manav")
    @Description("Verify Katalon Login")
    @Test
    public void test_katalan() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
        driver.manage().window().maximize();

        // Click on make appointment
        WebElement make_app_btn = driver.findElement(By.id("btn-make-appointment"));
        make_app_btn.click();

        WebElement username = driver.findElement(By.id("txt-username"));
        username.sendKeys("John Doe");

        WebElement password = driver.findElement(By.id("txt-password"));
        password.sendKeys("ThisIsNotAPassword");

        WebElement login_btn = driver.findElement(By.id("btn-login"));
        login_btn.click();

        Thread.sleep(3000);

        Assert.assertEquals(driver.getCurrentUrl(), "https://katalon-demo-cura.herokuapp.com/#appointment");
        String Title_MakeApp = driver.findElement(By.tagName("h2")).getText();
        Assert.assertEquals(Title_MakeApp, "Make Appointment");

        driver.quit();
    }
}
