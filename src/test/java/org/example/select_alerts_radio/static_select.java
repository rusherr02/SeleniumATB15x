package org.example.select_alerts_radio;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class static_select extends CommonToAll {

    @Test
    public void Test_select(){

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://the-internet.herokuapp.com/dropdown");

        WebElement ele = driver.findElement(By.id("dropdown"));
        Select select = new Select(ele);
        select.selectByVisibleText("Option 1");

        closeBrowser(driver);
    }
}
