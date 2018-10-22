package POIAssignment;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hslf.usermodel.HSLFSheet;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class CompareTwoXlSheets {

	public static void main(String[] args) throws IOException {
		
		String path=System.getProperty("user.dir");
		FileInputStream fs=new FileInputStream(path+"/src/Utility/Test.xls");
		HSSFWorkbook wb=new HSSFWorkbook(fs);
		HSSFSheet sheet1=wb.getSheetAt(0);
		HSSFSheet sheet2=wb.getSheetAt(1);
		int rows1=sheet1.getLastRowNum()+1;
		int cols1=sheet1.getRow(0).getLastCellNum();
		int rows2=sheet2.getLastRowNum()+1;
		int cols2=sheet2.getRow(0).getLastCellNum();
		String data1,data2;
		if(rows1==rows2 && cols1==cols2)
		{
			for(int i=0;i<rows1;i++)
			{
				for(int j=0;j<cols1;j++)
				{
					data1=sheet1.getRow(i).getCell(j).getStringCellValue();
					data2=sheet2.getRow(i).getCell(j).getStringCellValue();
					if(data1.equalsIgnoreCase(data2))
					{
						System.out.println(i+1 +" row " +(j+1)+ "  col Equal");
					}
					else
						System.out.println(i+1 +" row " +(j+1)+ " col Not Equal");
				}
			}
		}
		else
			System.out.println("Cannot Compare rows and columns dont match");
		
	}

}
