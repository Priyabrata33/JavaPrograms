package GFG;

public class allDevisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nums =30;
		int i;
		for( i=1; i*i<nums;i++) {
			if(nums%i==0) {
				System.out.println(i);
			}
		}
		for( ;i>=1;i--) {
			if(nums%i==0)
			System.out.println(nums/i);
		}

	}
	
	

}
