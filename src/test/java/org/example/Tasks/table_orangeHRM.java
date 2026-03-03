package org.example.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class table_orangeHRM {

    @Test
    public void test_table_orangeHRM() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://awesomeqa.com/hr/web/index.php/auth/login");

        Thread.sleep(3000);

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("admin");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Hacker@4321");

        WebElement login = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        login.click();

        Thread.sleep(3000);

        WebElement DeleteBtnTerminatedEmp = driver.findElement(By.xpath(
                "//div[@class=\"oxd-table-card\"] [.//div[@role=\"cell\"][normalize-space()=\"Terminated\"]] //i[contains(@class,\"bi-trash\")]")
        );
        DeleteBtnTerminatedEmp.click();

        WebElement deleteModal = driver.findElement(By.xpath("//div[@role=\"document\"]"));

        Thread.sleep(3000);

        Assert.assertTrue(deleteModal.isDisplayed());

        driver.quit();

    }
}
