package forLoop;

public class Continue {

	public static void main(String[] args) {
		for(int i = 1; i<=100 ;i++) {
			if (i >= 30 && i <= 50) {
				continue;
			}
			
			System.out.println(i);
		}
	}

}
