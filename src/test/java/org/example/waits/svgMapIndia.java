package org.example.waits;

import org.example.CommonToAll;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class svgMapIndia extends CommonToAll {

    //*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[@aria-label="Tripura  "]

    @Test
    public void testSvgMapIndia(){

        ChromeDriver driver = new ChromeDriver();
        openBrowser(driver,"https://www.amcharts.com/svg-maps/?map=india");

        clickElement(
                driver, "//*[name()='svg']/*[name()='g'][7]/*[name()='g']/*[name()='g']/*[@aria-label=\"Tripura  \"]"
        );

        closeBrowser(driver);
    }
}
