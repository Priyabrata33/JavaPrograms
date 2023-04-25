package map;

public class checktheNumberOfDistinctElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int nums[]= {10,11,12};
		int count=nums.length;
		for(int i=0;i<nums.length;i++) {
			//boolean flag = false;
			//count++;
			for(int j=i+1;j<nums.length;j++) {
				if(nums[i]==nums[j]) {
					count--;
					break;
				}
				
				
			}
			
		}
		
		System.out.println(count);

	}

}
