package learning;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromExcelFile {

	public static void main(String[] args) throws IOException {
		
		//Fetch Workbook -> Sheet -> Row -> Column -> get value
		
		File xlfile = new File("C:\\Users\\sadiy\\git\\Cucumber\\SeleniumCucumber\\src\\test\\resources\\readExcel.xlsx");
		FileInputStream stream = new FileInputStream(xlfile);
		XSSFWorkbook book = new XSSFWorkbook(stream);
		XSSFSheet sheet = book.getSheet("Sheet1");
		
		for (int row=sheet.getFirstRowNum(); row<=sheet.getLastRowNum(); row++) {
			XSSFRow sheetrow = sheet.getRow(row);
			
			for (int col=sheetrow.getFirstCellNum(); col<sheetrow.getLastCellNum(); col++) {
				XSSFCell cell = sheetrow.getCell(col);
				
				switch (cell.getCellType()) {
				case BLANK:
					System.out.println("");
					break;
				case NUMERIC:
					System.out.println(cell.getNumericCellValue());
					break;
				case STRING:
					System.out.println(cell.getStringCellValue());
					break;

				default:
					break;
				}
			}
		}
		book.close();
	}

}
