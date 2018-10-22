package POIAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;

public class XlsCellFillBackgroundColor {

	public static void main(String[] args) throws IOException {
		String cur_dir=System.getProperty("user.dir");
		File file=new File(cur_dir+"/src/Utility/Test.xls");
		FileInputStream fs=new FileInputStream(file);
		HSSFWorkbook wb=new HSSFWorkbook(fs);
		HSSFSheet sheet=wb.getSheetAt(0);
		String data;
		int rows=sheet.getLastRowNum()+1;
		int cols=sheet.getRow(0).getLastCellNum();
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				data=sheet.getRow(i).getCell(j).getStringCellValue();
				if(data.equalsIgnoreCase("student"))
				{
					HSSFCell cell=sheet.getRow(i).getCell(j);
					HSSFCellStyle style=(HSSFCellStyle) wb.createCellStyle();
					style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
					style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
					cell.setCellStyle(style);

				}
				else
				{
					HSSFCell cell=sheet.getRow(i).getCell(j);
					//					cell.setCellValue(data);
					HSSFCellStyle style=(HSSFCellStyle) wb.createCellStyle();
					style.setFillForegroundColor(IndexedColors.RED.getIndex());
					style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
					cell.setCellStyle(style);

				}
			}
		}

		FileOutputStream fo=new FileOutputStream(file);
		wb.write(fo);
		fo.flush();
		fo.close();

	}

}
