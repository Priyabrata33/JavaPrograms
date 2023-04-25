package practice;
import java.util.*;
public class maximumPopulation1854 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
		
		
				int[] arr = new int[101];
		
        
        for(int i=0;i<logs.length;i++){
            for(int j=logs[i][0];j<logs[i][1];j++){
                arr[j-1950]++;
            }
        }
        
        
        System.out.println(Arrays.toString(arr));
        
        int max =0,year=1950;
        
        for(int i=0;i<101;i++) {
        	if(arr[i]>max) {
        		max = arr[i];
        		year = i + 1950;
        	}
        }
        
        System.out.println(year);
        
	}

}
