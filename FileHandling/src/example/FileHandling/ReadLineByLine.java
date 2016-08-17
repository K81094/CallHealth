package example.FileHandling;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;

public class ReadLineByLine {

	public static void main(String[] args) {
		try{
			//FileOutputStream fout=new FileOutputStream("demo.txt");
			FileReader fileReader =  new FileReader("demo.txt");
			String line=null;

	            // Always wrap FileReader in BufferedReader.
	            BufferedReader bufferedReader=new BufferedReader(fileReader);

	            while((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }   

	            // Always close files.
	            bufferedReader.close();  

		}
		catch(FileNotFoundException e){
			System.out.println("File not found");
			
		}catch(Exception e){
			e.printStackTrace();
		}

	}

}
