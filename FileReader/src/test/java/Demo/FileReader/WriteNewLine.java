package Demo.FileReader;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteNewLine {

	public static void main(String[] args) throws IOException {
		File f=new File("../FileReader/txt file.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("I am the first Line");
		fw.write("I am the second line");
		fw.close();

	}

}
