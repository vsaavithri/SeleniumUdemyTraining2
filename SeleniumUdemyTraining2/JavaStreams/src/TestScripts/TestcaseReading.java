package TestScripts;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestcaseReading {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

	File f = new File("C:\\Users\\Saavithri V Nathan\\eclipse-workspace\\sai.txt");
	FileReader fr = new FileReader(f);
	BufferedReader reader = new BufferedReader(fr);
	//String line = null;
	//while((line=reader.readLine())!= null)
	
	String input = reader.readLine();
	
	
	while(input!= null)
			{
		
	System.out.println(input);
	reader.lines();
			}
	
	


reader.close();

System.out.println("File read successfully");
	

}
}

