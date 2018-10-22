/*1.change all xl row and column data to "Abhishek" or "Tekarch"
 */
package POIAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.WriteAbortedException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Workbook;

public class EditExcelSheet {

	public static void main(String[] args) throws IOException {
		String path=System.getProperty("user.dir");
		File file=new File((path+"/src/Utility/Test.xls"));
		FileInputStream fs=new FileInputStream(file);
		HSSFWorkbook workbook=new HSSFWorkbook(fs);
		HSSFSheet Sheet=workbook.getSheetAt(0);
		//		Sheet.getRow(0).getCell(0).setCellValue("Tekarch");
		String value="Abhishek";
		int rows=Sheet.getLastRowNum()+1;
		int cols=Sheet.getRow(0).getLastCellNum();
		String[][] data=new String[rows][cols];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				Sheet.getRow(i).getCell(j).setCellValue(value);
			}
		}
		FileOutputStream fo=new FileOutputStream(file);
		workbook.write(fo);
		fo.flush();
		fo.close();

	}
}
