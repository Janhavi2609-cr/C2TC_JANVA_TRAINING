//program to demonstrate linked list

package com.capgemini.collection;

import java.util.LinkedList;
public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> obj = new LinkedList<String>();
		
		obj.add("Dhoni");
		obj.add("Virat");
		obj.add("Rohit");
		obj.add("Yuvraj");
		obj.add("Surya");
		System.out.println(obj);
		
	
		obj.remove();
		System.out.println(obj);
		
		obj.add("Hardik");
		System.out.println(obj);
	}

}
