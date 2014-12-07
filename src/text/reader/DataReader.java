package text.reader;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DataReader {

	/**
	 * This class contains a main method which will be able to read a file.
	 */
	public static void main(String[] args){
		/* Use java API to read a file from external sources(can be a text file 
		 * in your documents folder)
		 * You must use Try...catch and finally block.
		 * You must use while loop.Use String array for extra credit.
		 * 
		 * 
		 */
		FileReader file = null;
		try {
			file = new FileReader("C:\\Users\\Dip30\\Desktop\\Dip.txt");
		} catch (FileNotFoundException e) {
			System.out.println("make sure file is there");
			e.printStackTrace();
		}
	    BufferedReader reader = new BufferedReader(file);
	    String st;
	    try {
			while((st = reader.readLine())!=null){
				System.out.println(st);
			  }
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally{
			try {
				reader.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			try {
				file.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		}

	}

}
