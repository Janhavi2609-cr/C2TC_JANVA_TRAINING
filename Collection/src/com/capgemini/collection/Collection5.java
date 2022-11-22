//iterators

package com.capgemini.collection;

import java.util.Iterator;
import java.util.LinkedList;


public class Collection5 {
	
	void display(LinkedList<String> list) {
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {	//will iterate till the last element pof the list
			System.out.println("Player name is: " +it.next()); 
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> obj = new LinkedList<String>();
		
		obj.add("Dhoni");	
		obj.add("Virat");	
		obj.add("Rohit");
		obj.add("Yuvraj");
		obj.add("Surya");
		
		System.out.println(obj);
		
		//Iterator<String> it = obj.iterator();
		
		//next: 
		//System.out.println(it.next());
		Collection5 c = new Collection5();
		c.display(obj);
		
	}

}
