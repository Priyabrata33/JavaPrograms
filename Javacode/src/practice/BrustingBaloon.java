package practice;

public class BrustingBaloon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] nums = {3,1};
		
		if(nums.length<=2) nums[2]= 1;
		int sum = nums[0]*nums[1]*nums[2];
		
		System.out.println(sum);

	}

}
