package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class Selenium001 {
    public static void main(String[] args) {


        // Source here ->  (nagivate to the google.com)
        //  Converted -> JSON Wireprotocol | HTTP Request | api request)
        //  Browser Driver | Server ( application running on a particulr port)
        // Browser Driver -> Real Driver(


//        ChromeDriver driver = new ChromeDriver();
//        driver.get("https://app.vwo.com");


        FirefoxDriver driverF = new FirefoxDriver();
        driverF.get("https://sdet.live");
        driverF.quit();


    }
}
