
package Assignment5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CsvFileWriter {

	public static void main(String[] args) {
		
		String Name="aana";
		int id=11;
		double marks=45;
		String FilePath="C:\\Users\\kavit\\OneDrive\\Desktop\\data.csv";
		saverecord( Name, id, marks, FilePath);
		
	}
	
	public static void saverecord(String Name,int id,double marks,String FilePath)
	{
		try {
			FileWriter fw=new FileWriter(FilePath,true);
			BufferedWriter bw=new BufferedWriter(fw);
			PrintWriter pw=new PrintWriter(bw);
			
			pw.println(Name+","+id+","+marks);
			pw.flush();
			pw.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
