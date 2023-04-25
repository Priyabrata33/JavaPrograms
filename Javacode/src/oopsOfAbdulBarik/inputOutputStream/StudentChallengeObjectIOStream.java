package oopsOfAbdulBarik.inputOutputStream;
import java.io.*;
import java.util.*;

//class forMyException extends FileNotFoundException{
//	
//	@Override
//	public String toString() {
//		return "file not Found Bcare";
//	}
//}

public class StudentChallengeObjectIOStream {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number float you ant to store");
		int n = sc.nextInt();
		float list[]  = new float[n];
		
		for(int i = 0 ; i <n;i++) {
			list[i] = sc.nextFloat();
		}
		System.out.println(Arrays.toString(list));
		
		try {
		
		FileOutputStream fos = new FileOutputStream("/Users/chinmayasahu/Desktop/java/fileprogram/data.txt");
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeInt(n);
		
		for(float i:list) {
			dos.writeFloat(i);
		}
		
		dos.close();
		fos.close();
		
		
		}catch(Exception e) {}
		*/
		
	
		
		DataInputStream dis = new DataInputStream(new  FileInputStream("/Users/chinmayasahu/Desktop/java/fileprogram/data.txt"));
		
		float x;
		System.out.println(dis.readInt());
		while((x=dis.readFloat())!=-1) {
			System.out.println(x);
		}
		
		dis.close();
		

	}

}
