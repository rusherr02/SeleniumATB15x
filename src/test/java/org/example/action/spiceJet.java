package org.example.action;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class spiceJet extends CommonToAll {

    @Test
    public void TestSpiceJet() {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://www.spicejet.com/");

        WebElement origin = driver.findElement(By.xpath("//div[@data-testid='to-testID-origin']/div/div/input"));


        WebElement destination = driver.findElement(By.xpath("//div[@data-testid='to-testID-destination']/div/div/input"));

        Actions action = new Actions(driver);
        action.moveToElement(origin).sendKeys("BLR").
                moveToElement(destination).sendKeys("DEL").perform();



        closeBrowser(driver);
    }
}
