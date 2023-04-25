package oopsOfAbdulBarik.inputOutputStream;
import java.io.*;
import java.util.*;


public class writeInIT {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try (FileOutputStream fos = new FileOutputStream("/Users/chinmayasahu/Desktop/java/fileprogram/text3.txt")){
			
			
			
			//for the path u have to use the path address ass the parameter of the FIlwOutputStream
			
			
			String str = "Hello EveryOne for the programming";
			
			//for the byte thing we use getByte method to change the string to find the byte things
			
			byte[] b = str.getBytes();
			
			String check= "abcdefghijklmnopqrstuvwxyz   ABCDEFGHIJKLMNOPQRSTUVWXYZ";
			byte[] m = check.getBytes();
			System.out.println(Arrays.toString(b));
			
			System.out.println(Arrays.toString(m));
			
//			for(int s:b)
//				fos.write(s);
			fos.write(b, 6, b.length-6);
			
			
			fos.close();
			
		}
//		catch(FileNotFoundException e) {
//			System.out.println(e);
//		}
//		catch(IOException e) {						//by throws exception you don't have to write the catch element here for the exception 
//			System.out.println(e);
//		}

	}

}
