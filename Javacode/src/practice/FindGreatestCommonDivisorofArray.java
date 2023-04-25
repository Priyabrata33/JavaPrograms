package practice;

public class FindGreatestCommonDivisorofArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {7,5,6,8,3};
		int ans = findGCD(nums);
		System.out.println(ans);

	}
	static int findGCD(int[] nums) {
		int small = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        
        for(int i =0;i<nums.length;i++){
            if(nums[i]>max) max = nums[i];
            if(nums[i]<small) small= nums[i];
        }
       // System.out.println(small);
        //System.out.println(max);
        int res = small;
        while(small!=max){
            if(small>max)
                small = small-max;
            else
                max = max-small;
        }
        
        return small;
	}

}
