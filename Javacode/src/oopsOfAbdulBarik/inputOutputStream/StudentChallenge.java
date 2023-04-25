package oopsOfAbdulBarik.inputOutputStream;

import java.io.*;
import java.util.Scanner;

public class StudentChallenge {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		
		//Scanner sc = new Scanner(System.in);
		
//		try( FileWriter fw = new FileWriter("/Users/chinmayasahu/Desktop/java/fileprogram/source1.txt")){
//			
//			System.out.println("Enter the string in capital: ");
//			String str = sc.nextLine();
//			
//			
//			fw.write(str);
//			fw.close();
//		}
		
		try(FileReader fr = new FileReader("/Users/chinmayasahu/Desktop/java/fileprogram/source1.txt")){
			
			FileWriter fw1 = new FileWriter("/Users/chinmayasahu/Desktop/java/fileprogram/source2.txt");
			
			int x;
				while((x = fr.read())!=-1) {
					
					if(x>=65&&x<=95)
						fw1.write(x+32);
					else
						fw1.write(x);
				}
				
				fr.close();
				fw1.close();
			
		}
		
		

	}

}
