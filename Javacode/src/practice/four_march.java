package practice;

public class four_march {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total = 0;;
		for(int i=1;i<=33;i++) {
			for(int j=1;j<=i;j++) {
				total = total + j;
			}
		}
		System.out.println(total);

	}

}
