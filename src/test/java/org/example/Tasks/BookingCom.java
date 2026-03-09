package org.example.Tasks;

import org.example.CommonToAll;
import org.example.waitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BookingCom extends CommonToAll {

    @Test
    public void TestSpiceJet() {

        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://www.booking.com/");

        WebElement dismissPopUp = driver.findElement(By.xpath("//button[@aria-label=\"Dismiss sign in information.\"]"));
        waitHelpers.waitForVisibility(driver,"//button[@aria-label=\"Dismiss sign in information.\"]");
        dismissPopUp.click();

//        Click on Flights

        WebElement flights = driver.findElement(By.id("flights"));
        flights.click();



        WebElement LeavingFrom = driver.findElement(By.xpath("//button[@data-ui-name=\"input_location_from_segment_0\"]"));
        waitHelpers.waitForVisibility(driver, "//button[@data-ui-name=\"input_location_from_segment_0\"]");

        WebElement GoingTo = driver.findElement(By.xpath("//button[@data-ui-name=\"input_location_to_segment_0\"]"));

//        LeavingFrom.click();
//        WebElement removeCrossSvg = driver.findElement(By.xpath("//button[.//span[contains(text(),'Indore')]]//*[name()='svg']"));
//        removeCrossSvg.click();



        Actions action = new Actions(driver);
        action.moveToElement(GoingTo).sendKeys(GoingTo, "DEL").keyDown(Keys.TAB).keyUp(Keys.ENTER).perform();

        waitHelpers.waitForJVM(10000);

        WebElement searchBtn = driver.findElement(By.xpath("data-ui-name=\"button_search_submit\""));
        searchBtn.click();

        waitHelpers.waitForJVM(5000);

        closeBrowser(driver);
    }
}
