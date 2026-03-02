package org.example.Tasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ttaBank {

    @Test
    public void test_ttaBank_() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://tta-bank-digital-973242068062.us-west1.run.app/");

        WebElement SignUpBtn = driver.findElement(By.xpath("//button[contains(text(),\"Sign Up\")]"));
        SignUpBtn.click();

        WebElement FullName = driver.findElement(By.xpath("//input[@type=\"text\"]"));
        FullName.sendKeys("John Doe");

        WebElement email = driver.findElement(By.xpath("//input[@type=\"email\"]"));
        email.sendKeys("admin1@gmail.com");

        WebElement password = driver.findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("admin");

        WebElement CreateAccbtn = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        CreateAccbtn.click();


        Thread.sleep(3000);


        WebElement transferFunds = driver.findElement(By.xpath("//button[contains(text(),\"Transfer Funds\")]"));
        transferFunds.click();

        WebElement amount = driver.findElement(By.xpath("//input[@type=\"number\"]"));
        amount.sendKeys("5000");

        WebElement continueBtn = driver.findElement(By.xpath("//button[contains(text(),\"Continue\")]"));
        continueBtn.click();


        WebElement confirmTransferBtn = driver.findElement(By.xpath("//button[contains(text(),\"Confirm Transfer\")]"));
        confirmTransferBtn.click();

        Thread.sleep(3000);


        WebElement dashboard = driver.findElement(By.xpath("//button[contains(text(),\"Dashboard\")]"));
        dashboard.click();

        Thread.sleep(3000);

        WebElement balance = driver.findElement(By.xpath("//h3[contains(text(),\"$\")]"));
        String bal = balance.getText();

        Assert.assertEquals(bal,"$45,000.00");


        driver.quit();










    }
}
