package learning;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteToExcelFile {

	public static void main(String[] args) throws IOException {
		
		//Create Workbook -> Sheet -> Row -> Column -> set value
		
		File xlfile = new File("C:\\Users\\sadiy\\git\\Cucumber\\SeleniumCucumber\\src\\test\\resources\\writeExcel.xlsx");
		FileOutputStream stream = new FileOutputStream(xlfile);
		XSSFWorkbook book = new XSSFWorkbook();
		XSSFSheet sheet = book.createSheet("Sheet1");
		
		XSSFRow sheetrow = sheet.createRow(0);
		
		XSSFCell cell = sheetrow.createCell(0);
		cell.setCellValue("Sadiya Javeed");
		book.write(stream);
	
		book.close();
	}
}
