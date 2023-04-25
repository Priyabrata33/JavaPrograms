package oopsOfAbdulBarik.inputOutputStream;
import java.io.*;
import java.util.Arrays;

public class BufferedStream {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		FileInputStream  fis  = new FileInputStream("/Users/chinmayasahu/Desktop/java/fileprogram/source1.txt");
		
		//byte[] b = new byte[fis.available()];
		
//		int x = 0;
//		while((x=fis.read())!=-1) {
//			
//			System.out.print((char)x);
//			
//		}
		FileOutputStream fos  = new FileOutputStream("/Users/chinmayasahu/Desktop/java/fileprogram/text1.txt");
		
		BufferedOutputStream bos =new  BufferedOutputStream(fos);
		
		BufferedInputStream bis = new BufferedInputStream(fis);
		
			byte[] b = bis.readAllBytes();
			System.out.println(Arrays.toString(b));
			
		//int x;
			
//		while((x  = bis.read())!=-1)
//			System.out.print((char)x);
//		
		
		bos.write(b);
		bos.flush();
			
		
		
	}

}
