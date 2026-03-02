package org.example.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class xpathAxes {


    @Test
    public void test_webtable(){

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://awesomeqa.com/webtable.html");
        driver.manage().window().maximize();

        //table[@id="customers"]/tbody/tr[5]/td[2]
        //  tr[i] => 1,2,3,4,5,6
        // td[j] => 1,2,3

        String first_part = "//table[@id=\"customers\"]/tbody/[";
        String second_part = "]/td[";
        String third_part = "]";

        Integer row = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr")).size();
        Integer cols = driver.findElements(By.xpath("//table[@id=\"customers\"]/tbody/tr[2]/td")).size();

        for(int i = 2; i <= row; i++){
            for(int j = 1; j <= cols; j++){
                String dXpath = first_part + i + second_part + j + third_part;
//                System.out.println(dXpath);

                String data = driver.findElement(By.xpath(dXpath)).getText();
                System.out.println(data);
                if(data.contains("Helen")){
                    String countrY_path = dXpath+ "/following-sibling::td";
                    String country_path_txt = driver.findElement(By.xpath(countrY_path)).getText();

                    String company = dXpath + "/preceding-sibling::td";
                    String company_path_txt = driver.findElement(By.xpath(company)).getText();

                    System.out.println("-------------------------------------------");

                    System.out.println(country_path_txt +" " + company_path_txt);
                }




            }
        }

        driver.quit();


    }
}
