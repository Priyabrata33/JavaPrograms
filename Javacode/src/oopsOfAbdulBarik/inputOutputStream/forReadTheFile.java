package oopsOfAbdulBarik.inputOutputStream;

import java.io.*;

public class forReadTheFile {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try (FileInputStream fis = new FileInputStream("/Users/chinmayasahu/Desktop/java/fileprogram/text1.txt")){
			
			
			byte[] b  = new byte[fis.available()];
			//fis.read(b);
			
//			String str = new String(b);
//			
//			System.out.println(str);
			
			int x;
			do {
				
				x = fis.read();
				
				if(x!=-1)
					System.out.print((char)x);
				
			}while(x!=-1);
			
			fis.close();
			
		}
//		catch(FileNotFoundException e) {
//			System.out.println(e);
//		}
//		catch(IOException e) {
//			System.out.println(e);
//		}

	}

}
