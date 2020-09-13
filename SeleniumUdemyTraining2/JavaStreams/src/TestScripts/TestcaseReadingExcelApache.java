package TestScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class TestcaseReadingExcelApache {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		File f = new File("C:\\SAAVITHRI\\Selenium\\Sai1.xlsx");
		FileInputStream fis = new FileInputStream(f);
		Workbook workbook = WorkbookFactory.create(fis);

		Sheet sheet = workbook.getSheetAt(0);
		/*
		 * Row row = sheet.getRow(0); Cell cell1 = row.getCell(0);
		 */

		for (Row row : sheet) {

			for (Cell cell : row) {
				switch (cell.getCellType()) {

				 case STRING: System.out.print(cell.getStringCellValue() + "\t");
				 break;
				 case NUMERIC:
					System.out.print(cell.getNumericCellValue() + " \t");
					break;
				case BLANK:
					System.out.print("Get Blank Values"+ "\t");
					break;

				}
          
			}

		}
		System.out.println();

		fis.close();
	}

}
