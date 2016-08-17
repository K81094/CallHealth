package example.FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadParticularLine {

	public static void main(String[] args) {
		try {
			FileReader fr=new FileReader("demo.txt");
			BufferedReader br=new BufferedReader(fr);
			String line=null;
			while((line=br.readLine())!=null){
				/*if(line.length()>0){
					System.out.println(line.length());
				}*/
				if(line.contains("ERROR")){
					System.out.println(line);
					
				}
				
			}
		}catch(FileNotFoundException e){
			System.out.println("File not found");
		}catch(IOException e){
			System.out.println("IO Exception occured");
		}
		
		
	}

}
