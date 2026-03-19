package org.example.action;

import org.example.CommonToAll;
import org.example.waitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.List;

public class mmt extends CommonToAll {

    @Test
    public void test_mmmt() {

        WebDriver driver = new FirefoxDriver();
        openBrowser(driver, "https://www.makemytrip.com/");


        waitHelpers.waitForVisibility(driver, 10, "//span[@data-cy='closeModal']");
        WebElement signupModel = driver.findElement(By.xpath("//span[@data-cy='closeModal']"));
        signupModel.click();

        waitHelpers.waitForVisibility(driver, 10, "//img[@alt=\"minimize\"]");
        WebElement myra = driver.findElement(By.xpath("//img[@alt=\"minimize\"]"));
        myra.click();

        // remove transparent layer
        WebElement bg = driver.findElement(By.tagName("body"));
        bg.click();


        WebElement fromCity = driver.findElement(By.xpath("//input[@data-cy=\"fromCity\"]"));


        Actions action = new Actions(driver);
        action.moveToElement(fromCity).click().perform();
        action.moveToElement(fromCity).click().sendKeys("IXC").perform();


        try{
            List<WebElement> list_auto_complete_dd = driver.findElements(By.xpath(
                    "//span[@class='revampedCityName']"));

            for(WebElement auto_complete : list_auto_complete_dd){
                if(auto_complete.getText().contains("Chandigarh")){
                    auto_complete.click();
                }
            }

        }catch(Exception e){
            System.out.println(e.getMessage());
        }





        closeBrowser(driver);


    }

}
