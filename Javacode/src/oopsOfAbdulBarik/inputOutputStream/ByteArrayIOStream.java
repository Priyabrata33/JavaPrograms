package oopsOfAbdulBarik.inputOutputStream;
import java.io.*;
import java.util.Arrays;

public class ByteArrayIOStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		FileInputStream fis = new FileInputStream("/Users/chinmayasahu/Desktop/java/fileprogram/source1.txt");
		byte[] b = new byte[fis.available()];
		
		fis.read(b);
		System.out.println(Arrays.toString(b));
		//byte[] b = {'a','b','c'};
		
		
		ByteArrayInputStream bis = new ByteArrayInputStream(b);
		System.out.println(bis.markSupported());
		
		
		String str = new String(bis.readAllBytes());
		
		ByteArrayOutputStream bos = new ByteArrayOutputStream(20);
		bos.write(b);
				
		bos.writeTo(new FileOutputStream("/Users/chinmayasahu/Desktop/java/fileprogram/source4.txt"));
		
		
		System.out.println(str);
		bis.close();

	}

}
