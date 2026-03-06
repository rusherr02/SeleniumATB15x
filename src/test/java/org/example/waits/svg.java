package org.example.waits;

import io.qameta.allure.Description;
import org.example.CommonToAll;
import org.example.waitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestNG;
import org.testng.annotations.Test;

import java.util.List;

public class svg extends CommonToAll {

    //*[local-name()='svg']

    @Description("")
    @Test
    public void test_fk_svg_icon(){
        ChromeDriver driver = new ChromeDriver();
        openBrowser(driver, "https://www.flipkart.com/search");

        WebElement searchInputBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        searchInputBox.sendKeys("Macmini");
        searchInputBox.sendKeys(Keys.ENTER);

        List<WebElement> svgSearch = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgSearch.getFirst().click();

        waitHelpers.waitForVisibility(
                driver,10, "//div[contains(@data-id,\"CPU\")]"
        );

        List<WebElement> allTitles = driver.findElements(By.xpath(
                "//div[contains(@data-id,\"CPU\") or contains(@data-id,\"MP\")]/div/a[2]"
        ));

//        System.out.println(allTitles.getFirst().getText());
        for (WebElement title : allTitles) {
            System.out.println(title.getText());
        }


        closeBrowser(driver);
    }
}
