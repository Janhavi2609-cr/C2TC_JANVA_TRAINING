//program to demonstrate linked list

package com.capgemini.collection;

import java.util.LinkedList;
public class Collection3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> obj = new LinkedList<String>();
		
		obj.add("Dhoni");	//0
		obj.add("Virat");	//1
		obj.add("Rohit");
		obj.add("Yuvraj");
		obj.add("Surya");
		
		//display
		System.out.println(obj);
		
		//obj.remove();
		/*System.out.println(obj.remove());
		System.out.println(obj.remove());
		System.out.println(obj);
		//addition of the object*/
		obj.add("Hardik");
		System.out.println(obj);
		
		//add element to first and last position
		obj.addFirst("Pant");
		obj.addLast("KL");
		System.out.println(obj);
		
		//add element in between 
		obj.add(2, "Bumrahhhh");
		System.out.println(obj);
		
		//modify the list obj.set(index, Object element)
		obj.set(2,  "Bumrah");
		System.out.println(obj);
		
		//to find the element in the list
		//obj.indexOf("Hardik");
		System.out.println(obj.indexOf("Hardik"));
		
		//search the element in the list
		System.out.println(obj.get(2));
		
		//returns the head of the list
		System.out.println(obj.peek());
		
		//returns the last element of the list
		System.out.println(obj.peekLast());
		
		//returns  the first element and returns null if list is empty
		System.out.println(obj.peekFirst());
		
		//System.out.println(obj.poll());
	}

}
