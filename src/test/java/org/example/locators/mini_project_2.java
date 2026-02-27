package org.example.locators;

import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class mini_project_2 {

    @Owner("Manav")
    @Severity(SeverityLevel.NORMAL)
    @TmsLink("")
    @Description("Verify Error Message for sign-up in trial")
    @Test
    public void test_sign_up_link() {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://vwo.com/free-trial/");
        driver.manage().window().maximize();

//        WebElement partial_trail = driver.findElement(By.partialLinkText("Start a free"));
//        partial_trail.click();

//        Assert.assertTrue(driver.getCurrentUrl().contains("free-trial"));


//        driver.switchTo();
        WebElement email = driver.findElement(By.id("page-v1-step1-email"));
        email.sendKeys("eneln");

        WebElement checkBox = driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkBox.click();

        WebElement create_account_btn = driver.findElement(By.tagName("button"));
        create_account_btn.click();


        WebElement err_msg = driver.findElement(By.className("invalid-reason"));
        System.out.println("**********************************************");
        System.out.println(err_msg.getText());


        driver.quit();


    }
}
