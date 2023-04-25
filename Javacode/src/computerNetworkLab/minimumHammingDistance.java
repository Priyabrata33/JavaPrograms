package computerNetworkLab;
import java.util.*;

public class minimumHammingDistance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the String bits for the DATAWORD : ");
		String dataword = sc.nextLine();
		
		System.out.println("Enter the String bitts for the CODEWORD");
		String codeword = sc.nextLine();
		
		int count = 0;
		
		for(int i=0;i<dataword.length();i++) {
			
				if(codeword.charAt(i)!=dataword.charAt(i))
					count++;
			
		}
		
		
		System.out.println("Minimum hamming distance is : " +count );
		
		
	}

}