package Demo.FileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineByLine {

	public static void main(String[] args) throws IOException {
		File f=new File("../FileReader/txt file.txt");
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String s;
        while((s=br.readLine())!=null){
        	System.out.println(s);
        }
	}

}
