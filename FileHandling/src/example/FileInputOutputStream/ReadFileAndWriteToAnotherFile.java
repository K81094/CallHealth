//Example of Reading the data of current java file and writing it into another file
package example.FileInputOutputStream;

import java.io.*;
public class ReadFileAndWriteToAnotherFile {
	public static void main(String args[]){
		try{
			FileInputStream fin=new FileInputStream("input.txt");
			FileOutputStream fout=new FileOutputStream("output.txt");
			int i=0;
			while((i=fin.read())!=-1){
				fout.write((char)i);
			}
			System.out.println("Success.....");
			fin.close();fout.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		
	}

}
