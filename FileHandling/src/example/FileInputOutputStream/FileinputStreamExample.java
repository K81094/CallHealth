package example.FileInputOutputStream;

import java.io.*;
public class FileinputStreamExample {
	public static void main(String args[]){
		try{
			FileInputStream fin=new FileInputStream("input.txt");
			int i=0;
			while((i=fin.read())!=-1){
				System.out.print((char)i);				
			}
			fin.close();
			
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
