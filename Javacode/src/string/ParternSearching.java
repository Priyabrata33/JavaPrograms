package string;

public class ParternSearching {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "abcabcbabc";
		
		String t = "abc";
		
//		int spoint = 0, tPoint = 0;
//		int ans = 0;
//		
//		for(int i = 0;i<=s.length()-t.length();i++) {							//the NAIVE Algorithm
//			int j;
//			
//			for(j=0;j<t.length();j++) {
//				if(t.charAt(j)!=s.charAt(i+j))
//					break;
//			}
//			
//				if(j==t.length())
//					System.out.print(i+" ");
//			
//		}
		
		
		// RABIN KARP Algorithm 
		
		 int p = 0,win = 0;
			for(int i=0;i<t.length();i++) {
				p+=(t.charAt(i)-'a'+1);
				win+=(s.charAt(i)-'a'+1);
			}
		
	
		
		if(win==p) {
			boolean ans = check(s,0,t);
			
			if(ans==true)
				System.out.print(0+" ");
		}
		
		
		
		
		
		
		
		for(int i=1;i<=s.length()-t.length();i++) {

			int h = hash(s,i,t.length(),win);
			
			win = h;
			if(h==p) {
				boolean ans = check(s,i,t);
				
				if(ans==true)
					System.out.print(i+" ");
			}
			
		}
		
		
		
		
	}
	
	private static boolean check(String s, int i, String t) {
		int m = 0;
		for(int j=i;j<i+t.length();j++) {
			
			if(s.charAt(j)!=t.charAt(m++))
				return false;
		}
		return true;
	}
	
	
	
	

	public static int hash(String s,int ind1,int size,int prev) {
		return ((s.charAt(ind1+size-1)-'a'+1)+prev-(s.charAt(ind1-1)-'a'+1));
	}

}
