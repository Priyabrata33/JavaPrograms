package ExceptionHandling;

public class MultipleAndNestedTryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int arr[] = {20,30,7,0,10};
		
		try {
			int c = arr[0]/arr[4];
			System.out.println("Ans = " +c);
			
			System.out.println(arr[5]);
			
		}
		catch(ArithmeticException e) {
			System.out.println("Dinominator can not be zero, Check the index");
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		
		System.out.println("Be focused");
		
		
		
		try {
			int c = arr[0]/arr[4];
			System.out.println("Division" +c);
			
			try {
				System.out.println(arr[10]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Enter the perfect index with in the element");
			}
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		
		System.out.println("Go with the flow");
		
			
		
		
	}

}
