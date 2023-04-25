package sorting;

public class BubbleSort1 {

	public static void main(String[] args) {
		int a[] = {1, 5, -9, -4, 4, 8, 10};
		
		int n  = a.length;
		
		for (int i = 0; i< n-1; i++) {
			
			for (int j = 0; j<n-1; j++) {
				
				//if (a[j+1] > a[j]){ 				//Ascending
				
				if (a[j+1] < a[j]) {				//descending
					
					int temp = a[j+1];
					a[j+1] = a[j];
					a[j] = temp;
					
				}
			}
		}
		
		for (int item: a) {
			System.out.print(item + " ");
		}
		
	}

}
