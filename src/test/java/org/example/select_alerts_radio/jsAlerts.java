package org.example.select_alerts_radio;

import org.example.CommonToAll;
import org.example.waitHelpers;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class jsAlerts extends CommonToAll {


    @Test
    public void TestJsAlerts() {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://the-internet.herokuapp.com/javascript_alerts");


        WebElement ele = driver.findElement(By.xpath("//button[@onclick=\"jsAlert()\"]"));
        WebElement ele2 = driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]"));

        WebElement ele3 = driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]"));
        ele3.click();

        waitHelpers.waitForAlert(driver);


        Alert alert = driver.switchTo().alert();
        alert.sendKeys("test");
        alert.accept();


        String res = driver.findElement(By.id("result")).getText();
//        Assert.assertEquals(res, "You successfully clicked an alert");
        System.out.println(res);

        closeBrowser(driver);

    }
}
