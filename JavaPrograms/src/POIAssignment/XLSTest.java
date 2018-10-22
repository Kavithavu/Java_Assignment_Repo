package POIAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLSTest {
	
	public static void readxlData() throws IOException {
		String path=System.getProperty("user.dir");
		FileInputStream fs=new FileInputStream(new File(path+"/src/Utility/Test.xls"));
//		FileInputStream fs=new FileInputStream("src/Utility/Test.xls");
		HSSFWorkbook workboook=new HSSFWorkbook(fs);
		HSSFSheet sheet=workboook.getSheetAt(0);
		int rows=sheet.getLastRowNum()+1;
		int cols=sheet.getRow(0).getLastCellNum();
		String[][] data=new String[rows][cols];
		for(int i=0;i<rows;i++)
			
		{
			for(int j=0;j<cols;j++)
			{
				System.out.print(data[i][j]=sheet.getRow(i).getCell(j).getStringCellValue()+ " ");
			}
			System.out.println();
		}
	}
	

	public static void main(String[] args) throws IOException {
		readxlData();
		
	}

	

}
