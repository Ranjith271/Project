package DataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class ReadData {
	public void  readData() throws FileNotFoundException {
		File f= new File("C:\\Users\\Ranjith\\eclipse-workspace\\Projrct\\Excel\\Demo.xls");
		FileInputStream fis = new FileInputStream(f);
		HSSFWorkbook wb = new HSSFWorkbook(fis);
		Sheet s =  wb.getSheetAt(0);
		Row r = s.getRow(2);
		Cell c= r.getCell(0);
		CellType ct=c.getCellType();
		
		}}