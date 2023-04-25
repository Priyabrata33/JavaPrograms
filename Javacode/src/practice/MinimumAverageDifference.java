package practice;

public class MinimumAverageDifference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,5,3,9,5,3};
		
		int[] pre = new int[nums.length];
        int[] suf = new int [nums.length];
        pre[0]  = nums[0];
        suf[nums.length-1] = nums[nums.length-1];
        
        for(int i= 1;i<nums.length;i++){
            pre[i] = pre[i-1]+nums[i];
        }
        for(int i =nums.length-2;i>=0;i--){
            suf[i] =  suf[i+1] +  nums[i];
        }
        
     
        int ans = Integer.MAX_VALUE;
        int res =0;
        
        for(int i=0;i<nums.length;i++){
             int sub =0;
            if(i==nums.length-1) sub = suf[0]/nums.length;
            else
                 sub = Math.abs((pre[i]/i+1)-suf[i+1]/(nums.length-(i+1)));
            
            if(sub<ans) res = i;
            ans=Math.min(ans,sub);
            System.out.println(res);
           
        }
        
        

	}

}
