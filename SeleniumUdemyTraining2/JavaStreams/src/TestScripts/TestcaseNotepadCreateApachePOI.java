package TestScripts;

import java.io.File;
import java.io.IOException;

public class TestcaseNotepadCreateApachePOI {

	public static void main(String[] args) throws IOException {
		
		
		File file = new File("C:\\SAAVITHRI\\Selenium\\readSaibooks.txt");
		file.createNewFile();
		file.getName();
		System.out.println(file.getName());
		

	}

}
