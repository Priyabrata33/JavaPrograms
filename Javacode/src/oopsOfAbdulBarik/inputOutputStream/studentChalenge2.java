package oopsOfAbdulBarik.inputOutputStream;

import java.io.*;

public class studentChalenge2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		try{
			FileInputStream fw2 = new FileInputStream("/Users/chinmayasahu/Desktop/java/fileprogram/source1.txt");
			FileInputStream fw3 = new FileInputStream("/Users/chinmayasahu/Desktop/java/fileprogram/source2.txt");
			FileOutputStream fw4 = new FileOutputStream("/Users/chinmayasahu/Desktop/java/fileprogram/source3.txt");
			
			SequenceInputStream sis = new SequenceInputStream(fw2,fw3);   //to get the sequence one after another
			
			int b =0;
			while((b =sis.read())!=-1) {	
				fw4.write(b);
			}sis.close();
			
			
		fw2.close(); 
		fw3.close();
		
		fw4.close();
			
		}catch(FileNotFoundException e) {
			System.out.println(e);
		}

	}

}
