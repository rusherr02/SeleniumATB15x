package org.example.windowHandle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class IframeUtils {

    WebDriver driver;

    public IframeUtils(WebDriver driver) {
        this.driver = driver;
    }


    public void swtichtoFrame(String frameId, Integer timeInSec){

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeInSec));
        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(frameId));
        System.out.println("swtichtoFrame: "+ frameId);
    }
}
