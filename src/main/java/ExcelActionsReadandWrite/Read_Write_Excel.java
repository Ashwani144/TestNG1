package ExcelActionsReadandWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Write_Excel {

	public static void main(String[] args) throws Exception {

		//Get the excel file and create an input stream for excel
		
     FileInputStream fis=new FileInputStream("C:\\Users\\HP\\Downloads\\Age_Validation.xlsx");
     
     //Creating a workbook
     XSSFWorkbook wb = new XSSFWorkbook(fis);
     XSSFSheet sheet = wb.getSheetAt(0);
     
     XSSFRow row = sheet.getRow(0);
     XSSFCell cell = row.getCell(0);
      
     System.out.println(sheet.getRow(0).getCell(0));
     
     
   //  int rowcount=sheet.getLastRowNum();
     
   //  System.out.println("Total number is rows present in the sheet : " +rowcount);
     
		
		
	}

}
