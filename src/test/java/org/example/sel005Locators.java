package org.example;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class sel005Locators {

    @Test
    public void test_app_vwo_com() throws InterruptedException {

        String text = "Your email, password, IP address or location did not match";

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://app.vwo.com/#/login");
        driver.manage().window().maximize();


        WebElement emailInput = driver.findElement(By.id("login-username"));
        emailInput.sendKeys("admin@admin.com");


        WebElement pwInput = driver.findElement(By.id("login-password"));
        pwInput.sendKeys("dndndnd");


        WebElement signInBtn = driver.findElement(By.id("js-login-btn"));
        signInBtn.click();

        Thread.sleep(3000);

        WebElement err_msg = driver.findElement(By.id("js-notification-box-msg"));
        System.out.println(
                "*****************************************************************************************************"
        );
        System.out.println(err_msg.getText());

        Assert.assertEquals(err_msg.getText(), text);

        driver.quit();
    }
}
