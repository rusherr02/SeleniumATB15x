package org.example.select_alerts_radio;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class input_radio_checkbox extends CommonToAll {


    @Test
    public void test_input_radio_checkbox(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://awesomeqa.com/practice.html");

        WebElement fn = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        fn.sendKeys("John");





        closeBrowser(driver);



    }
}
