package stack.stackArray;
import java.util.*;


public class getMinQ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] tokens = {"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
		
		
		 Stack<Integer> opnd = new Stack<>();
	        
	       for(String op : tokens){
	    	   
	    	  
	           
	           if(op == "+" || op == "-" || op == "/" || op == "*") {
	        	   
	        	   int x = opnd.pop();
	               int y = opnd.pop();
	               
	               if(op== "+")
	                   opnd.push(x+y);
	               
	                else if(op=="-")
	                  opnd.push(y-x);
	               
	                  else if(op=="*")
	                   opnd.push(x*y);
	               
	                 else  if(op== "/")
	                   opnd.push(y/x);
	           }
	        else{
	               opnd.push(Integer.parseInt(op));
	               
	           }
	           
	           System.out.println(opnd);
	       }
	        
	        System.out.println(opnd.peek());
		

	}
	
	
	

}
