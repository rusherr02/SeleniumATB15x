package org.example.action;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class actionClasses  extends CommonToAll {

    @Test
    public void TestActionClasses() {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://awesomeqa.com/practice.html");

        WebElement fn = driver.findElement(By.xpath("//input[@name=\"firstname\"]"));
        fn.sendKeys(Keys.SHIFT, "john");

        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT).sendKeys(fn, "John").keyUp(Keys.SHIFT).perform();

        closeBrowser(driver);
    }
}
