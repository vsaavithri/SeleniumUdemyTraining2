package TestScripts;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestCaseWritingExcelApache {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		XSSFWorkbook workbook =  new XSSFWorkbook();
		XSSFSheet sheet0 = workbook.createSheet("firstsheet");
		XSSFSheet sheet1 = workbook.createSheet("Secondsheet");
		
		
		/*
		 * Row row0 = sheet0.createRow(0); 
		 * Cell cellA = row0.createCell(0); 
		 * Cell cellB = row0.createCell(1);
		 * 
		 * 
		 * Row row1 = sheet1.createRow(0); Cell cell2 = row1.createCell(0); Cell cell3 =
		 * row1.createCell(1);
		 * 
		 * 
		 * cellA.setCellValue("Firstcell"); cellB.setCellValue("SecondCell");
		 * 
		 * cell2.setCellValue("Aum Sri SaiRam"); cell3.setCellValue("Our Swami");
		 */
		
		
		
		for ( int rows = 0; rows<10; rows++) {
			
			Row row = sheet0.createRow(rows);
			
			for ( int cols = 0; cols <10; cols++) {
				Cell cell = row.createCell(cols);
				cell.setCellValue((int)(Math.random()*100));
			}
				
			}
		
		
		File f = new File("C:\\SAAVITHRI\\Selenium\\sai1.xlsx");
		FileOutputStream fos = new FileOutputStream(f);
		
		workbook.write(fos);
		
		fos.close();
		workbook.close();
		
		System.out.println("File Created");
		
		

	}

}
