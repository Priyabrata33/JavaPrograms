package GFG;

public class MximumElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {8,3,4,8,8};
		
		int  ans = 0;
		int mejority =0;
		int index = -1;
		
		for(int i=0;i<arr.length;i++) {
			
			int count =1;
			int ele =arr[i];
			
			for(int j=i+1;j<arr.length;j++){
				
				if(ele==arr[j]) {
					count++;
					
					System.out.println(ele);
					 index = j;
					
				}
				
				
				if(count>arr.length/2)
					 mejority = count;
				else if (count<arr.length)
					mejority = -1;
				
				
			
			
			}
			
			
			ans = Math.max(ans, mejority);
			
			
			
		}
		
		System.out.println(index);
		System.out.println(ans);

	}

}
