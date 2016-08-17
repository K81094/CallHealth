package example.FileInputOutputStream;

import java.io.*;
public class FileOutputStreamExample {
	public static void main(String args[]){
		try{
			FileOutputStream fout=new FileOutputStream("input.txt");
			String s="India is a vast South Asian country with diverse terrain – from Himalayan peaks to Indian Ocean coastline – and history reaching back 5 millennia. In the north, Mughal Empire landmarks include Delhi’s Red Fort complex, massive Jama Masjid mosque and Agra’s iconic Taj Mahal mausoleum. Pilgrims bathe in the Ganges in Varanasi, and Rishikesh is a yoga center and base for Himalayan trekking.";
			//Converting string to byte array
			byte b[]=s.getBytes();
			fout.write(b);
			fout.close();
			System.out.println("Success........");
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
}
