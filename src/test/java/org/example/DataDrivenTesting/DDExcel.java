package org.example.DataDrivenTesting;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.example.Util;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import static org.example.Util.SHEET_PATH;
import static org.example.Util.getTestDataFromExcel;

public class DDExcel {


    @Test(dataProvider = "getTestDataFromExcel", dataProviderClass = Util.class)
    public void testExcel(String email, String password) throws IOException {
            // Read the file
        // Workbook create
        // Sheet
        // Row and Cell
        // 2D Object - getData()

        getTestDataFromExcel(SHEET_PATH);




    }
}
