package practice;


public class Contest75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int start = 10; 
		int goal =82;
		 String b = Integer.toBinaryString(start);
	        
	        System.out.println(b);
	        
	        String ch = Integer.toBinaryString(goal);
	        
	        System.out.println(b.length());
	        System.out.println(ch);
	        
	        int count = 0;
	        int forb = b.length()-1;
        	int  forch = ch.length()-1;
	        
	        while(true) {
	        	
	        	if(forch<0 || forb<0)
	        		break;
	        	
	        	if (ch.charAt(forch)!=b.charAt(forb))
	        		count++;
	        	System.out.println(count);
	        	forch--;
	        	forb--;
	        	
	        }
	        
	        
	        System.out.println(count);
	}

}
