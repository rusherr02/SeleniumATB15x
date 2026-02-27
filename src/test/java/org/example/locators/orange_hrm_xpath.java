package org.example.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class orange_hrm_xpath {


    @Test
    public void test_orange_hrm_xpath() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://awesomeqa.com/hr/web/index.php/auth/login");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.xpath("//input[@name='username']"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
        password.sendKeys("Hacker@4321");

        WebElement login_btn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        login_btn.click();


        Thread.sleep(3000);
        WebElement h6 = driver.findElement(By.xpath("//span[@class='oxd-topbar-header-breadcrumb']/h6"));
        Assert.assertEquals(h6.getText(),"PIM");


        driver.quit();

    }
}
