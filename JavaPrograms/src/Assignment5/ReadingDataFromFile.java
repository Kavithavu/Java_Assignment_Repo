package Assignment5;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;

public class ReadingDataFromFile {

	public static void main(String[] args) throws IOException {
		int charCount = 0;
		int intCount=0;
		int wordCount = 0;
		int alphabetsCount=0;

		try {

		File f=new File("C:\\Users\\kavit\\OneDrive\\Desktop\\data.txt");
		BufferedReader b = new BufferedReader(new FileReader(f));
		String readLine = "";
		
		while ((readLine = b.readLine()) != null) {
			System.out.println(readLine);
			String[] words=readLine.split(" ");
			wordCount=wordCount+words.length;
			for (String word : words)
            {
				int i=0;
                //Updating the charCount
                charCount = charCount + word.length();
				char ch=word.charAt(i);
				if(Character.isAlphabetic(ch))
					alphabetsCount=alphabetsCount+1;
				if(Character.isDigit(ch))
					intCount=intCount+1;
            }

			
		}
		System.out.println("NUmber of words in a file :" +wordCount);
		System.out.println("NUmber of Char in a file:" +charCount);
		System.out.println("NUmber of alphabets in a file:" +alphabetsCount);
		System.out.println("NUmber of digits in a file:" +intCount);

	} catch (IOException e) {
		e.printStackTrace();



	}
	}
}
