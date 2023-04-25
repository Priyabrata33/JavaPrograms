package practice;

import java.util.Arrays;

public class DefusetheBomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] code = {5,7,1,4,8};
		int k  =3;
		
		
int[] ans = new int[code.length];
        
        if (k==0){
            System.out.println(ans);
        }
        
        if(k>0){
            for(int i=0;i<code.length;i++){
            		int add = 0;
                
                    int left = i+1;
                    int right = (i+k);
                    
                    while(left<=right) {
                    	add+=code[left];
                    	left++;
                   
                    }
                 
                
                ans[i] = add;
                System.out.println(Arrays.toString(ans));
                
            }
            System.out.println(Arrays.toString(ans));
        }

	}

}
