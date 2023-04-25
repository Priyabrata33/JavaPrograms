package practice;

public class weeklycont1 {

	public static void main(String[] args) {
		int num =1800;
		int n=num;
		// TODO Auto-generated method stub
		int res = 0;
        
        while(num!=0){
        	
            int rem = num%10;
                res = res*10 + rem;
                num/=10;
        }
		
		System.out.println(res);
		boolean ans = false;
		
		//if (num!=res) ans = true;
        
       
        
        int res2 =0;
        
        while(res!=0){
            int rem= res %10;
                res2 = res2*10 + rem;
                res/=10;
        }
        
        if (n==res2) { 
        	ans = true;
        }
        
       //  return ans;
        System.out.println(ans);
        System.out.println(n);
        
        System.out.println(res2);
		
	}
        

}
