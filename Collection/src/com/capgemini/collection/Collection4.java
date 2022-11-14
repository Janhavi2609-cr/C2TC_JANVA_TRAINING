//program to demonstrate arraylist

package com.capgemini.collection;

import java.util.ArrayList;
//import java.util.List;

public class Collection4 {
	public static void main(String[] args) {
		
		ArrayList<String> obj = new ArrayList<String>();
		
		obj.add("Dhoni");	//0
		obj.add("Virat");	//1
		obj.add("Rohit");	//2
		obj.add("Yuvraj");	//3
		obj.add("Surya");	//4
		
		//display
		System.out.println(obj);
	
		obj.add("Hardik");
		System.out.println(obj);
		
		obj.add("Arshadeep");
		System.out.println(obj);
		
		//add element in between 
		obj.add(5, "Dhawannn");
		System.out.println(obj);
		
		//modify the list obj.set(index, Object element)
		obj.set(5,  "Dhawan");
		System.out.println(obj);
		
		//to find the element in the list
		//obj.indexOf("Hardik");
		System.out.println(obj.indexOf("Arshadeep"));
		
		//search the element in the list
		System.out.println(obj.get(0));
		
		//returns the hash code of the list
		System.out.println(obj.hashCode());
		
		//returns the shallow copy of arraylist
		System.out.println(obj.clone());
		
		System.out.println(obj);
	}
	
	
	
	
}
