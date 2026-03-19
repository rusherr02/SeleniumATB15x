package org.example.Tasks;

import org.example.CommonToAll;
import org.example.waitHelpers;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class appvwoFileUpload extends CommonToAll {

    @Test
    public void TestAppWwoWaits() {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://app.vwo.com/#/settings/profile-details");
        WebElement email = driver.findElement(By.name("username"));
        email.sendKeys("fohomek401@qvmao.com");

        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("Admin12345");

        WebElement signInBtn = driver.findElement(By.id("js-login-btn"));
        signInBtn.click();

        waitHelpers.waitForJVM(10000);

        WebElement element = driver.findElement(By.xpath("//input[@type=\"file\"]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
        WebElement fileU = driver.findElement(By.xpath("//input[@type=\"file\"]"));
        fileU.sendKeys(
                "/Users/manav/IdeaProjects/SeleniumATB15x/src/test/java/org/example/Tasks/Screenshot 2025-12-12 at 7.46.17 AM.png"
        );

        waitHelpers.waitForVisibility(driver, 10, "//button[@vwo-async-click=\"vm.uploadProfilePic()\"]");

        WebElement uploadImage = driver.findElement(By.xpath("//button[@vwo-async-click=\"vm.uploadProfilePic()\"]"));
        uploadImage.click();

        closeBrowser(driver);



    }
}
