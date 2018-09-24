package sundayclass012118;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelOperation0408 {

	public static void main(String[] args) throws IOException {
	FileInputStream file = new FileInputStream("C:\\Users\\Minu\\Desktop\\ShumonSelenium\\WebApplicationTesting\\src\\com\\excel0408\\DataFile.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	XSSFSheet sheet = workBook.getSheet("Sheet1");
	//3
	
	int RowCount=sheet.getLastRowNum();
	
	for(int k=0;k<=RowCount;k++)
	{
		Row r=sheet.getRow(k);
		//2
		int CellCount=r.getLastCellNum();
		for(int p=0;p<CellCount;p++)
		{
		Cell c=r.getCell(p);
		String data=c.getStringCellValue();
		System.out.print(data+"  ");
		}
		System.out.println();
	}
		
	}

}