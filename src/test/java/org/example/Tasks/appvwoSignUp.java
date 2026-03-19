package org.example.Tasks;

import org.example.CommonToAll;
import org.example.waitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class appvwoSignUp extends CommonToAll {

    @Test
    public void TestAppWwoSignUp() {

        WebDriver driver = new ChromeDriver();

        openBrowser(driver, "https://app.vwo.com/#/login");
        WebElement startAFreetrail = driver.findElement(By.xpath(
                "//a[contains(@href,'free-trial') and .//span[contains(normalize-space(),'Start a FREE TRIAL')]]")
        );
        startAFreetrail.click();

        Set<String> windows = driver.getWindowHandles();
        List<String> list = new ArrayList<>(windows);

        driver.switchTo().window(list.get(1)); // child window


        WebElement email = driver.findElement(By.xpath("//input[@data-qa='page-su-step1-v1-email']"));
        email.sendKeys("camwop@pmail.asia");


        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement checkboxLabel = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("page-free-trial-step1-cu-gdpr-consent-checkbox")
                )
        );
        checkboxLabel.click();

        WebElement freeTrialAcc_Btn = driver.findElement((By.xpath("//button[contains(text(),'Create a Free Trial Account')]")));
        freeTrialAcc_Btn.click();




        WebElement firstName = driver.findElement(By.id("page-v1-fname"));
        firstName.sendKeys("Camwop");
        WebElement lastName = driver.findElement(By.id("page-v1-lname"));
        lastName.sendKeys("Camwop");
        WebElement phoneNumber = driver.findElement(By.id("page-v1-number"));
        phoneNumber.sendKeys("9830987651");

        WebElement checkboxLabel2 = wait.until(
                ExpectedConditions.elementToBeClickable(
                        By.id("page-free-trial-step1-cu-gdpr-consent-checkbox")
                )
        );
        checkboxLabel2.click();

        WebElement CreateAcc = driver.findElement(By.xpath("//button[@data-qa=\"page-su-submit\" and contains(text(),\"Create Account\")]"));
        CreateAcc.click();

        waitHelpers.waitForJVM(3000);

        WebElement skipContinue = driver.findElement(By.xpath(" //button[@data-step=\"free-trial-thankyou\"]"));
        skipContinue.click();

        waitHelpers.waitForVisibility(driver, 30, "//div[@data-qa=\"simumigine\"]");

        WebElement saveBtn = driver.findElement(By.xpath("//button[@data-qa=\"boxasuraza\"]"));
        saveBtn.click();

        waitHelpers.waitForVisibility(
                driver, 30, "//div[@data-qa=\"miquboceju\"][.//h5[@data-qa=\"kigapoyede\" and contains(normalize-space(),'VWO Insights - Web')]]"
        );

        List<WebElement> btn = driver.findElements(By.xpath("//button[@data-qa='cunoxonoxe']"));
        btn.get(1).click();

        waitHelpers.waitForVisibility(driver, 30, "//label[@for=\"domain-name\"]");

        WebElement addDomainBtn = driver.findElement(By.xpath("//button[contains(text(),\"Add domain\")] "));
        addDomainBtn.click();

        waitHelpers.waitForVisibility(driver, 30, "//h6[@data-qa=\"holodigatu\"]");

        WebElement copybtn = driver.findElement(By.xpath("//button[@data-qa=\"xugejexijo\"]"));

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", copybtn);
        copybtn.click();

        WebElement toast = driver.findElement(By.xpath("//div[contains(text(),\"Copied to clipboard.\")]"));
        assert toast.getText().contains("Copied to clipboard");


        closeBrowser(driver);


    }
}
