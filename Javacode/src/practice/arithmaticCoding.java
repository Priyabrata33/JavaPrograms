package practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class proba implements Comparator{
	double probability;
	String index;
	
	proba(String index,double probability){
		this.index = index;
		this.probability = probability;
		
	}
	
	public double getProbability(){
		return probability;
	}
public String getChar() {
	return index;
} 
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		double p1 = ((proba) o1).getProbability();
		double p2 = ((proba) o2).getProbability();
		
		if (p1 > p2) {
	           return -1;
	       } else if (p1 < p2){
	           return 1;
	       } else {
	           return 0;
	       }
	}
}











public class arithmaticCoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number of probability");
		int n = sc.nextInt();
		
		proba p[] = new proba[n];
		
		for(int i=0;i<n;i++) {
			System.out.println("enter your probabilities");
			String index = sc.next();
			double prob = sc.nextDouble();
			
			p[i] = new proba(index,prob);
		}
		
		
		System.out.println("The probabilities are: ");
		for(int i=0;i<n;i++) {
			System.out.println(p[i].getChar()+" "+p[i].getProbability());
		}
		
		System.out.println("Enter the word to calculate: ");
	String word = "";
	word = sc.next();
		
		
	

	}

}
