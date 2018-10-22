package Assignment5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataToTextFile {

	private final static String FILENAME="C:\\Users\\kavit\\OneDrive\\Desktop\\data.txt";

	public static void main(String[] args) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

			String content = "This is the content to write into file\n";

			bw.write(content);

			// no need to close it.
			//bw.close();

			System.out.println("Done");

		} catch (IOException e) {

			e.printStackTrace();

		}
	}
}
