package heap;
import java.util.*;
import java.util.Map.Entry;

public class sortCharacterByFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s ="Aabb";
		Map<Character,Integer> mp = new HashMap<>();
		
        for(int i=0;i<s.length();i++){
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i), 0)+1);
        }
        
        
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>(Collections.reverseOrder((a,b)->a.getValue()-b.getValue()));
        
        for(var m:mp.entrySet()) {
        	pq.add(m);
        }

        String ans = "";
        
        System.out.println(pq);
        
        int n = pq.size();
        for(int i = 0 ; i < n;i++) {
        	char temp = pq.peek().getKey();
        	int t = pq.poll().getValue();
        	for(int j=0;j<t;j++) {
        		ans = ans + temp;
        	}
        	
        }
        
        System.out.println(ans);
	}
	

}
