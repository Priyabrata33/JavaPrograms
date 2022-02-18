package practice;

public class efficientSolutionOfLCM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =12, b=15;
		
		int ans = lcm(a,b);
		System.out.println(ans);
	}
	
	public static int gcd(int a, int b) {
		if(b==0)
			return a;
		else return gcd(b, a%b);
	}
	public static int lcm(int a,int b) {
		return (a*b)/gcd(a,b);
	}

}
