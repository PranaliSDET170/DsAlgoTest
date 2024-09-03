package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.IOException;
import java.io.InputStream;

public class ExcelCredentials {
    public String[] getUserNameAndPassword() {
        String username = null;
        String password = null;

        // Load the Excel file from the resources folder
        try (InputStream inputStream = ExcelCredentials.class.getResourceAsStream("/CredentialsExcel.xlsx");
             Workbook workbook = new XSSFWorkbook(inputStream)) {

            // Get the first sheet from the workbook
            Sheet sheet = workbook.getSheetAt(0);

            // Read the first (and only) row of data (excluding the header)
            Row row = sheet.getRow(1); // Index 1 is the second row (first row after header)

            // Read the username and password from the respective columns
            Cell usernameCell = row.getCell(0); // First column (index 0)
            Cell passwordCell = row.getCell(1); // Second column (index 1)

            // Store the values in the variables
            if (usernameCell.getCellType() == CellType.STRING) {
                username = usernameCell.getStringCellValue();
            }
            if (passwordCell.getCellType() == CellType.STRING) {
                password = passwordCell.getStringCellValue();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String[] {username,password};
    }
}
