package org.example.Tasks;

import io.qameta.allure.Description;
import org.example.CommonToAll;
import org.example.waitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class svg_fk_task extends CommonToAll {

    //*[local-name()='svg']

    @Description("")
    @Test
    public void test_fk_svg_icon(){
        WebDriver driver = new ChromeDriver();
        openBrowser(driver, "https://www.flipkart.com/search");

//        driver.navigate().refresh();.

        WebElement searchInputBox = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        searchInputBox.sendKeys("Macmini");
        searchInputBox.sendKeys(Keys.ENTER);

        List<WebElement> svgSearch = driver.findElements(By.xpath("//*[local-name()='svg']"));
        svgSearch.getFirst().click();

        waitHelpers.waitForVisibility(
                driver,10, "//div[contains(@data-id,\"CPU\")]"
        );

        List<WebElement> allPrices = driver.findElements(By.xpath(
                "//a[contains(text(),\"Apple\")]/../div/../a[3]//div[@class=\"hZ3P6w\"]"
        ));

        int min = Integer.MAX_VALUE;


//        System.out.println(allTitles.getFirst().getText());
        for (WebElement price : allPrices) {
            String cp = price.getText();
            cp = cp.replace("₹", "").replace(",","");
            System.out.println(cp);
            try {
                int current_price = Integer.parseInt(cp);
                if (current_price < min) {
                    min = current_price;
                }
            }catch (NumberFormatException e){
                continue;
            }
        }

        System.out.println("Cheapest mac price available is: "+ min);



        closeBrowser(driver);
    }
}
