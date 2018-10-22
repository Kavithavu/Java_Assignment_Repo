package Java_HackathonTest;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class Q31ReadFileNWriteToNewFile {

	public static void main(String[] args) {
		String infile="input.txt";
		String Outfile="output.txt";
		try
		{
			File sourceFile=new File(infile);
			Scanner content=new Scanner(sourceFile);
			PrintWriter pwriter =new PrintWriter(Outfile);

			while(content.hasNextLine())
			{
				String s=content.nextLine();
				StringBuffer buffer = new StringBuffer(s);
				buffer=buffer.reverse();
				String rs=buffer.toString();
				pwriter.println(rs);
			}
			content.close();    
			pwriter.close();
			System.out.println("File is copied and reversed successful!");
		}



		catch(Exception e){
			System.out.println("Something went wrong");
		}
	}
}




