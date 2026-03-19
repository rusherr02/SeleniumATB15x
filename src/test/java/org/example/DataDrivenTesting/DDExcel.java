package org.example.DataDrivenTesting;

import org.example.Util;
import org.testng.annotations.Test;
import java.io.IOException;

public class DDExcel {


    @Test(dataProvider = "getDataFromExcel", dataProviderClass = Util.class)
    public void testExcel(String email, String password) throws IOException {
            // Read the file
        // Workbook create
        // Sheet
        // Row and Cell
        // 2D Object - getData()

        System.out.println("Email: " + email);
        System.out.println("Password: " + password);




    }
}
