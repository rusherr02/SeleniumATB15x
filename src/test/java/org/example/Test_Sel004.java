package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class Test_Sel004 {

    @Test
    public void test_sel_00() {
        System.out.println("TestNG is working!");

        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        driver.manage().window().maximize();

        Assert.assertEquals(driver.getTitle(), "Google");

        assertThat(
                driver.getCurrentUrl().isBlank()).isFalse().isNotNull().isEqualTo("https://google.com"
        );

        driver.quit();

    }
}