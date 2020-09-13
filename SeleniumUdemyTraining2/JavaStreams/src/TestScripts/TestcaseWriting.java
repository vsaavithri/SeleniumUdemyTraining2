package TestScripts;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TestcaseWriting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File f = new File("C:\\Users\\Saavithri V Nathan\\eclipse-workspace\\Sainotes.html");
		FileWriter fw = new FileWriter(f);
		BufferedWriter writer = new BufferedWriter(fw);

//		writer.write("Aum Sri Ganeshaya Namaha");
//		writer.newLine();
//		writer.write("Aum Sri yogiSaiRam");
//		writer.newLine();
//		writer.write("Thank you Swami for today");
//		writer.newLine();
		// Append more

//		writer.write("Guru Guru Guru Guru Guru Guru Sathya Sai");
//		writer.newLine();
//		writer.write("Charanagathoham Charanagathoam");
//		writer.newLine();
//		writer.write("To Sri Sathya Sai");
		writer.newLine();
		writer.newLine();
		writer.newLine();
		writer.newLine();

//		for (int i = 0; i < 4; i++) {
//
//			for (int j = 0; j < 3; j++) {
//
//				writer.write( +i+ "," + j);
//				writer.newLine();
//				int num = (int) (Math.random() * 100);
//				writer.write("" +num+ ",");
		
		
writer.write("<html> <body> <title> God is Great </title><h1> Sai is God </h1> </body></html>");		
	
		
		
		
		writer.close();

		System.out.println("File created Successfully");

	}

}