package sorting;

public class BubbleSort2 {

	public static void main(String[] args) {


			
				int a[] = {1, 5, -9, -4, 4, 2, -1};
				
				int n  = a.length;
				for (int i = 0; i< n-1; i++) {
					
					boolean sorted = true; //we use it bcoz that the loop doesnt know if the array is sorted before or not if it's sorted then we dont use the for loop for saving the run time and the less memory use
					
					
					
					for (int j = 0; j<n-1-i; j++) {				//we use  j = n - 1 - i......for small running time and all 
						
						//if (a[j+1] > a[j]){ 				//Ascending
						
						
						
						 		
						
						
						if (a[j+1] < a[j]) {				//descending
							
							int temp = a[j+1];
							a[j+1] = a[j];
							a[j] = temp;
							
							sorted = false;
							
						}
					}
					
					if (sorted) break;
				}
				
				for (int item: a) {
					System.out.print(item + " ");
				}
				
				System.out.println("\n"+a.length);
				
			}

		

	

}
