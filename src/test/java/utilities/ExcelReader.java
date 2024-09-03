package utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

public class ExcelReader {
	private static String TEST_DATA_EXCEL = "./test-data/Login.xlsx";
	private Map<Integer, Map<String, String>> rows = new HashMap<>();

	public ExcelReader(String sheetName) {

		Workbook workbook = openWorkBook(TEST_DATA_EXCEL);
		Sheet sheet = openSheet(workbook, sheetName);
		readDate(sheet);
	}

	private Workbook openWorkBook(String fileName) {
		Workbook workbook = null;
		try {
			workbook = new XSSFWorkbook(ExcelReader.class.getClassLoader().getResourceAsStream(fileName));
		} catch (FileNotFoundException e) {
			Assert.fail("File Not found");
		} catch (IOException e) {
			Assert.fail("Fail to read file");
		}

		return workbook;
	}

	private Sheet openSheet(Workbook workbook, String sheetName) {
		return workbook.getSheet(sheetName);
	}

	private void readDate(Sheet sheet) {
		int firstRowNum = sheet.getFirstRowNum();
		int rowCount = 0;

		Row headerRow = null;
	
		for (Row currentRow : sheet) {
			Map<String, String> columns = new HashMap<>();
			if (currentRow.getRowNum() == firstRowNum) {
				headerRow = currentRow;
				continue;
			}

			for (Cell currentCell : currentRow) {
				columns.put(headerRow.getCell(currentCell.getColumnIndex()).getStringCellValue(),
						currentCell.getStringCellValue());
			}

			rows.put(rowCount++, columns);
		}

	}

	public Map<String, String> getData(int rowNum) {
		return rows.get(rowNum - 2);
	}

}
