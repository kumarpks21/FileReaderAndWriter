package Demo.FileReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendNewLine {

	public static void main(String[] args) throws IOException {
		File f=new File("../FileReader/txt file.txt");
		FileWriter fw=new FileWriter(f, true);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.newLine();
		bw.write("I am the fourth line");
		bw.newLine();
		bw.write("I am the fifth Line");
		bw.close();

	}

}
