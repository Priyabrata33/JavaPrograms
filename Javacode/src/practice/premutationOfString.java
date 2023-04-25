package practice;

public class premutationOfString {

	public static void main(String[] args) {
		
		String str = "ABC";
		swap(str.charAt(1),str.charAt(2));
		
		int i =0;
		permute(str,i);

	}

	public static void permute(String str, int i) {
		
		if(i==str.length()-1) {
			
			System.out.println(str);
			return;
		}
		
		for(int j=i;j<=str.length()-1;j++) {
			swap(str.charAt(i),str.charAt(j));
			permute(str,i+1);
			
			
		}
	}
	public static void swap(char a,char b) {
		char temp = a;
		a=b;
		b=temp;
	}

}
