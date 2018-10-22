package POIAssignment;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.common.usermodel.HyperlinkType;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFCreationHelper;
import org.apache.poi.hssf.usermodel.HSSFExtendedColor;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFHyperlink;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Hyperlink;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;

public class AddingHyperlinkToCellInXlsFileSheet {

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
					CreationHelper createHelper = wb.getCreationHelper();
					HSSFCellStyle hlinkstyle = wb.createCellStyle();
					HSSFFont hlinkfont = wb.createFont();
					hlinkfont.setUnderline(Font.U_SINGLE);
					hlinkfont.setColor(IndexedColors.BLUE.getIndex());
					hlinkstyle.setFont(hlinkfont);

//					cell.setCellValue("http://www.google.com");
					HSSFHyperlink link = (HSSFHyperlink)createHelper.createHyperlink(HyperlinkType.URL);
					link.setAddress("http://www.google.com/");
					cell.setHyperlink((HSSFHyperlink) link);
					cell.setCellStyle(hlinkstyle);


					System.out.println("link created");
				}

			}
		}

		FileOutputStream fo=new FileOutputStream(file);
		wb.write(fo);
		fo.flush();
		fo.close();
	}

}
