package nestedIf;

public class NestedIf {

	public static void main(String[] args) {
		
		int a=3, b=5 , c=20;
		
		int result =0;
		
		if (a>b) {
			if (a>c) {
				result = a;
			}else {
				result = c;
			}
		}else {
			if(b>c) {
				result = b;
			}else {
				result = c;
				
			}
			
		}
		
		System.out.println("largest of the numbers " +result);
		
	}
}


