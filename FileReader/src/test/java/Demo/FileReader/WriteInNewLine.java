package Demo.FileReader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteInNewLine {
	public static void main(String[] args) throws IOException {
		File f=new File("../FileReader/txt file.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write("I am the first Line");
		bw.newLine();
		bw.write("I am the second line");
		bw.newLine();
		bw.write("I an the Third line");
		bw.close();
}
}
