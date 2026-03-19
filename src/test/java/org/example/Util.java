package org.example;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Util {

    static Workbook book;
    static Sheet sheet;

    public static String SHEET_PATH = System.getProperty("user.dir") + "src/test/resources/TestData.xlsx";


    public static Object[][] getTestDataFromExcel(String sheetName) throws IOException {

        FileInputStream fis = null;
        try {
            fis = new FileInputStream(SHEET_PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        book = WorkbookFactory.create(fis);
        sheet = book.getSheet(sheetName);

        Object[][] testData = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];

        for (int i = 0; i < sheet.getLastRowNum(); i++) {
            for (int j = 0; j < sheet.getRow(0).getLastCellNum(); j++) {
                testData[i][j] = sheet.getRow(i+1).getCell(j).toString();
            }
        }

        return testData;
    }

    @DataProvider
    public Object[][] getDataFromExcel(String sheetName) throws IOException {

        return getTestDataFromExcel(sheetName);
    }


}
