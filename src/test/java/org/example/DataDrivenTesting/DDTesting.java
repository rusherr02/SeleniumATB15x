package org.example.DataDrivenTesting;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DDTesting
{

    @DataProvider(name ="LoginData", parallel = true)
    public Object[][] getData()
    {
        return new Object[][]{

                new Object[]{"admin@gmail.com", "pass123"},
        new Object[]{
            "admin123 @gmail.com", "pass123"
        }
    } ;
            }

            // read the data from excel and give us 2D object

    @Test(dataProvider = "LoginData")
    public void loginTest(String email, String password)
    {
        System.out.println("Login Test");
        System.out.println("Email: " + email);
        System.out.println("Password: " + password);
    }
}
