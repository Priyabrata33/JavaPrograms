package practice;


public class addsuarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {9,9,9,9,9,9,9,9,9,9};
		long x =0;
        for(int i =0;i<num.length;i++){
          x = x*10 +num[i]; 
        }
        int k=1;
        long sum = x + k;
        System.out.println(x);
        
	}

}