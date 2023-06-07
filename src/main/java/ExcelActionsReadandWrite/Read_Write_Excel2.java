package ExcelActionsReadandWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Write_Excel2 {

	public static void main(String[] args) throws Exception {

		//Create an object of File to open and Create an object of FileInputStream class
		
		   FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Downloads\\Age_Validation.xlsx");
		  
		   XSSFWorkbook wb = new XSSFWorkbook(fis);
		    
		    XSSFSheet sheet = wb.getSheetAt(0);
		    double data = sheet.getRow(1).getCell(1).getNumericCellValue();
		  
		   System.out.println("Information are showing :"+ data);
		  
	}

}
