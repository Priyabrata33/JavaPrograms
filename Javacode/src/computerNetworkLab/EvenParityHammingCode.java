package computerNetworkLab;
import java.util.*;

public class EvenParityHammingCode {

	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("Enter the code bits :");
		String dataword = sc.nextLine();
		
		int count = 0;
		
		for(int i=0;i<dataword.length();i++) {
			if(dataword.charAt(i)=='1') {
				count++;
			}
		}
		
		if(count%2!=0) {
			dataword = dataword.concat("1");
		}
		
		System.out.println("the encoded code is : "+dataword);
		
	}
	
}
