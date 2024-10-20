package Demo.FileReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CharacterByCharacter {

	public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\kumar\\eclipse-workspace\\FileReader\\txt file.txt");
	FileReader fr=new FileReader(f);
	int a;
	while((a=fr.read())!=-1) {
		System.out.println((char)a);
	}
	}

}
