package practice;

import java.util.Arrays;
import java.util.Scanner;

public class block_truncation_Coding {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the row and column: ");
		int m =4;//sc.nextInt();
		int n  =4;//sc.nextInt();
		
		System.out.println("enter the "+ m*n +" elements: ");
		int[][] mat = {{65, 75, 80, 70}, {72, 75, 82, 68}, {84, 72, 62, 65}, {66, 68, 72, 80}};
		
//		for(int i=0;i<m;i++) {
//			for(int j=0;j<n;j++) {
//				mat[i][j] = sc.nextInt();
//			}
//		}
		
		
		System.out.println(Arrays.deepToString(mat));
		int matVal = m*n;
		
		
		double mean = 0;
		double meanSquare = 0;
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				mean += mat[i][j];
			}
			
		}
		
		mean = mean/16;   // calculating the mean;
		
		System.out.println("mean:  "+mean);
		

		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				meanSquare += (mat[i][j] *mat[i][j]);
			}
			
		}
		meanSquare = meanSquare/16;
		System.out.println("mean Square:  "+meanSquare);
		
		
		double varience  = Math.sqrt(meanSquare -  Math.pow(mean,2));
		System.out.println("Varience: "+varience);
		
		
		
		int[][] binaryMatrix = new int[m][n];
		
		for(int i=0;i<m;i++) {		//forming the binary matrix
			for(int j=0;j<n;j++) {
				if(mat[i][j]>mean) binaryMatrix[i][j] = 1;
				else binaryMatrix[i][j] = 0;
			}
		}
		
		System.out.println("binary Matrix is:"+Arrays.deepToString(binaryMatrix));
		
		
		int q = 0;
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(binaryMatrix[i][j]==1) q++;
			}
			
		}
		
		System.out.println("q: "+q);
		
		
		//Main Formula
		double t = Math.sqrt((q/((matVal-q)*1.0)));
		System.out.println("t: " +t);
		
		
		//for a and b
	double a = (mean-(varience*t));
	double b  =(mean+(varience *(1/t)));
	
	a = Math.round(a);
	b = Math.round(b);
		System.out.println("a:" +a+ "\n" + "b: " +b );
		
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				if(binaryMatrix[i][j]==1) binaryMatrix[i][j] = (int)b ;
				else binaryMatrix[i][j] = (int)a;
			}
			
		}
		
		System.out.println("Ans: "+Arrays.deepToString(binaryMatrix));
		
		
		int[][] ans = binaryMatrix;
		
		//PSNR
		// mean square error
		double MSE = 0;
		for(int i=0;i<m;i++) {
			for(int j =0;j<n;j++) {
				MSE += Math.pow( mat[i][j] - ans[i][j] , 2); 
			}
		}
		
		MSE = MSE/16;
		
		System.out.println("MSE:" +MSE);
		
		double c = Math.pow((Math.pow(2, 4)-1),2);
		
		double PSNR = 10 *(Math.log10(c/MSE));
		
		System.out.println("PSNR: "+PSNR);
	}

}
