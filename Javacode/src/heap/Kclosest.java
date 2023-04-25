//package heap;
//
//
//import java.util.*;
//
//class Pair{
//	Integer key;
//	Integer value;
//	
//	public Pair(Integer key,Integer value){
//		this.key = key;
//		this.value = value;
//	}
//	
//	public Integer getKey() {
//		return key;
//	}
//	public Integer getValue() {
//		return value;
//	}
//	public void setValue(Integer value) {
//		this.value = value;
//	}
//	public void setKey(Integer key) {
//		this.key = key;
//	}
//}
//public class Kclosest {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//		
//		int[] ar = {5,6,7,8,9};
//		
//		int x  = 7;	//the value which input we wANt
//		
//		int k = 3;
//		
//		   PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>(){
//                	   public int compare(Pair p1, Pair p2)
//                	   {
//                		   return p2.getKey()-p1.getKey();
//                	   }
//                   });
//		
//		
//		for(int i = 0 ; i<ar.length;i++) {
//			
//			pq.add(new Pair(Math.abs(ar[i]-x),ar[i]));
//			
//			if(pq.size()>k) {
//			pq.poll();
//				}
//		}
//		
//		for(Pair t:pq) {
//			System.out.println(t.getKey()+" "+t.getValue());
//		}
//		
//		
////		for(int i =0;i<pq.size();i++) {			
////			System.out.println(pq.poll().getValue());
////		}
////		
//		
//		System.out.println();
//		
//		PriorityQueue<Pair> pt = new PriorityQueue<>(Collections.reverseOrder(new Comparator<Pair>(){
//     	   public int compare(Pair p1, Pair p2)
//     	   	{
//     		   return p2.getKey()-p1.getKey();
//     	   		}
//			}));
//
//
//						for(int i = 0 ; i<ar.length;i++) {
//							
//							pt.add(new Pair(Math.abs(ar[i]-x),ar[i]));
//							
//							if(pt.size()>k) {
//								pq.poll();
//								}
//						}
//						
//						for(Pair t:pt) {
//							System.out.println(t.getKey()+" "+t.getValue());
//						}
//		
//		
//	}
//
//}
