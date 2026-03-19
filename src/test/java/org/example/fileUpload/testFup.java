package org.example.fileUpload;

import org.example.CommonToAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class testFup extends CommonToAll {

    @Test
    public void testFup(){

        WebDriver driver = new ChromeDriver();

        openBrowser(driver, "https://awesomeqa.com/selenium/upload.html");

        WebElement chooseFile = driver.findElement(By.id("fileToUpload"));
        String user_dir_path = System.getProperty("user.dir");
        chooseFile.sendKeys(user_dir_path + "/src/test/java/org/example/fileUpload/test.json");

        WebElement UploadFile = driver.findElement(By.xpath("//input[@type='submit']"));
        UploadFile.click();


        closeBrowser(driver);

    }
}
