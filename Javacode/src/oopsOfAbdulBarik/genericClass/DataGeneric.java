package oopsOfAbdulBarik.genericClass;

import java.util.Arrays;

class Data<T>{							//we have to write <T>  this is for the data only nxt we have to discuss the array type
	private T obj;
	
	public void setData(T v) {
		obj =v;
	}
	
	public T getData(){
		return obj;
	}
}

class DataArray <T>{
	
	 T[] oba = (T[])new Object[10];
	 int length =0;
	 
	 public void append(T s) {
		 oba[length++] = s;
	 }
	 
	 public void display() {
		 System.out.println(Arrays.toString(oba));
	 }
	 
}




public class DataGeneric {

	public static void main(String args[]) {
		
		Data <Integer> d = new Data<>();
		d.setData(10);
		System.out.println(d.getData());
		
		
		DataArray<Integer> dA = new DataArray<>();
		dA.append(10);
		dA.append(11);
		dA.append(12);
		dA.append(13);
		dA.append(14);
		dA.append(15);
		dA.append(16);
		dA.append(17);
		
		dA.display();
	}
}
